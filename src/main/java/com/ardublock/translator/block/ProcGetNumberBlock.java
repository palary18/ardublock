package com.ardublock.translator.block;

import com.ardublock.translator.Translator;

public class ProcGetNumberBlock extends TranslatorBlock
{
	protected ProcGetNumberBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}

	public String toCode()
	{
		return codePrefix + label + codeSuffix;
	}

}
