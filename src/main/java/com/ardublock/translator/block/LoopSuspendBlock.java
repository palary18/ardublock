package com.ardublock.translator.block;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.exception.SocketNullException;

public class LoopSuspendBlock extends TranslatorBlock
{

	protected LoopSuspendBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}

	public String toCode() throws SocketNullException
	{
		String ret = "\tsuspend( ";
		TranslatorBlock translatorBlock = this.getTranslatorBlockAtSocket(0);
		if (translatorBlock != null) {
			String name = translatorBlock.toCode().toString();
			if (name.equals("All")) {
				ret = "\tsuspendAll( ";
			}
			else {
				ret = "\tsuspendTask( " + name;
				ret = ret.replaceAll("\"", "");
			}
		}
		ret = ret + " );\n";
		return ret;
	}

}
