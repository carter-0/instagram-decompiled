package com.instagram.direct.msys.plugins.msyssettingsplugin;

import X.C249553jy;
import X.C249563jz;

public final class MsysSettingsPluginSessionless extends Sessionless {
    public String MsysSettingsImpl_MsysCreateCopyOfStringSetting(String str, String str2) {
        String string;
        C249563jz r0 = C249553jy.A00;
        if (r0 == null || (string = r0.A00.getString(str, str2)) == null) {
            return str2;
        }
        return string;
    }

    public boolean MsysSettingsImpl_MsysReadBooleanSetting(String str, boolean z) {
        C249563jz r0 = C249553jy.A00;
        if (r0 != null) {
            return r0.A00.getBoolean(str, z);
        }
        return z;
    }

    public double MsysSettingsImpl_MsysReadDoubleSetting(String str, double d) {
        throw new RuntimeException("Not implemented");
    }

    public int MsysSettingsImpl_MsysReadInt32Setting(String str, int i) {
        C249563jz r0 = C249553jy.A00;
        if (r0 == null) {
            return i;
        }
        return (int) r0.A00.getLong(str, (long) i);
    }

    public long MsysSettingsImpl_MsysReadInt64Setting(String str, long j) {
        C249563jz r0 = C249553jy.A00;
        if (r0 != null) {
            return r0.A00.getLong(str, j);
        }
        return j;
    }

    public boolean MsysSettingsImpl_MsysReadSettingIsNull(String str) {
        C249563jz r0 = C249553jy.A00;
        if (r0 != null) {
            return !r0.A00.contains(str);
        }
        return true;
    }

    public void MsysSettingsImpl_MsysRemoveSetting(String str) {
        C249563jz r0 = C249553jy.A00;
        if (r0 != null) {
            r0.A00.edit().remove(str).apply();
        }
    }

    public void MsysSettingsImpl_MsysWriteBooleanSetting(String str, boolean z) {
        C249563jz r0 = C249553jy.A00;
        if (r0 != null) {
            r0.A00.edit().putBoolean(str, z).apply();
        }
    }

    public void MsysSettingsImpl_MsysWriteDoubleSetting(String str, double d) {
        throw new RuntimeException("Not implemented");
    }

    public void MsysSettingsImpl_MsysWriteInt32Setting(String str, int i) {
        C249563jz r0 = C249553jy.A00;
        if (r0 != null) {
            r0.A00.edit().putLong(str, (long) i).apply();
        }
    }

    public void MsysSettingsImpl_MsysWriteInt64Setting(String str, long j) {
        C249563jz r0 = C249553jy.A00;
        if (r0 != null) {
            r0.A00.edit().putLong(str, j).apply();
        }
    }

    public void MsysSettingsImpl_MsysWriteStringSetting(String str, String str2) {
        C249563jz r0 = C249553jy.A00;
        if (r0 != null) {
            r0.A00.edit().putString(str, str2).apply();
        }
    }
}
