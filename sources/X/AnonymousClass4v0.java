package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.zip.CRC32;

/* renamed from: X.4v0  reason: invalid class name */
public final class AnonymousClass4v0 implements TextWatcher {
    public static final AnonymousClass4v1 A05 = new AnonymousClass4v1();
    public final AnonymousClass4v3 A00;
    public final C60640iu A01;
    public final C277384v5 A02;
    public final AnonymousClass4v1 A03;
    public final String A04;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public static AnonymousClass4v0 A00(0lg r2) {
        return (AnonymousClass4v0) r2.A01(AnonymousClass4v0.class, new AnonymousClass4v2(r2));
    }

    public static void A01(AnonymousClass4v0 r11, Integer num, long j) {
        0xI r3;
        if (num == AnonymousClass05K.A00) {
            r11.A00.A03 = j;
        } else if (num == AnonymousClass05K.A01) {
            AnonymousClass4v3 r6 = r11.A00;
            String str = r11.A04;
            long j2 = j / 1000;
            long j3 = r6.A00;
            if (j2 > j3) {
                long j4 = j3 * 1000;
                r6.A00 = j2;
                C277374v4 r9 = r6.A01;
                C277394v6 r7 = r9.A00;
                if (r7 == null) {
                    CRC32 crc32 = new CRC32();
                    crc32.update(str.getBytes());
                    r7 = new C277394v6(crc32.getValue() % 2003);
                    r9.A00 = r7;
                }
                long j5 = r7.A00;
                if (j5 != -1 && j5 == j2 % 2003) {
                    0xI A012 = 0xI.A01("immediate_active_seconds", 1Rm.A00().A00);
                    A012.A0B("activity_time", Long.valueOf(j));
                    A012.A0B("last_activity_time", Long.valueOf(j4));
                    A012.A0B("last_foreground_time", Long.valueOf(r6.A03));
                    r11.A01.EHF(A012);
                }
            }
        }
        AnonymousClass4v1 r4 = r11.A03;
        C60640iu r5 = r11.A01;
        int intValue = num.intValue();
        if (intValue == 1) {
            long j6 = j / 1000;
            if (j6 > r4.A04) {
                long j7 = j6 - r4.A03;
                if (j7 < 0 || j7 >= 64) {
                    r3 = AnonymousClass4v1.A00(r4, AnonymousClass05K.A01, j6);
                    r4.A05 = null;
                    r4.A04 = 0;
                } else {
                    r3 = null;
                }
                int[] iArr = r4.A05;
                if (iArr == null) {
                    r4.A04 = j6;
                    r4.A03 = j6;
                    int i = r4.A00;
                    int[] iArr2 = new int[i];
                    r4.A05 = iArr2;
                    iArr2[0] = 1;
                    for (int i2 = 1; i2 < i; i2++) {
                        iArr2[i2] = 0;
                    }
                    r4.A02++;
                } else {
                    int i3 = (int) j7;
                    int i4 = i3 >> 5;
                    iArr[i4] = (1 << (i3 & 31)) | iArr[i4];
                    r4.A04 = j6;
                }
                r4.A01++;
            } else {
                return;
            }
        } else if ((intValue == 3 || intValue == 2 || intValue == 0 || intValue == 5) && r4.A05 != null) {
            r3 = AnonymousClass4v1.A00(r4, num, j / 1000);
            r4.A05 = null;
            r4.A04 = 0;
        } else {
            return;
        }
        if (r3 != null) {
            r5.EFq(r3);
        }
    }

    public static void A02(C60640iu r6, String str) {
        String str2;
        0xa r2 = AnonymousClass0xl.A00(C61170le.A00).A00;
        boolean z = r2.getBoolean("launcher_badge_supported", false);
        int i = r2.getInt("optimistic_launcher_badge_count_direct", 0);
        int i2 = r2.getInt("optimistic_launcher_badge_count_unseen_activities", 0);
        0xI A012 = 0xI.A01("app_state", 1Rm.A00().A00);
        A012.A0C(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, str);
        A012.A08(Integer.valueOf(i + i2), "total_badge_count");
        A012.A08(Integer.valueOf(i), "direct_badge_total_count");
        A012.A08(Integer.valueOf(i2), "af_badge_total_count");
        if (z) {
            str2 = "numbered";
        } else {
            str2 = "dot_badge";
        }
        A012.A0C("display_type", str2);
        A012.A0C("nav_chain", AnonymousClass1QI.A00.A02.A00);
        r6.EFq(A012);
    }

    public final void A03() {
        A01(this, AnonymousClass05K.A0j, System.currentTimeMillis());
        this.A00.A01.A00 = null;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        A01(this, AnonymousClass05K.A01, System.currentTimeMillis());
    }

    public AnonymousClass4v0(C277384v5 r1, AnonymousClass4v3 r2, AnonymousClass4v1 r3, C60640iu r4, String str) {
        this.A01 = r4;
        this.A00 = r2;
        this.A03 = r3;
        this.A02 = r1;
        this.A04 = str;
    }
}
