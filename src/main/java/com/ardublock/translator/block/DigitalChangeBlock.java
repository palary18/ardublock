package com.ardublock.translator.block;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.basic.ConstBlock;

public class DigitalChangeBlock extends ConstBlock
{

	protected DigitalChangeBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
		this.setCode("CHANGE");
	}
}
