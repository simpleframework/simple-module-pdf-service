package net.simpleframework.module.pdf.impl;

import static net.simpleframework.common.I18n.$m;
import net.simpleframework.ctx.Module;
import net.simpleframework.ctx.service.io.AbstractIOModuleContext;
import net.simpleframework.module.pdf.IPDFContext;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
public class PDFContext extends AbstractIOModuleContext implements IPDFContext {

	@Override
	protected Module createModule() {
		return new Module().setName(MODULE_NAME).setText($m("PDFContext.0")).setOrder(38);
	}
}
