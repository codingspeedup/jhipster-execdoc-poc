package io.github.codingspeedup.execdoc.poc.jhipster.blueprint;

import io.github.codingspeedup.execdoc.blueprint.master.BlueprintMaster;
import io.github.codingspeedup.execdoc.blueprint.master.sheets.core.L10nSheet;
import io.github.codingspeedup.execdoc.blueprint.master.sheets.core.SystemSheet;
import io.github.codingspeedup.execdoc.poc.jhipster.blueprint.sheets.*;

import java.io.File;

/**
 * https://www.jhipster.tech/jdl/intro
 */
public class JHipsterMaster extends BlueprintMaster {

    public JHipsterMaster(File file) {
        super(file);
    }

    @Override
    protected void registerSheets() {
        registerSheet(UtilitySheet.class);
        registerSheet(SystemSheet.class);
        registerSheet(AppSheet.class);
        registerSheet(L10nSheet.class);
        registerSheet(ControllerMethodsSheet.class);
        registerSheet(DtoSheet.class);
        registerSheet(EnumsSheet.class);
        registerSheet(ServiceMethodsSheet.class);
        registerSheet(EntitySheet.class);
    }

}
