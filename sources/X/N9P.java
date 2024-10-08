package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.instagram.camera.effect.models.CameraAREffect;
import java.util.List;

public final class N9P extends AnonymousClass0T0 implements C74269Prx {
    public boolean A00;
    public final float A01;
    public final EffectAttribution A02;
    public final PickerConfiguration A03;
    public final CameraAREffect A04;
    public final CameraAREffect A05;
    public final CameraAREffect A06;
    public final C69378NkI A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final List A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9P) {
                N9P n9p = (N9P) obj;
                if (!(0qQ.A0K(this.A0G, n9p.A0G) && 0qQ.A0K(this.A0I, n9p.A0I) && 0qQ.A0K(this.A04, n9p.A04) && this.A09 == n9p.A09 && this.A0B == n9p.A0B && 0qQ.A0K(this.A0H, n9p.A0H) && 0qQ.A0K(this.A0F, n9p.A0F) && this.A00 == n9p.A00 && 0qQ.A0K(this.A0J, n9p.A0J) && 0qQ.A0K(this.A05, n9p.A05) && 0qQ.A0K(this.A06, n9p.A06) && 0qQ.A0K(this.A0D, n9p.A0D) && 0qQ.A0K(this.A0C, n9p.A0C) && this.A0L == n9p.A0L && this.A0M == n9p.A0M && this.A07 == n9p.A07 && 0qQ.A0K(this.A03, n9p.A03) && this.A0U == n9p.A0U && 0qQ.A0K(this.A02, n9p.A02) && Float.compare(this.A01, n9p.A01) == 0 && this.A0K == n9p.A0K && this.A0T == n9p.A0T && this.A0S == n9p.A0S && 0qQ.A0K(this.A0E, n9p.A0E) && this.A0R == n9p.A0R && this.A0Q == n9p.A0Q && this.A0A == n9p.A0A && this.A0N == n9p.A0N && this.A0V == n9p.A0V && this.A0P == n9p.A0P && 0qQ.A0K(this.A08, n9p.A08) && this.A0O == n9p.A0O)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = (AnonymousClass7TF.A07(this.A0I, AnonymousClass7TE.A0K(this.A0G)) + AnonymousClass7TG.A0C(this.A04)) * 31;
        Integer num = this.A09;
        int A0B2 = AnonymousClass7TG.A0B(num, C9849RiL.A00(num), A072);
        Integer num2 = this.A0B;
        int A092 = AnonymousClass7TF.A09(this.A00, AnonymousClass7TF.A07(this.A0F, AnonymousClass7TF.A07(this.A0H, AnonymousClass7TG.A0B(num2, O2K.A00(num2), A0B2))));
        int A093 = AnonymousClass7TF.A09(this.A0M, AnonymousClass7TF.A09(this.A0L, AnonymousClass7TF.A08(this.A0C, (((((AnonymousClass7TF.A07(this.A0J, A092) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31)));
        int A094 = AnonymousClass7TF.A09(this.A0T, AnonymousClass7TF.A09(this.A0K, AnonymousClass7TF.A00((AnonymousClass7TF.A09(this.A0U, (AnonymousClass7TF.A07(this.A07, A093) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31, this.A01)));
        int A095 = AnonymousClass7TF.A09(this.A0Q, AnonymousClass7TF.A09(this.A0R, (AnonymousClass7TF.A09(this.A0S, A094) + AnonymousClass7TG.A0E(this.A0E)) * 31));
        Integer num3 = this.A0A;
        int A096 = AnonymousClass7TF.A09(this.A0V, AnonymousClass7TF.A09(this.A0N, AnonymousClass7TG.A0B(num3, O2J.A00(num3), A095)));
        return DbS.A06(this.A0O, (AnonymousClass7TF.A09(this.A0P, A096) + AnonymousClass7TE.A0L(this.A08)) * 31);
    }

    public N9P(EffectAttribution effectAttribution, PickerConfiguration pickerConfiguration, CameraAREffect cameraAREffect, CameraAREffect cameraAREffect2, CameraAREffect cameraAREffect3, C69378NkI nkI, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.A0G = list;
        this.A0I = list2;
        this.A04 = cameraAREffect;
        this.A09 = num;
        this.A0B = num2;
        this.A0H = list3;
        this.A0F = list4;
        this.A00 = z;
        this.A0J = list5;
        this.A05 = cameraAREffect2;
        this.A06 = cameraAREffect3;
        this.A0D = str;
        this.A0C = str2;
        this.A0L = z2;
        this.A0M = z3;
        this.A07 = nkI;
        this.A03 = pickerConfiguration;
        this.A0U = z4;
        this.A02 = effectAttribution;
        this.A01 = f;
        this.A0K = z5;
        this.A0T = z6;
        this.A0S = z7;
        this.A0E = str3;
        this.A0R = z8;
        this.A0Q = z9;
        this.A0A = num3;
        this.A0N = z10;
        this.A0V = z11;
        this.A0P = z12;
        this.A08 = num4;
        this.A0O = z13;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallArEffectsModel(effects=");
        A1A.append(this.A0G);
        A1A.append(", presetAvatarEffects=");
        A1A.append(this.A0I);
        A1A.append(", avatarEffect=");
        A1A.append(this.A04);
        A1A.append(", avatarQueryState=");
        Integer num = this.A09;
        if (num != null) {
            str = C9849RiL.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", effectLoadingState=");
        Integer num2 = this.A0B;
        if (num2 != null) {
            str2 = O2K.A00(num2);
        } else {
            str2 = "null";
        }
        A1A.append(str2);
        A1A.append(", multipeerEffects=");
        A1A.append(this.A0H);
        A1A.append(", avatarBackgrounds=");
        A1A.append(this.A0F);
        A1A.append(", isSoloBackgroundsApplied=");
        A1A.append(this.A00);
        A1A.append(", soloBackgroundEffects=");
        A1A.append(this.A0J);
        A1A.append(", currentEffect=");
        A1A.append(this.A05);
        A1A.append(", selectedEffect=");
        A1A.append(this.A06);
        A1A.append(", currentFilter=");
        A1A.append(this.A0D);
        A1A.append(", currentAvatarBackground=");
        A1A.append(this.A0C);
        A1A.append(", isAvatarMode=");
        A1A.append(this.A0L);
        A1A.append(", isAvatarModeAllowed=");
        A1A.append(this.A0M);
        A1A.append(", currentTab=");
        A1A.append(this.A07);
        A1A.append(", pickerConfiguration=");
        A1A.append(this.A03);
        A1A.append(", showConfigurationPicker=");
        A1A.append(this.A0U);
        A1A.append(", licensing=");
        A1A.append(this.A02);
        A1A.append(", arSliderProgress=");
        A1A.append(this.A01);
        A1A.append(", inSliderMode=");
        A1A.append(this.A0K);
        A1A.append(", requireTestLinkConsent=");
        A1A.append(this.A0T);
        A1A.append(", requirePeerConsent=");
        A1A.append(this.A0S);
        A1A.append(", peerConsentText=");
        A1A.append(this.A0E);
        A1A.append(", requireFlmConsentForEffect=");
        A1A.append(this.A0R);
        A1A.append(", multiPeerCapabilityEnabled=");
        A1A.append(this.A0Q);
        A1A.append(", currentEffectMenu=");
        Integer num3 = this.A0A;
        if (num3 != null) {
            str3 = O2J.A00(num3);
        } else {
            str3 = "null";
        }
        A1A.append(str3);
        A1A.append(", isCameraOn=");
        A1A.append(this.A0N);
        A1A.append(", showEffectGalleryEntryPoint=");
        A1A.append(this.A0V);
        A1A.append(", isFlmDenied=");
        A1A.append(this.A0P);
        A1A.append(", avatarLoaderProgress=");
        A1A.append(this.A08);
        A1A.append(", isE2eeMandated=");
        return G9t.A1C(A1A, this.A0O);
    }

    public static /* synthetic */ N9P A00(EffectAttribution effectAttribution, PickerConfiguration pickerConfiguration, CameraAREffect cameraAREffect, CameraAREffect cameraAREffect2, CameraAREffect cameraAREffect3, C69378NkI nkI, N9P n9p, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, float f, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = z13;
        int i2 = i;
        Integer num5 = num4;
        boolean z15 = z12;
        String str4 = str2;
        String str5 = str;
        List list6 = list5;
        CameraAREffect cameraAREffect4 = cameraAREffect3;
        List list7 = list4;
        CameraAREffect cameraAREffect5 = cameraAREffect2;
        boolean z16 = z4;
        List list8 = list3;
        boolean z17 = z;
        Integer num6 = num2;
        Integer num7 = num;
        boolean z18 = z7;
        boolean z19 = z2;
        CameraAREffect cameraAREffect6 = cameraAREffect;
        boolean z20 = z6;
        boolean z21 = z11;
        List list9 = list2;
        List list10 = list;
        boolean z22 = z8;
        boolean z23 = z3;
        PickerConfiguration pickerConfiguration2 = pickerConfiguration;
        boolean z24 = z10;
        boolean z25 = z9;
        float f2 = f;
        boolean z26 = z5;
        String str6 = str3;
        C69378NkI nkI2 = nkI;
        Integer num8 = num3;
        N9P n9p2 = n9p;
        if ((i & 1) != 0) {
            list10 = n9p2.A0G;
        }
        if ((i & 2) != 0) {
            list9 = n9p2.A0I;
        }
        if ((i & 4) != 0) {
            cameraAREffect6 = n9p2.A04;
        }
        if ((i & 8) != 0) {
            num7 = n9p2.A09;
        }
        if ((i & 16) != 0) {
            num6 = n9p2.A0B;
        }
        if ((i & 32) != 0) {
            list8 = n9p2.A0H;
        }
        if ((i & 64) != 0) {
            list7 = n9p2.A0F;
        }
        if ((i2 & 128) != 0) {
            z17 = n9p2.A00;
        }
        if ((i2 & 256) != 0) {
            list6 = n9p2.A0J;
        }
        if ((i2 & 512) != 0) {
            cameraAREffect5 = n9p2.A05;
        }
        if ((i2 & 1024) != 0) {
            cameraAREffect4 = n9p2.A06;
        }
        if ((i2 & C249703kE.FLAG_MOVED) != 0) {
            str5 = n9p2.A0D;
        }
        if ((i2 & 4096) != 0) {
            str4 = n9p2.A0C;
        }
        if ((i2 & 8192) != 0) {
            z19 = n9p2.A0L;
        }
        if ((i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            z23 = n9p2.A0M;
        }
        if ((i & Constants.LOAD_RESULT_PGO) != 0) {
            nkI2 = n9p2.A07;
        }
        if ((i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            pickerConfiguration2 = n9p2.A03;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            z16 = n9p2.A0U;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            effectAttribution = n9p2.A02;
        }
        if ((i & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            f2 = n9p2.A01;
        }
        if ((i & Constants.LOAD_RESULT_NEED_REOPTIMIZATION) != 0) {
            z26 = n9p2.A0K;
        }
        if ((i & 2097152) != 0) {
            z20 = n9p2.A0T;
        }
        if ((i & 4194304) != 0) {
            z18 = n9p2.A0S;
        }
        if ((i & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0) {
            str6 = n9p2.A0E;
        }
        if ((i & 16777216) != 0) {
            z22 = n9p2.A0R;
        }
        if ((i & 33554432) != 0) {
            z25 = n9p2.A0Q;
        }
        if ((i & 67108864) != 0) {
            num8 = n9p2.A0A;
        }
        if ((i & 134217728) != 0) {
            z24 = n9p2.A0N;
        }
        if ((i & 268435456) != 0) {
            z21 = n9p2.A0V;
        }
        if ((i & 536870912) != 0) {
            z15 = n9p2.A0P;
        }
        if ((i & SN3.MAX_SIGNED_POWER_OF_TWO) != 0) {
            num5 = n9p2.A08;
        }
        if ((i & AnonymousClass972.MUTABLE_FLAG_MASK) != 0) {
            z14 = n9p2.A0O;
        }
        AnonymousClass7TG.A1N(list10, list9);
        C51974G9v.A0d(3, num7, num6, list8, list7);
        DbW.A1P(list6, 8, str4);
        0qQ.A0B(nkI2, 15);
        0qQ.A0B(num8, 26);
        boolean z27 = z25;
        boolean z28 = z24;
        boolean z29 = z21;
        boolean z30 = z15;
        boolean z31 = z14;
        return new N9P(effectAttribution, pickerConfiguration2, cameraAREffect6, cameraAREffect5, cameraAREffect4, nkI2, num7, num6, num8, num5, str5, str4, str6, list10, list9, list8, list7, list6, f2, z17, z19, z23, z16, z26, z20, z18, z22, z27, z28, z29, z30, z31);
    }
}
