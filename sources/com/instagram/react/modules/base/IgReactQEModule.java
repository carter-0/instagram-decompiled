package com.instagram.react.modules.base;

import X.0Tu;
import X.0lg;
import X.183;
import X.1AV;
import X.C60400gq;
import X.C70298O1c;
import X.QZK;
import com.facebook.fbreact.specs.NativeIGReactQESpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "IGReactQE")
public class IgReactQEModule extends NativeIGReactQESpec {
    public static final int CONFIG_KEY_OFFSET = 12;
    public static final String MODULE_NAME = "IGReactQE";
    public final 0lg mSession;

    private String valueForDeviceConfiguration(String str, String str2, boolean z) {
        return null;
    }

    private String valueForUserConfiguration(String str, String str2, boolean z) {
        return null;
    }

    public String getName() {
        return "IGReactQE";
    }

    public boolean mobileConfigBooleanValueForDeviceConfiguration(double d, double d2, boolean z) {
        return mobileConfigBooleanValueForConfiguration((int) d, (int) d2, z, false);
    }

    public boolean mobileConfigBooleanValueForDeviceConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z) {
        return mobileConfigBooleanValueForDeviceConfiguration(d, d2, z);
    }

    public boolean mobileConfigBooleanValueForUserConfiguration(double d, double d2, boolean z) {
        return mobileConfigBooleanValueForConfiguration((int) d, (int) d2, z, true);
    }

    public boolean mobileConfigBooleanValueForUserConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z) {
        return mobileConfigBooleanValueForUserConfiguration(d, d2, z);
    }

    public Double mobileConfigDoubleValueForDeviceConfiguration(double d, double d2, boolean z) {
        return mobileConfigDoubleValueForConfiguration((int) d, (int) d2, z, false);
    }

    public Double mobileConfigDoubleValueForDeviceConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z) {
        return mobileConfigDoubleValueForDeviceConfiguration(d, d2, z);
    }

    public Double mobileConfigDoubleValueForUserConfiguration(double d, double d2, boolean z) {
        return mobileConfigDoubleValueForConfiguration((int) d, (int) d2, z, true);
    }

    public Double mobileConfigDoubleValueForUserConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z) {
        return mobileConfigDoubleValueForUserConfiguration(d, d2, z);
    }

    public Double mobileConfigIntegerValueForDeviceConfiguration(double d, double d2, boolean z) {
        return mobileConfigIntegerValueForConfiguration((int) d, (int) d2, z, false);
    }

    public Double mobileConfigIntegerValueForDeviceConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z) {
        return mobileConfigIntegerValueForDeviceConfiguration(d, d2, z);
    }

    public Double mobileConfigIntegerValueForUserConfiguration(double d, double d2, boolean z) {
        return mobileConfigIntegerValueForConfiguration((int) d, (int) d2, z, true);
    }

    public Double mobileConfigIntegerValueForUserConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z) {
        return mobileConfigIntegerValueForUserConfiguration(d, d2, z);
    }

    public String mobileConfigStringValueForDeviceConfiguration(double d, double d2, boolean z) {
        return mobileConfigStringValueForConfiguration((int) d, (int) d2, z, false);
    }

    public String mobileConfigStringValueForDeviceConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z) {
        return mobileConfigStringValueForDeviceConfiguration(d, d2, z);
    }

    public String mobileConfigStringValueForUserConfiguration(double d, double d2, boolean z) {
        return mobileConfigStringValueForConfiguration((int) d, (int) d2, z, true);
    }

    public String mobileConfigStringValueForUserConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z) {
        return mobileConfigStringValueForUserConfiguration(d, d2, z);
    }

    private C60400gq getMobileConfigContext(boolean z) {
        1AV A01;
        183 r1 = 183.A01;
        if (r1 == null) {
            return null;
        }
        if (z) {
            A01 = r1.A02(this.mSession);
        } else {
            A01 = r1.A01();
        }
        return A01.A01.A00;
    }

    private long getSpecifier(int i, int i2) {
        return C70298O1c.A00((i << 12) + i2);
    }

    public IgReactQEModule(QZK qzk, 0lg r2) {
        super(qzk);
        this.mSession = r2;
    }

    private boolean mobileConfigBooleanValueForConfiguration(int i, int i2, boolean z, boolean z2) {
        0Tu r0;
        C60400gq mobileConfigContext = getMobileConfigContext(z2);
        if (mobileConfigContext == null) {
            return false;
        }
        long A00 = C70298O1c.A00((i << 12) + i2);
        if (A00 == 0) {
            return false;
        }
        if (z) {
            r0 = 0Tu.A05;
        } else {
            r0 = 0Tu.A06;
        }
        return mobileConfigContext.Ah0(r0, A00);
    }

    private Double mobileConfigDoubleValueForConfiguration(int i, int i2, boolean z, boolean z2) {
        0Tu r0;
        C60400gq mobileConfigContext = getMobileConfigContext(z2);
        if (mobileConfigContext == null) {
            return null;
        }
        long A00 = C70298O1c.A00((i << 12) + i2);
        if (A00 == 0) {
            return null;
        }
        if (z) {
            r0 = 0Tu.A05;
        } else {
            r0 = 0Tu.A06;
        }
        return Double.valueOf(mobileConfigContext.Aym(r0, A00));
    }

    private Double mobileConfigIntegerValueForConfiguration(int i, int i2, boolean z, boolean z2) {
        0Tu r0;
        C60400gq mobileConfigContext = getMobileConfigContext(z2);
        if (mobileConfigContext == null) {
            return null;
        }
        long A00 = C70298O1c.A00((i << 12) + i2);
        if (A00 == 0) {
            return null;
        }
        if (z) {
            r0 = 0Tu.A05;
        } else {
            r0 = 0Tu.A06;
        }
        return Double.valueOf((double) mobileConfigContext.BOa(r0, A00));
    }

    private String mobileConfigStringValueForConfiguration(int i, int i2, boolean z, boolean z2) {
        0Tu r0;
        C60400gq mobileConfigContext = getMobileConfigContext(z2);
        if (mobileConfigContext == null) {
            return null;
        }
        long A00 = C70298O1c.A00((i << 12) + i2);
        if (A00 == 0) {
            return null;
        }
        if (z) {
            r0 = 0Tu.A05;
        } else {
            r0 = 0Tu.A06;
        }
        return mobileConfigContext.C1v(r0, A00);
    }

    public boolean booleanValueForDeviceConfiguration(String str, String str2, boolean z) {
        return false;
    }

    public boolean booleanValueForUserConfiguration(String str, String str2, boolean z) {
        return false;
    }

    public Double doubleValueForDeviceConfiguration(String str, String str2, boolean z) {
        return null;
    }

    public Double doubleValueForUserConfiguration(String str, String str2, boolean z) {
        return null;
    }

    public Double integerValueForDeviceConfiguration(String str, String str2, boolean z) {
        return null;
    }

    public Double integerValueForUserConfiguration(String str, String str2, boolean z) {
        return null;
    }

    public String stringValueForDeviceConfiguration(String str, String str2, boolean z) {
        return null;
    }

    public String stringValueForUserConfiguration(String str, String str2, boolean z) {
        return null;
    }
}
