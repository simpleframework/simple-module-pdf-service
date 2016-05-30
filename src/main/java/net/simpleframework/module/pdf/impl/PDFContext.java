package net.simpleframework.module.pdf.impl;

import static net.simpleframework.common.I18n.$m;

import net.simpleframework.ctx.AbstractModuleContext;
import net.simpleframework.ctx.Module;
import net.simpleframework.module.pdf.IPDFContext;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885) https://github.com/simpleframework
 *         http://www.simpleframework.net
 */
public class PDFContext extends AbstractModuleContext implements IPDFContext {

	@Override
	protected Module createModule() {
		return super.createModule().setName(MODULE_NAME).setText($m("PDFContext.0")).setOrder(38);
	}
}
