package com.facebook.msys.mcp.localizationplugin;

import X.DbU;
import X.Pxe;
import com.facebook.msys.mci.Localization;
import java.util.List;

public class MsysLocalizationPluginSessionless extends Sessionless {
    public String MsysLocalizationImpl_MsysLocalizationCopy(String str, String str2, List list) {
        String[] A1b;
        if (list == null) {
            A1b = new String[0];
        } else {
            A1b = DbU.A1b(list, list.size());
        }
        return Localization.getLocalizedString(str, str2, A1b);
    }

    public String MsysLocalizationImpl_MsysLocalizationCopyV2(long j, List list) {
        Object[] array;
        if (list == null) {
            array = Pxe.A1b();
        } else {
            array = list.toArray();
        }
        return Localization.getLocalizedStringV2(j, array);
    }
}
