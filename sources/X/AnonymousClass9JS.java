package X;

import android.animation.StateListAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.ViewOutlineProvider;
import com.facebook.common.dextricks.Constants;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9JS  reason: invalid class name */
public final class AnonymousClass9JS implements AnonymousClass2WY {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass9JS(2V5 r2, Integer num) {
        this.A00 = 1;
        0qQ.A0B(r2, 2);
        this.A01 = num;
        this.A02 = r2;
    }

    public final void ABy(2TC r7, 2V1 r8) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(r7, 1);
                switch (((Number) this.A01).intValue()) {
                    case 0:
                        Object obj = this.A02;
                        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        2TG A022 = 2TC.A02(r7);
                        int i = 2;
                        if (booleanValue) {
                            i = 1;
                        }
                        A022.A09 = i;
                        return;
                    case 1:
                        Object obj2 = this.A02;
                        0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
                        2TG A023 = 2TC.A02(r7);
                        A023.A0F |= 4194304;
                        A023.A0c = (String) obj2;
                        return;
                    case 2:
                        Object obj3 = this.A02;
                        0qQ.A0C(obj3, "null cannot be cast to non-null type kotlin.CharSequence");
                        2TG A024 = 2TC.A02(r7);
                        A024.A0F |= 16777216;
                        A024.A0Z = (CharSequence) obj3;
                        return;
                    case 3:
                        Object obj4 = this.A02;
                        0qQ.A0C(obj4, "null cannot be cast to non-null type kotlin.CharSequence");
                        2TG A025 = 2TC.A02(r7);
                        A025.A0F |= 1;
                        A025.A0a = (CharSequence) obj4;
                        return;
                    case 4:
                        0qQ.A0C(this.A02, "null cannot be cast to non-null type com.facebook.litho.FocusOrderModel");
                        0qQ.A0B((Object) null, 0);
                        throw AnonymousClass00P.createAndThrow();
                    case 5:
                        Object obj5 = this.A02;
                        0qQ.A0C(obj5, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Number) obj5).intValue();
                        C243593Zj A012 = 2TC.A01(r7);
                        A012.A02 |= 1;
                        A012.A00 = intValue;
                        return;
                    case 6:
                        Object obj6 = this.A02;
                        0qQ.A0C(obj6, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.OnInitializeAccessibilityEventEvent, kotlin.Unit>");
                        0u4.A05(obj6, 1);
                        C244173al r5 = new C244173al((String) null, (0sP) obj6);
                        2TG A026 = 2TC.A02(r7);
                        A026.A0F |= 128;
                        A026.A0N = r5;
                        return;
                    case 7:
                        Object obj7 = this.A02;
                        0qQ.A0C(obj7, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.OnInitializeAccessibilityNodeInfoEvent, kotlin.Unit>");
                        0u4.A05(obj7, 1);
                        C244173al r52 = new C244173al((String) null, (0sP) obj7);
                        2TG A027 = 2TC.A02(r7);
                        A027.A0F |= 256;
                        A027.A0O = r52;
                        return;
                    case 8:
                        Object obj8 = this.A02;
                        0qQ.A0C(obj8, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.OnPopulateAccessibilityEventEvent, kotlin.Unit>");
                        0u4.A05(obj8, 1);
                        C244173al r53 = new C244173al((String) null, (0sP) obj8);
                        2TG A028 = 2TC.A02(r7);
                        A028.A0F |= 512;
                        A028.A0Q = r53;
                        return;
                    case 9:
                        Object obj9 = this.A02;
                        0qQ.A0C(obj9, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.OnPopulateAccessibilityNodeEvent, kotlin.Unit>");
                        0u4.A05(obj9, 1);
                        C244173al r54 = new C244173al((String) null, (0sP) obj9);
                        2TG A029 = 2TC.A02(r7);
                        A029.A0F |= 536870912;
                        A029.A0R = r54;
                        return;
                    case 10:
                        Object obj10 = this.A02;
                        0qQ.A0C(obj10, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.OnRequestSendAccessibilityEventEvent, kotlin.Unit>");
                        0u4.A05(obj10, 1);
                        C244173al r55 = new C244173al((String) null, (0sP) obj10);
                        2TG A0210 = 2TC.A02(r7);
                        A0210.A0F |= 1024;
                        A0210.A0S = r55;
                        return;
                    case 11:
                        Object obj11 = this.A02;
                        0qQ.A0C(obj11, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.PerformAccessibilityActionEvent, kotlin.Unit>");
                        0u4.A05(obj11, 1);
                        C244173al r56 = new C244173al((String) null, (0sP) obj11);
                        2TG A0211 = 2TC.A02(r7);
                        A0211.A0F |= 2048;
                        A0211.A0U = r56;
                        return;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        Object obj12 = this.A02;
                        0qQ.A0C(obj12, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.SendAccessibilityEventEvent, kotlin.Unit>");
                        0u4.A05(obj12, 1);
                        C244173al r57 = new C244173al((String) null, (0sP) obj12);
                        2TG A0212 = 2TC.A02(r7);
                        A0212.A0F |= 4096;
                        A0212.A0V = r57;
                        return;
                    case 13:
                        Object obj13 = this.A02;
                        0qQ.A0C(obj13, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.SendAccessibilityEventUncheckedEvent, kotlin.Unit>");
                        0u4.A05(obj13, 1);
                        C244173al r58 = new C244173al((String) null, (0sP) obj13);
                        2TG A0213 = 2TC.A02(r7);
                        A0213.A0F |= 8192;
                        A0213.A0W = r58;
                        return;
                    case 14:
                        Object obj14 = this.A02;
                        0qQ.A0C(obj14, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.PerformActionForVirtualViewEvent, kotlin.Unit>");
                        0u4.A05(obj14, 1);
                        C244173al r59 = new C244173al((String) null, (0sP) obj14);
                        2TG A0214 = 2TC.A02(r7);
                        A0214.A0F |= 4294967296L;
                        A0214.A0P = r59;
                        return;
                    case 15:
                        Object obj15 = this.A02;
                        0qQ.A0C(obj15, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.VirtualViewKeyboardFocusChangedEvent, kotlin.Unit>");
                        0u4.A05(obj15, 1);
                        C244173al r510 = new C244173al((String) null, (0sP) obj15);
                        2TG A0215 = 2TC.A02(r7);
                        A0215.A0F |= 2147483648L;
                        A0215.A0T = r510;
                        return;
                    default:
                        return;
                }
            case 1:
                int i2 = 1;
                0qQ.A0B(r7, 1);
                SparseArray sparseArray = r7.A03;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    r7.A03 = sparseArray;
                }
                switch (((Number) this.A01).intValue()) {
                    case 0:
                        break;
                    case 1:
                        i2 = 8;
                        break;
                    case 2:
                        i2 = 12;
                        break;
                    case 3:
                        i2 = 7;
                        break;
                    case 4:
                        i2 = 13;
                        break;
                    case 5:
                        i2 = 9;
                        break;
                    case 6:
                        i2 = 10;
                        break;
                    case 7:
                        i2 = 11;
                        break;
                    case 8:
                        i2 = 5;
                        break;
                    case 9:
                        i2 = 6;
                        break;
                    case 10:
                        i2 = 2;
                        break;
                    case 11:
                        i2 = 3;
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        i2 = 4;
                        break;
                    default:
                        return;
                }
                sparseArray.put(i2, this.A02);
                return;
            case 2:
                0qQ.A0B(r7, 1);
                if (((Number) this.A01).intValue() == 0) {
                    Object obj16 = this.A02;
                    0qQ.A0C(obj16, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<kotlin.Any, kotlin.Any, kotlin.Any>");
                    C244233ar r3 = (C244233ar) obj16;
                    0qQ.A0B(r3, 0);
                    C243593Zj A013 = 2TC.A01(r7);
                    Map map = A013.A0I;
                    if (map == null) {
                        map = new LinkedHashMap();
                    }
                    map.put(r3.A00.CAe(), r3);
                    A013.A0I = map;
                    return;
                }
                return;
            case 3:
                0qQ.A0B(r7, 1);
                switch (((Number) this.A01).intValue()) {
                    case 0:
                        Object obj17 = this.A02;
                        if (obj17 != null) {
                            r7.A0O((C243573Zh) obj17);
                            return;
                        }
                        return;
                    case 1:
                        2Ts r2 = (2Ts) this.A02;
                        C243593Zj A014 = 2TC.A01(r7);
                        if (r2 != null) {
                            A014.A02 |= 8192;
                            A014.A06 = r2;
                            return;
                        }
                        return;
                    case 2:
                        Object obj18 = this.A02;
                        0qQ.A0C(obj18, "null cannot be cast to non-null type com.facebook.yoga.YogaDirection");
                        r7.A0G(C245023cA.A00((C245033cB) obj18));
                        return;
                    case 3:
                        Object obj19 = this.A02;
                        if (obj19 != null) {
                            r7.A0P((C244143ai) obj19);
                            return;
                        }
                        return;
                    case 4:
                        Object obj20 = this.A02;
                        if (obj20 != null) {
                            r7.A0W((C244413b9) obj20);
                            return;
                        }
                        return;
                    case 5:
                        Object obj21 = this.A02;
                        if (obj21 != null) {
                            r7.A0X(((Boolean) obj21).booleanValue());
                            return;
                        }
                        return;
                    case 6:
                        Object obj22 = this.A02;
                        if (obj22 != null) {
                            r7.A0Y(((Boolean) obj22).booleanValue());
                            return;
                        }
                        return;
                    default:
                        return;
                }
            default:
                0qQ.A0B(r7, 1);
                C244173al r511 = null;
                switch (((Number) this.A01).intValue()) {
                    case 0:
                        r7.A0M((Drawable) this.A02);
                        return;
                    case 1:
                        Object obj23 = this.A02;
                        0qQ.A0C(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue2 = ((Boolean) obj23).booleanValue();
                        2TG A0216 = 2TC.A02(r7);
                        int i3 = 2;
                        if (booleanValue2) {
                            i3 = 1;
                        }
                        A0216.A0A = i3;
                        return;
                    case 2:
                        Object obj24 = this.A02;
                        0qQ.A0C(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue3 = ((Boolean) obj24).booleanValue();
                        2TG A0217 = 2TC.A02(r7);
                        A0217.A0F |= 8388608;
                        A0217.A0f = booleanValue3;
                        return;
                    case 3:
                        Object obj25 = this.A02;
                        0qQ.A0C(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue4 = ((Boolean) obj25).booleanValue();
                        2TG A0218 = 2TC.A02(r7);
                        A0218.A0F |= 65536;
                        A0218.A0g = booleanValue4;
                        return;
                    case 4:
                        Object obj26 = this.A02;
                        0qQ.A0C(obj26, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue5 = ((Boolean) obj26).booleanValue();
                        C243593Zj A015 = 2TC.A01(r7);
                        A015.A02 |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED;
                        A015.A0J = booleanValue5;
                        return;
                    case 5:
                        Object obj27 = this.A02;
                        0qQ.A0C(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue6 = ((Boolean) obj27).booleanValue();
                        C243593Zj A016 = 2TC.A01(r7);
                        A016.A02 |= 2;
                        A016.A0K = booleanValue6;
                        return;
                    case 6:
                        Object obj28 = this.A02;
                        0qQ.A0C(obj28, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue7 = ((Boolean) obj28).booleanValue();
                        2TG A0219 = 2TC.A02(r7);
                        int i4 = 2;
                        if (booleanValue7) {
                            i4 = 1;
                        }
                        A0219.A0C = i4;
                        return;
                    case 7:
                        C243593Zj A017 = 2TC.A01(r7);
                        A017.A02 |= 4;
                        A017.A05 = (Drawable) this.A02;
                        return;
                    case 8:
                        Object obj29 = this.A02;
                        if (obj29 != null) {
                            0u4.A05(obj29, 1);
                            r511 = new C244173al((String) null, (0sP) obj29);
                        }
                        2TG A0220 = 2TC.A02(r7);
                        A0220.A0F |= 8;
                        A0220.A0I = r511;
                        return;
                    case 9:
                        Object obj30 = this.A02;
                        if (obj30 != null) {
                            0u4.A05(obj30, 1);
                            r511 = new C244173al((String) null, (0sP) obj30);
                        }
                        2TG A0221 = 2TC.A02(r7);
                        A0221.A0F |= 131072;
                        A0221.A0K = r511;
                        return;
                    case 10:
                        Object obj31 = this.A02;
                        if (obj31 != null) {
                            0u4.A05(obj31, 1);
                            r511 = new C244173al((String) null, (0sP) obj31);
                        }
                        2TG A0222 = 2TC.A02(r7);
                        A0222.A0F |= 262144;
                        A0222.A0L = r511;
                        return;
                    case 11:
                        Object obj32 = this.A02;
                        if (obj32 != null) {
                            0u4.A05(obj32, 1);
                            r511 = new C244173al((String) null, (0sP) obj32);
                        }
                        2TG A0223 = 2TC.A02(r7);
                        A0223.A0F |= 16;
                        A0223.A0M = r511;
                        return;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        Object obj33 = this.A02;
                        if (obj33 != null) {
                            0u4.A05(obj33, 1);
                            r511 = new C244173al((String) null, (0sP) obj33);
                        }
                        2TG A0224 = 2TC.A02(r7);
                        A0224.A0F |= 32;
                        A0224.A0X = r511;
                        return;
                    case 13:
                        2TG A0225 = 2TC.A02(r7);
                        A0225.A0F |= 32768;
                        A0225.A0H = (ViewOutlineProvider) this.A02;
                        return;
                    case 14:
                        Object obj34 = this.A02;
                        0qQ.A0C(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue8 = ((Boolean) obj34).booleanValue();
                        2TG A0226 = 2TC.A02(r7);
                        int i5 = 2;
                        if (booleanValue8) {
                            i5 = 1;
                        }
                        A0226.A0E = i5;
                        return;
                    case 15:
                        C243593Zj A018 = 2TC.A01(r7);
                        A018.A02 |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
                        A018.A03 = (StateListAnimator) this.A02;
                        return;
                    case 16:
                        r7.A01 |= 2;
                        r7.A07 = (String) this.A02;
                        return;
                    case 17:
                        2TC.A02(r7).A0e = (String) this.A02;
                        return;
                    case EglBase14Impl.EGLExt_SDK_VERSION:
                        r7.A08 = true;
                        return;
                    case 19:
                        Object obj35 = this.A02;
                        0qQ.A0C(obj35, "null cannot be cast to non-null type kotlin.Int");
                        int intValue2 = ((Number) obj35).intValue();
                        2TG A0227 = 2TC.A02(r7);
                        A0227.A0F |= 1073741824;
                        A0227.A08 = intValue2;
                        return;
                    case 20:
                        Object obj36 = this.A02;
                        2TG A0228 = 2TC.A02(r7);
                        A0228.A0F |= 2;
                        A0228.A0b = obj36;
                        return;
                    case 21:
                        Object obj37 = this.A02;
                        0qQ.A0C(obj37, "null cannot be cast to non-null type android.util.SparseArray<kotlin.Any>");
                        SparseArray sparseArray2 = (SparseArray) obj37;
                        2TG A0229 = 2TC.A02(r7);
                        A0229.A0F |= 4;
                        SparseArray sparseArray3 = A0229.A0G;
                        if (sparseArray3 != null) {
                            sparseArray2 = C246273eJ.A00(sparseArray3, sparseArray2);
                        }
                        A0229.A0G = sparseArray2;
                        return;
                    case 22:
                        Object obj38 = this.A02;
                        0qQ.A0C(obj38, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue9 = ((Boolean) obj38).booleanValue();
                        2TG A0230 = 2TC.A02(r7);
                        int i6 = 2;
                        if (booleanValue9) {
                            i6 = 1;
                        }
                        A0230.A0B = i6;
                        return;
                    case 23:
                        Object obj39 = this.A02;
                        0qQ.A0C(obj39, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue10 = ((Boolean) obj39).booleanValue();
                        2TG A0231 = 2TC.A02(r7);
                        int i7 = 2;
                        if (booleanValue10) {
                            i7 = 1;
                        }
                        A0231.A0D = i7;
                        return;
                    case 24:
                        Object obj40 = this.A02;
                        0qQ.A0C(obj40, "null cannot be cast to non-null type kotlin.Function1<android.graphics.Rect, android.graphics.Rect>");
                        0u4.A05(obj40, 1);
                        0qQ.A0B(obj40, 0);
                        C243593Zj A019 = 2TC.A01(r7);
                        List list = A019.A0H;
                        if (list == null) {
                            list = new ArrayList();
                            A019.A0H = list;
                        }
                        list.add(obj40);
                        return;
                    case 25:
                        2TG A0232 = 2TC.A02(r7);
                        A0232.A0F |= 8589934592L;
                        A0232.A0d = (String) this.A02;
                        return;
                    case 26:
                        Object obj41 = this.A02;
                        0qQ.A0C(obj41, "null cannot be cast to non-null type kotlin.Pair<kotlin.Int, android.graphics.Paint?>");
                        0eP r1 = (0eP) obj41;
                        int intValue3 = ((Number) r1.A00).intValue();
                        C243593Zj A0110 = 2TC.A01(r7);
                        A0110.A01 = intValue3;
                        A0110.A04 = (Paint) r1.A01;
                        return;
                    default:
                        return;
                }
        }
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            case 4:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
            default:
                return super.equals(obj);
        }
        if (!(obj instanceof AnonymousClass9JS)) {
            return false;
        }
        AnonymousClass9JS r3 = (AnonymousClass9JS) obj;
        if (r3.A00 == i && this.A01 == r3.A01 && 0qQ.A0K(this.A02, r3.A02)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        return r1 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        r0 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        r1 = r0.hashCode();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r1 = (r1 + r2.intValue()) * 31;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r0 != null) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x001b;
                case 1: goto L_0x0035;
                case 2: goto L_0x0013;
                case 3: goto L_0x0005;
                case 4: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r1 = super.hashCode()
            return r1
        L_0x000a:
            java.lang.Object r2 = r3.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.String r0 = X.C393009vk.A00(r2)
            goto L_0x0023
        L_0x0013:
            java.lang.Object r2 = r3.A01
            java.lang.Number r2 = (java.lang.Number) r2
            r1 = 2132030724(0x7f143504, float:1.9700102E38)
            goto L_0x0027
        L_0x001b:
            java.lang.Object r2 = r3.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.String r0 = X.C392979vh.A00(r2)
        L_0x0023:
            int r1 = r0.hashCode()
        L_0x0027:
            int r0 = r2.intValue()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
            if (r0 != 0) goto L_0x004a
            r0 = 0
        L_0x0033:
            int r1 = r1 + r0
            return r1
        L_0x0035:
            java.lang.Object r2 = r3.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.String r0 = X.HSJ.A00(r2)
            int r1 = r0.hashCode()
            int r0 = r2.intValue()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
        L_0x004a:
            int r0 = r0.hashCode()
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9JS.hashCode():int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        r0 = "null";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0041;
                case 1: goto L_0x002c;
                case 2: goto L_0x001f;
                case 3: goto L_0x0005;
                case 4: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = super.toString()
            return r0
        L_0x000a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ObjectStyleItem(field="
            r1.append(r0)
            java.lang.Object r0 = r2.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = X.C393009vk.A00(r0)
            goto L_0x0055
        L_0x001f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ObjectStyleItem(field="
            r1.append(r0)
            java.lang.String r0 = "DELEGATE_MOUNT_VIEW_BINDER"
            goto L_0x0055
        L_0x002c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "DynamicStyleItem(field="
            r1.append(r0)
            java.lang.Object r0 = r2.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = X.HSJ.A00(r0)
            goto L_0x0055
        L_0x0041:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AccessibilityStyleItem(field="
            r1.append(r0)
            java.lang.Object r0 = r2.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = X.C392979vh.A00(r0)
        L_0x0055:
            r1.append(r0)
            java.lang.String r0 = ", value="
            r1.append(r0)
            java.lang.Object r0 = r2.A02
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x006c:
            java.lang.String r0 = "null"
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9JS.toString():java.lang.String");
    }

    public AnonymousClass9JS(Integer num, Object obj, int i) {
        this.A00 = i;
        this.A01 = num;
        this.A02 = obj;
    }
}
