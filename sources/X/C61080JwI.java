package X;

import android.graphics.Bitmap;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.api.schemas.MediaTrialGraduationStrategy;
import com.instagram.api.schemas.XFBFXIGPCEntryPoint;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.EglBase14Impl;

/* renamed from: X.JwI  reason: case insensitive filesystem */
public final class C61080JwI extends AnonymousClass0T0 {
    public Object A00;
    public final int A01;

    public static int A00(C61080JwI jwI) {
        return jwI.A00.hashCode();
    }

    public static boolean A02(int i, Object obj) {
        if (!(obj instanceof C61080JwI) || ((C61080JwI) obj).A01 != i) {
            return false;
        }
        return true;
    }

    public static boolean A03(Object obj, Object obj2, 05G r3, int i) {
        return r3.AIY(obj2, new C61080JwI(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0111, code lost:
        if (r2.A00 == ((X.C61080JwI) r3).A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0121, code lost:
        if (A02(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x012d, code lost:
        if (X.0qQ.A0K(r2.A00, ((X.C61080JwI) r3).A00) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0109, code lost:
        if (A02(r0, r3) == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A01
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x000f;
                case 2: goto L_0x0014;
                case 3: goto L_0x0019;
                case 4: goto L_0x001e;
                case 5: goto L_0x0023;
                case 6: goto L_0x0028;
                case 7: goto L_0x002d;
                case 8: goto L_0x0032;
                case 9: goto L_0x0038;
                case 10: goto L_0x003e;
                case 11: goto L_0x0005;
                case 12: goto L_0x0044;
                case 13: goto L_0x004a;
                case 14: goto L_0x0050;
                case 15: goto L_0x0056;
                case 16: goto L_0x005c;
                case 17: goto L_0x0062;
                case 18: goto L_0x0068;
                case 19: goto L_0x006e;
                case 20: goto L_0x0074;
                case 21: goto L_0x007a;
                case 22: goto L_0x0080;
                case 23: goto L_0x0086;
                case 24: goto L_0x008b;
                case 25: goto L_0x0091;
                case 26: goto L_0x0097;
                case 27: goto L_0x009d;
                case 28: goto L_0x00a2;
                case 29: goto L_0x00a7;
                case 30: goto L_0x00ac;
                case 31: goto L_0x00b1;
                case 32: goto L_0x00b6;
                case 33: goto L_0x00bb;
                case 34: goto L_0x00c0;
                case 35: goto L_0x00c5;
                case 36: goto L_0x00ca;
                case 37: goto L_0x00cf;
                case 38: goto L_0x00d4;
                case 39: goto L_0x00d9;
                case 40: goto L_0x00de;
                case 41: goto L_0x00e3;
                case 42: goto L_0x00e8;
                case 43: goto L_0x00ed;
                case 44: goto L_0x00f2;
                case 45: goto L_0x00f7;
                case 46: goto L_0x00fc;
                case 47: goto L_0x0101;
                case 48: goto L_0x0114;
                case 49: goto L_0x0119;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x0131
            r0 = 0
            goto L_0x011d
        L_0x000f:
            if (r2 == r3) goto L_0x0131
            r0 = 1
            goto L_0x011d
        L_0x0014:
            if (r2 == r3) goto L_0x0131
            r0 = 2
            goto L_0x011d
        L_0x0019:
            if (r2 == r3) goto L_0x0131
            r0 = 3
            goto L_0x011d
        L_0x001e:
            if (r2 == r3) goto L_0x0131
            r0 = 4
            goto L_0x011d
        L_0x0023:
            if (r2 == r3) goto L_0x0131
            r0 = 5
            goto L_0x0105
        L_0x0028:
            if (r2 == r3) goto L_0x0131
            r0 = 6
            goto L_0x011d
        L_0x002d:
            if (r2 == r3) goto L_0x0131
            r0 = 7
            goto L_0x011d
        L_0x0032:
            if (r2 == r3) goto L_0x0131
            r0 = 8
            goto L_0x0105
        L_0x0038:
            if (r2 == r3) goto L_0x0131
            r0 = 9
            goto L_0x011d
        L_0x003e:
            if (r2 == r3) goto L_0x0131
            r0 = 10
            goto L_0x011d
        L_0x0044:
            if (r2 == r3) goto L_0x0131
            r0 = 12
            goto L_0x011d
        L_0x004a:
            if (r2 == r3) goto L_0x0131
            r0 = 13
            goto L_0x011d
        L_0x0050:
            if (r2 == r3) goto L_0x0131
            r0 = 14
            goto L_0x011d
        L_0x0056:
            if (r2 == r3) goto L_0x0131
            r0 = 15
            goto L_0x0105
        L_0x005c:
            if (r2 == r3) goto L_0x0131
            r0 = 16
            goto L_0x011d
        L_0x0062:
            if (r2 == r3) goto L_0x0131
            r0 = 17
            goto L_0x011d
        L_0x0068:
            if (r2 == r3) goto L_0x0131
            r0 = 18
            goto L_0x011d
        L_0x006e:
            if (r2 == r3) goto L_0x0131
            r0 = 19
            goto L_0x0105
        L_0x0074:
            if (r2 == r3) goto L_0x0131
            r0 = 20
            goto L_0x011d
        L_0x007a:
            if (r2 == r3) goto L_0x0131
            r0 = 21
            goto L_0x011d
        L_0x0080:
            if (r2 == r3) goto L_0x0131
            r0 = 22
            goto L_0x011d
        L_0x0086:
            if (r2 == r3) goto L_0x0131
            r0 = 23
            goto L_0x0105
        L_0x008b:
            if (r2 == r3) goto L_0x0131
            r0 = 24
            goto L_0x011d
        L_0x0091:
            if (r2 == r3) goto L_0x0131
            r0 = 25
            goto L_0x011d
        L_0x0097:
            if (r2 == r3) goto L_0x0131
            r0 = 26
            goto L_0x011d
        L_0x009d:
            if (r2 == r3) goto L_0x0131
            r0 = 27
            goto L_0x011d
        L_0x00a2:
            if (r2 == r3) goto L_0x0131
            r0 = 28
            goto L_0x011d
        L_0x00a7:
            if (r2 == r3) goto L_0x0131
            r0 = 29
            goto L_0x011d
        L_0x00ac:
            if (r2 == r3) goto L_0x0131
            r0 = 30
            goto L_0x011d
        L_0x00b1:
            if (r2 == r3) goto L_0x0131
            r0 = 31
            goto L_0x011d
        L_0x00b6:
            if (r2 == r3) goto L_0x0131
            r0 = 32
            goto L_0x011d
        L_0x00bb:
            if (r2 == r3) goto L_0x0131
            r0 = 33
            goto L_0x0105
        L_0x00c0:
            if (r2 == r3) goto L_0x0131
            r0 = 34
            goto L_0x011d
        L_0x00c5:
            if (r2 == r3) goto L_0x0131
            r0 = 35
            goto L_0x011d
        L_0x00ca:
            if (r2 == r3) goto L_0x0131
            r0 = 36
            goto L_0x011d
        L_0x00cf:
            if (r2 == r3) goto L_0x0131
            r0 = 37
            goto L_0x011d
        L_0x00d4:
            if (r2 == r3) goto L_0x0131
            r0 = 38
            goto L_0x011d
        L_0x00d9:
            if (r2 == r3) goto L_0x0131
            r0 = 39
            goto L_0x011d
        L_0x00de:
            if (r2 == r3) goto L_0x0131
            r0 = 40
            goto L_0x011d
        L_0x00e3:
            if (r2 == r3) goto L_0x0131
            r0 = 41
            goto L_0x011d
        L_0x00e8:
            if (r2 == r3) goto L_0x0131
            r0 = 42
            goto L_0x011d
        L_0x00ed:
            if (r2 == r3) goto L_0x0131
            r0 = 43
            goto L_0x011d
        L_0x00f2:
            if (r2 == r3) goto L_0x0131
            r0 = 44
            goto L_0x0105
        L_0x00f7:
            if (r2 == r3) goto L_0x0131
            r0 = 45
            goto L_0x0105
        L_0x00fc:
            if (r2 == r3) goto L_0x0131
            r0 = 46
            goto L_0x011d
        L_0x0101:
            if (r2 == r3) goto L_0x0131
            r0 = 47
        L_0x0105:
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x012f
            X.JwI r3 = (X.C61080JwI) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x0131
            goto L_0x012f
        L_0x0114:
            if (r2 == r3) goto L_0x0131
            r0 = 48
            goto L_0x011d
        L_0x0119:
            if (r2 == r3) goto L_0x0131
            r0 = 49
        L_0x011d:
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x012f
            X.JwI r3 = (X.C61080JwI) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0131
        L_0x012f:
            r0 = 0
            return r0
        L_0x0131:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61080JwI.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        String str;
        switch (this.A01) {
            case 0:
                return A00(this);
            case 1:
                return A00(this);
            case 2:
            case 3:
            case 6:
            case 20:
            case 22:
            case 24:
            case 27:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 32:
                return A00(this);
            case 4:
                return A00(this);
            case 5:
                Integer num = (Integer) this.A00;
                if (num != null) {
                    return C51971G9r.A0D(num, S8H.A01(num));
                }
                return 0;
            case 7:
            case Seq.NULL_REFNUM:
                return A00(this);
            case 8:
                i = AnonymousClass7TE.A0M(this.A00);
                switch (i) {
                    case 1:
                        str = Pxd.A00(572);
                        break;
                    case 2:
                        str = "Ineligible";
                        break;
                    default:
                        str = Pxd.A00(573);
                        break;
                }
            case 9:
                return A00(this);
            case 10:
            case 13:
            case 14:
            case 17:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 19:
            case 21:
            case 31:
            case 34:
            case 36:
            case 37:
            case 38:
            case 40:
            case Seq.RefTracker.REF_OFFSET:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
                Object obj = this.A00;
                if (obj != null) {
                    return obj.hashCode();
                }
                return 0;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return A00(this);
            case 15:
                return A00(this);
            case 16:
                return A00(this);
            case 23:
                i = AnonymousClass7TE.A0M(this.A00);
                switch (i) {
                    case 1:
                        str = "SHOW_TRANSLATED_CAPTIONS_ONLY";
                        break;
                    case 2:
                        str = "NEVER_SHOW_CAPTIONS";
                        break;
                    default:
                        str = "ALWAYS_SHOW_CAPTIONS";
                        break;
                }
            case 25:
                return A00(this);
            case 26:
                return A00(this);
            case 28:
                return A00(this);
            case 30:
                return A00(this);
            case 33:
                return A00(this);
            case 35:
            case 39:
                return A00(this);
            case 45:
                return A00(this);
            case 49:
                return A00(this);
            default:
                return super.hashCode();
        }
        return C51966G9m.A04(str, i);
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        switch (this.A01) {
            case 10:
                sb = AnonymousClass7TE.A1A();
                str = "GraphQLInAppPurchaseOffer(subscriptionOffers=";
                break;
            case 11:
                sb = AnonymousClass7TE.A1A();
                str = "ShowreelNativeMetadata(visibleLayers=";
                break;
            case 22:
                sb = AnonymousClass7TE.A1A();
                str = "AccessTokenRequestOrder(orders=";
                break;
            case 28:
                sb = AnonymousClass7TE.A1A();
                str = "SocialContextBubbleActions(currentCarouselSlideMediaId=";
                break;
            case 31:
                sb = AnonymousClass7TE.A1A();
                str = "DrawableMetadata(drawable=";
                break;
            case 32:
                sb = AnonymousClass7TE.A1A();
                str = "SerializableCaptionAudioBleepList(bleepsList=";
                break;
            case 33:
                sb = AnonymousClass7TE.A1A();
                str = "CtaInfo(type=";
                break;
            case 46:
                sb = AnonymousClass7TE.A1A();
                str = "UiState(threadsPrivacyInfo=";
                break;
            default:
                return super.toString();
        }
        sb.append(str);
        return AnonymousClass7TG.A0n(this.A00, sb);
    }

    public static Object A01(C59962JcV jcV) {
        return ((C61080JwI) C59962JcV.A01(jcV).A0P.getValue()).A00;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61080JwI(C54617HLa hLa, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((Object) null, 47);
        this.A01 = 47;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61080JwI(C59721JVf jVf, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((Object) null, 43);
        this.A01 = 43;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61080JwI(C61000Juw juw, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((Object) null, 42);
        this.A01 = 42;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61080JwI(C66534MVo mVo, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((Object) null, 37);
        this.A01 = 37;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61080JwI(MediaGenAIDetectionMethod mediaGenAIDetectionMethod, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((Object) null, 44);
        this.A01 = 44;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61080JwI(AudioOverlayTrack audioOverlayTrack, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((Object) null, 40);
        this.A01 = 40;
    }

    public C61080JwI(int i, Integer num) {
        this.A01 = i;
        if (5 - i != 0) {
            0qQ.A0B(num, 1);
        }
        this.A00 = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61080JwI(C62320sa r2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((C62320sa) MK1.A00);
        this.A01 = 28;
    }

    public C61080JwI(C357268Xf r2) {
        this.A01 = 30;
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public C61080JwI(C62555Khl khl) {
        this.A01 = 33;
        0qQ.A0B(khl, 1);
        this.A00 = khl;
    }

    public C61080JwI(QOu qOu) {
        this.A01 = 9;
        0qQ.A0B(qOu, 1);
        this.A00 = qOu;
    }

    public C61080JwI(C62320sa r2) {
        this.A01 = 28;
        this.A00 = r2;
    }

    public C61080JwI(MediaTrialGraduationStrategy mediaTrialGraduationStrategy) {
        this.A01 = 45;
        this.A00 = mediaTrialGraduationStrategy;
    }

    public C61080JwI(XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint) {
        this.A01 = 15;
        this.A00 = xFBFXIGPCEntryPoint;
    }

    public C61080JwI(File file) {
        this.A01 = 49;
        this.A00 = file;
    }

    public C61080JwI(List list, int i) {
        this.A01 = i;
        switch (i) {
            case 2:
            case 3:
            case 6:
            case 11:
            case 20:
            case 22:
            case 27:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 32:
                0qQ.A0B(list, 1);
                break;
        }
        this.A00 = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61080JwI(Integer num, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(8, AnonymousClass05K.A0C);
        this.A01 = 8;
    }

    public C61080JwI(C61080JwI jwI, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this.A01 = 4;
        C61080JwI jwI2 = new C61080JwI(5, (Integer) null);
        this.A01 = 4;
        this.A00 = jwI2;
    }

    public C61080JwI() {
        this.A01 = 0;
        C59671JTb jTb = new C59671JTb(1);
        this.A01 = 0;
        this.A00 = jTb;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61080JwI(X.JVX r3, kotlin.jvm.internal.DefaultConstructorMarker r4, int r5, int r6) {
        /*
            r2 = this;
            r2.A01 = r6
            r1 = 0
            int r6 = 34 - r6
            if (r6 == 0) goto L_0x000d
            r0 = 38
        L_0x0009:
            r2.<init>((java.lang.Object) r1, (int) r0)
            return
        L_0x000d:
            r0 = 34
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61080JwI.<init>(X.JVX, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }

    public C61080JwI(SJS sjs, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this.A01 = 26;
        SJS sjs2 = SJS.A01;
        this.A01 = 26;
        0qQ.A0B(sjs2, 1);
        this.A00 = sjs2;
    }

    public C61080JwI(Bitmap bitmap, int i) {
        this.A01 = i;
        this.A00 = bitmap;
    }

    public C61080JwI(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public C61080JwI(Map map, int i) {
        this.A01 = i;
        this.A00 = map;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61080JwI(int r4) {
        /*
            r3 = this;
            r3.A01 = r4
            switch(r4) {
                case 32: goto L_0x003c;
                case 33: goto L_0x0005;
                case 34: goto L_0x0026;
                case 35: goto L_0x0005;
                case 36: goto L_0x0005;
                case 37: goto L_0x0022;
                case 38: goto L_0x001e;
                case 39: goto L_0x0005;
                case 40: goto L_0x001a;
                case 41: goto L_0x0034;
                case 42: goto L_0x0016;
                case 43: goto L_0x0012;
                case 44: goto L_0x000e;
                case 45: goto L_0x002a;
                default: goto L_0x0005;
            }
        L_0x0005:
            r1 = 0
            r0 = 47
        L_0x0008:
            r3.A01 = r0
            r3.<init>((java.lang.Object) r1, (int) r0)
            return
        L_0x000e:
            r1 = 0
            r0 = 44
            goto L_0x0008
        L_0x0012:
            r1 = 0
            r0 = 43
            goto L_0x0008
        L_0x0016:
            r1 = 0
            r0 = 42
            goto L_0x0008
        L_0x001a:
            r1 = 0
            r0 = 40
            goto L_0x0008
        L_0x001e:
            r1 = 0
            r0 = 38
            goto L_0x0008
        L_0x0022:
            r1 = 0
            r0 = 37
            goto L_0x0008
        L_0x0026:
            r1 = 0
            r0 = 34
            goto L_0x0008
        L_0x002a:
            r0 = 45
            r3.A01 = r0
            com.instagram.api.schemas.MediaTrialGraduationStrategy r0 = com.instagram.api.schemas.MediaTrialGraduationStrategy.MANUAL
            r3.<init>((com.instagram.api.schemas.MediaTrialGraduationStrategy) r0)
            return
        L_0x0034:
            r2 = 0
            r1 = 1
            r0 = 41
            r3.<init>((java.util.Map) r2, (kotlin.jvm.internal.DefaultConstructorMarker) r2, (int) r1, (int) r0)
            return
        L_0x003c:
            r1 = 32
            r3.A01 = r1
            X.0sn r0 = X.0sn.A00
            r3.<init>((java.util.List) r0, (int) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61080JwI.<init>(int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61080JwI(java.util.List r3, kotlin.jvm.internal.DefaultConstructorMarker r4, int r5, int r6) {
        /*
            r2 = this;
            r2.A01 = r6
            switch(r6) {
                case 2: goto L_0x0019;
                case 3: goto L_0x0013;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.0sn r1 = X.0sn.A00
            r0 = 32
        L_0x0009:
            r2.<init>((java.util.List) r1, (int) r0)
            return
        L_0x000d:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r0 = 6
            goto L_0x0009
        L_0x0013:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r0 = 3
            goto L_0x0009
        L_0x0019:
            X.0sn r1 = X.0sn.A00
            r0 = 2
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61080JwI.<init>(java.util.List, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61080JwI(java.util.Map r3, kotlin.jvm.internal.DefaultConstructorMarker r4, int r5, int r6) {
        /*
            r2 = this;
            r2.A01 = r6
            int r6 = 7 - r6
            if (r6 == 0) goto L_0x0010
            X.0sm r1 = X.0Yt.A0E()
            r0 = 41
        L_0x000c:
            r2.<init>((java.util.Map) r1, (int) r0)
            return
        L_0x0010:
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
            r0 = 7
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61080JwI.<init>(java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }
}
