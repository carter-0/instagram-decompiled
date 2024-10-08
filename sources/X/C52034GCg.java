package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.api.schemas.ClipsMashupType;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GCg  reason: case insensitive filesystem */
public final class C52034GCg implements CallerContextable {
    public static final I5Y A0V = new Object();
    public static final String __redex_internal_original_name = "ClipsOrganicMoreOptionsHelper";
    public C267324bN A00;
    public C52058GDe A01;
    public 1Xj A02;
    public AnonymousClass3W1 A03;
    public final FragmentActivity A04;
    public final AnonymousClass4DH A05;
    public final G7V A06;
    public final ClipsViewerConfig A07;
    public final C227282ix A08;
    public final JRO A09;
    public final 1wn A0A = new IO4((Object) this, 25);
    public final UserSession A0B;
    public final AnonymousClass4DU A0C;
    public final JSw A0D;
    public final AnonymousClass324 A0E;
    public final AnonymousClass93U A0F;
    public final GBE A0G;
    public final C55948HqC A0H;
    public final JTB A0I;
    public final JR6 A0J;
    public final C52179GHv A0K;
    public final C52035GCh A0L;
    public final H3C A0M;
    public final C52037GCj A0N;
    public final C52036GCi A0O;
    public final C52033GCf A0P;
    public final C55684Hlh A0Q;
    public final C52016GBn A0R;
    public final AnonymousClass0eM A0S = AnonymousClass1YB.A00(PzQ.A00);
    public final CallerContext A0T = CallerContext.A01(__redex_internal_original_name);
    public final C52009GBg A0U;

    public static final void A04(C67161s9 r2, C56160Hto hto, C52034GCg gCg) {
        C67231sQ A0n;
        1s8 r1 = null;
        if (r2 != null) {
            r1 = r2.FDi(1E4.A00(gCg.A0B));
        } else {
            C267324bN r0 = gCg.A00;
            if (r0 == null) {
                0qQ.A0F("clipsItem");
                throw AnonymousClass00P.createAndThrow();
            }
            1Xj r02 = r0.A02;
            if (!(r02 == null || (A0n = C51966G9m.A0n(r02)) == null)) {
                r1 = A0n.BP1();
            }
        }
        A03(r1, hto, gCg);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: X.4bJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: X.1sQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: X.1sQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v32, resolved type: X.4bJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v105, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v33, resolved type: X.1sQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v34, resolved type: X.1sQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v35, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r12v19, types: [X.07Z] */
    /* JADX WARNING: type inference failed for: r1v68, types: [X.07Z, X.4DH] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02b2, code lost:
        r4.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02b5, code lost:
        X.DbT.A1V(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02b8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0349, code lost:
        X.C56654I6j.A01(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x034c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x055d, code lost:
        X.AnonymousClass7TE.A1Z(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0560, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ef, code lost:
        r4.A08(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x095b, code lost:
        X.GE2.A03(r3.A05.A00, false);
        X.C56659I6o.A02(r4, X.C56713I8t.A00, (android.content.DialogInterface.OnClickListener) null, new X.I9B(r3, 8), (android.content.DialogInterface.OnShowListener) null, r2, r10, (X.C358278ae) null, (java.lang.Integer) null, r13, r14, r15, 2131954722);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0976, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x09aa, code lost:
        r4.A00 = new X.C54242H4l(r1, r0.A04);
        r0.A05.schedule(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x09b8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x014a, code lost:
        r3 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x014e, code lost:
        if (r3.mView == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0150, code lost:
        r1 = r0.A0P;
        r2 = r1.A02;
        r1 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0156, code lost:
        if (r2 == null) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0158, code lost:
        r4 = X.G9t.A0t(r3);
        r7 = new X.C58107ImT((java.lang.Object) r2, (java.lang.Object) r5, (java.lang.Object) r0, (X.AnonymousClass4D7) null, 14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x016a, code lost:
        if (r1 == null) goto L_0x1221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x016c, code lost:
        r4 = X.G9t.A0t(r3);
        r7 = new X.C58107ImT((java.lang.Object) r1, (java.lang.Object) r5, (java.lang.Object) r0, (X.AnonymousClass4D7) null, 15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0180, code lost:
        r3 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0184, code lost:
        if (r3.mView == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0186, code lost:
        r1 = r0.A0P;
        r2 = r1.A03;
        r1 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x018c, code lost:
        if (r2 == null) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x018e, code lost:
        r4 = X.G9t.A0t(r3);
        r7 = new X.C58107ImT((java.lang.Object) r2, (java.lang.Object) r5, (java.lang.Object) r0, (X.AnonymousClass4D7) null, 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01a0, code lost:
        if (r1 == null) goto L_0x1225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a2, code lost:
        r4 = X.G9t.A0t(r3);
        r7 = new X.C58107ImT((java.lang.Object) r1, (java.lang.Object) r5, (java.lang.Object) r0, (X.AnonymousClass4D7) null, 17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01b9, code lost:
        r3 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01bb, code lost:
        if (r3 == null) goto L_0x123e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01bd, code lost:
        r3 = r3.getId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c1, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01c3, code lost:
        r11 = X.1Xv.A06(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c7, code lost:
        if (r11 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c9, code lost:
        r7 = X.LK1.A01(r8, r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01cf, code lost:
        if (r5 != com.instagram.api.schemas.MediaTrialGraduationStrategy.A05) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d1, code lost:
        r1 = 3702;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d3, code lost:
        X.LSk.A02((X.C60763Jqu) null, r7, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_USER, "overflow_menu", X.AnonymousClass000.A00(r1), r11);
        r4 = X.G9t.A0t(r0.A05);
        r7 = new X.C58086Ilc(r0, r5, r11, (X.AnonymousClass4D7) null, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01f1, code lost:
        r1 = 3703;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:818:0x10de, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36325360216191910L) == false) goto L_0x10e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:858:0x11e9, code lost:
        if (X.C51969G9p.A1Z(r4, r0.getId()) == false) goto L_0x11eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:866:0x1221, code lost:
        A01(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:867:0x1224, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:868:0x1225, code lost:
        A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:869:0x1228, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:870:0x1229, code lost:
        X.0qQ.A0F(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:873:0x1231, code lost:
        X.0qQ.A0F("media");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:874:0x1238, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:877:0x123e, code lost:
        X.0qQ.A0F("media");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:896:0x1277, code lost:
        X.0qQ.A0F(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:898:0x127e, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:917:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:918:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:919:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:920:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:639:0x0e13  */
    /* JADX WARNING: Removed duplicated region for block: B:703:0x0ece  */
    /* JADX WARNING: Removed duplicated region for block: B:895:0x1276  */
    /* JADX WARNING: Removed duplicated region for block: B:901:0x1286  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(X.HNR r35) {
        /*
            r34 = this;
            r5 = 0
            r0 = r34
            X.4DU r8 = r0.A0C
            com.instagram.common.session.UserSession r1 = r0.A0B
            X.93U r2 = r0.A0F
            r25 = r2
            java.lang.String r9 = r25.CFD()
            X.1Xj r11 = r0.A02
            if (r11 == 0) goto L_0x12ba
            X.GDe r2 = r0.A01
            if (r2 == 0) goto L_0x12bd
            X.3W1 r2 = r2.A0E
            if (r2 == 0) goto L_0x0561
            int r10 = r2.getPosition()
        L_0x001f:
            java.lang.String r6 = X.I5Y.A00(r35)
            r7 = 2
            X.0wc r3 = X.C51967G9n.A0Z(r8, r1, r9, r7)
            java.lang.String r2 = "instagram_clips_overflow_menu_option_tap"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r3, r2)
            boolean r2 = r4.isSampled()
            if (r2 == 0) goto L_0x0052
            X.DbW.A16(r4, r8)
            java.lang.String r2 = "menu_option"
            r4.AAJ(r2, r6)
            java.lang.String r2 = r11.A30()
            if (r2 == 0) goto L_0x12b5
            X.G9t.A1J(r4, r2)
            long r2 = (long) r10
            X.C51970G9q.A19(r4, r2)
            X.C51965G9l.A1O(r4, r9)
            X.C51973G9u.A10(r4)
            X.DbX.A1L(r4)
        L_0x0052:
            int r11 = r35.ordinal()
            r3 = -1
            java.lang.String r16 = "clipsItem"
            r2 = 1
            java.lang.String r10 = "clipsItemState"
            java.lang.String r14 = "media"
            r6 = 0
            switch(r11) {
                case 7: goto L_0x07c1;
                case 8: goto L_0x01f4;
                case 9: goto L_0x0741;
                case 10: goto L_0x0991;
                case 11: goto L_0x0991;
                case 12: goto L_0x0d39;
                case 13: goto L_0x00b4;
                case 14: goto L_0x0803;
                case 15: goto L_0x0063;
                case 16: goto L_0x093d;
                case 17: goto L_0x0079;
                case 18: goto L_0x1242;
                case 19: goto L_0x00d2;
                case 20: goto L_0x0063;
                case 21: goto L_0x0823;
                case 22: goto L_0x0063;
                case 23: goto L_0x0063;
                case 24: goto L_0x0c79;
                case 25: goto L_0x0c66;
                case 26: goto L_0x0612;
                case 27: goto L_0x060e;
                case 28: goto L_0x0769;
                case 29: goto L_0x0063;
                case 30: goto L_0x0063;
                case 31: goto L_0x00f4;
                case 32: goto L_0x0063;
                case 33: goto L_0x0063;
                case 34: goto L_0x0114;
                case 35: goto L_0x0063;
                case 36: goto L_0x0be0;
                case 37: goto L_0x0063;
                case 38: goto L_0x0063;
                case 39: goto L_0x0acf;
                case 40: goto L_0x05f2;
                case 41: goto L_0x0063;
                case 42: goto L_0x0063;
                case 43: goto L_0x0063;
                case 44: goto L_0x0063;
                case 45: goto L_0x0063;
                case 46: goto L_0x0063;
                case 47: goto L_0x0063;
                case 48: goto L_0x0451;
                case 49: goto L_0x0451;
                case 50: goto L_0x1054;
                case 51: goto L_0x0451;
                case 52: goto L_0x0063;
                case 53: goto L_0x0063;
                case 54: goto L_0x0063;
                case 55: goto L_0x0063;
                case 56: goto L_0x0063;
                case 57: goto L_0x0063;
                case 58: goto L_0x0063;
                case 59: goto L_0x0063;
                case 60: goto L_0x0063;
                case 61: goto L_0x0063;
                case 62: goto L_0x0063;
                case 63: goto L_0x0063;
                case 64: goto L_0x0063;
                case 65: goto L_0x0063;
                case 66: goto L_0x0977;
                case 67: goto L_0x0977;
                case 68: goto L_0x0063;
                case 69: goto L_0x0a2d;
                case 70: goto L_0x0063;
                case 71: goto L_0x0063;
                case 72: goto L_0x0063;
                case 73: goto L_0x0063;
                case 74: goto L_0x0142;
                case 75: goto L_0x0145;
                case 76: goto L_0x0148;
                case 77: goto L_0x017e;
                case 78: goto L_0x0c83;
                case 79: goto L_0x0c83;
                case 80: goto L_0x0c83;
                case 81: goto L_0x0c83;
                case 82: goto L_0x0c9a;
                case 83: goto L_0x0393;
                case 84: goto L_0x09b9;
                case 85: goto L_0x0a3d;
                case 86: goto L_0x08ad;
                case 87: goto L_0x034d;
                case 88: goto L_0x034d;
                case 89: goto L_0x0aab;
                case 90: goto L_0x0d23;
                case 91: goto L_0x0d2d;
                case 92: goto L_0x074b;
                case 93: goto L_0x020d;
                case 94: goto L_0x020d;
                case 95: goto L_0x022f;
                case 96: goto L_0x022f;
                case 97: goto L_0x0063;
                case 98: goto L_0x1004;
                case 99: goto L_0x0a6f;
                case 100: goto L_0x0a6f;
                case 101: goto L_0x0c5c;
                case 102: goto L_0x0063;
                case 103: goto L_0x0063;
                case 104: goto L_0x0063;
                case 105: goto L_0x065a;
                case 106: goto L_0x0664;
                case 107: goto L_0x0063;
                case 108: goto L_0x0063;
                case 109: goto L_0x0616;
                case 110: goto L_0x0638;
                case 111: goto L_0x0063;
                case 112: goto L_0x0063;
                case 113: goto L_0x0d57;
                case 114: goto L_0x0d57;
                case 115: goto L_0x03c4;
                case 116: goto L_0x0ff6;
                case 117: goto L_0x03fd;
                case 118: goto L_0x0063;
                case 119: goto L_0x0063;
                case 120: goto L_0x0063;
                case 121: goto L_0x0063;
                case 122: goto L_0x07cb;
                case 123: goto L_0x0063;
                case 124: goto L_0x0ffc;
                case 125: goto L_0x101a;
                case 126: goto L_0x0063;
                case 127: goto L_0x066e;
                case 128: goto L_0x0696;
                case 129: goto L_0x06bf;
                case 130: goto L_0x06c3;
                case 131: goto L_0x06c7;
                case 132: goto L_0x06cb;
                case 133: goto L_0x04ce;
                case 134: goto L_0x0063;
                case 135: goto L_0x0063;
                case 136: goto L_0x0063;
                case 137: goto L_0x0063;
                case 138: goto L_0x0063;
                case 139: goto L_0x0063;
                case 140: goto L_0x0063;
                case 141: goto L_0x0251;
                case 142: goto L_0x106e;
                case 143: goto L_0x031f;
                case 144: goto L_0x00f4;
                case 145: goto L_0x0606;
                case 146: goto L_0x060a;
                case 147: goto L_0x04f7;
                case 148: goto L_0x01b4;
                case 149: goto L_0x01b7;
                case 150: goto L_0x111e;
                case 151: goto L_0x1148;
                case 152: goto L_0x1186;
                case 153: goto L_0x0063;
                case 154: goto L_0x1171;
                case 155: goto L_0x11c7;
                case 156: goto L_0x06cf;
                case 157: goto L_0x1211;
                default: goto L_0x0063;
            }
        L_0x0063:
            X.0wj r2 = X.0wj.A01
            r1 = 817902720(0x30c03480, float:1.398476E-9)
            java.lang.String r0 = "ClipsOrganicMoreOptionsHelper"
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r1 = "message"
            java.lang.String r0 = "Unsupported click action for Clips Viewer Overflow menu."
            r2.ABQ(r1, r0)
            r2.report()
        L_0x0078:
            return
        L_0x0079:
            androidx.fragment.app.FragmentActivity r8 = r0.A04
            X.4DH r7 = r0.A05
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x1231
            com.instagram.clips.intf.ClipsViewerConfig r0 = r0.A07
            X.4gf r6 = r0.A0T
            java.lang.String r14 = r3.A2n()
            if (r14 == 0) goto L_0x0564
            X.8ab r4 = X.DbS.A0X(r8)
            r0 = 2131953152(0x7f130600, float:1.9542767E38)
            r4.A09(r0)
            r0 = 2131953151(0x7f1305ff, float:1.9542765E38)
            X.DbU.A17(r8, r4, r0)
            r0 = 2131953150(0x7f1305fe, float:1.9542763E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r8, r0)
            r15 = 6
            X.FIk r3 = new X.FIk
            r9 = r3
            r10 = r8
            r11 = r6
            r12 = r7
            r13 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            X.8ae r0 = X.C358278ae.BLUE_BOLD
            r4.A0Y(r3, r0, r5, r2)
            goto L_0x02b2
        L_0x00b4:
            X.4bN r1 = r0.A00
            if (r1 == 0) goto L_0x12bf
            X.1Xj r1 = r1.A02
            if (r1 == 0) goto L_0x0569
            boolean r1 = r1.A4Z()
            if (r1 != r2) goto L_0x0569
            androidx.fragment.app.FragmentActivity r0 = r0.A04
            X.8ab r4 = X.DbS.A0X(r0)
            r0 = 2131975818(0x7f135e8a, float:1.958874E38)
            r4.A09(r0)
            r0 = 2131975819(0x7f135e8b, float:1.9588741E38)
            goto L_0x00ef
        L_0x00d2:
            X.4bN r3 = r0.A00
            if (r3 == 0) goto L_0x12bf
            X.1Xj r3 = r3.A02
            if (r3 == 0) goto L_0x05c7
            boolean r3 = r3.A4Z()
            if (r3 != r2) goto L_0x05c7
            androidx.fragment.app.FragmentActivity r0 = r0.A04
            X.8ab r4 = X.DbS.A0X(r0)
            r0 = 2131975823(0x7f135e8f, float:1.958875E38)
            r4.A09(r0)
            r0 = 2131975824(0x7f135e90, float:1.9588751E38)
        L_0x00ef:
            r4.A08(r0)
            goto L_0x02b2
        L_0x00f4:
            androidx.fragment.app.FragmentActivity r6 = r0.A04
            X.4bN r5 = r0.A00
            if (r5 == 0) goto L_0x1229
            X.JRO r4 = r0.A09
            X.GBE r3 = r0.A0G
            X.HqC r2 = r0.A0H
            X.GBn r0 = r0.A0R
            java.lang.String r18 = r5.getId()
            X.TpH r14 = X.C14068TpH.CLIPS_POST
            r9 = r6
            r10 = r5
            r11 = r4
            r12 = r1
            r13 = r8
            r15 = r3
            r16 = r2
            r17 = r0
            goto L_0x0349
        L_0x0114:
            r1 = 13
            X.I9B r3 = new X.I9B
            r3.<init>(r0, r1)
            androidx.fragment.app.FragmentActivity r1 = r0.A04
            X.8ab r4 = X.DbS.A0X(r1)
            r1 = 2131972038(0x7f134fc6, float:1.9581072E38)
            r4.A09(r1)
            r1 = 2131972104(0x7f135008, float:1.9581206E38)
            r4.A08(r1)
            r2 = 22
            X.I8y r1 = new X.I8y
            r1.<init>((int) r2, (java.lang.Object) r3, (java.lang.Object) r0)
            r4.A0E(r1)
            r0 = 50
            X.I8z r0 = X.C56719I8z.A00(r3, r0)
            r4.A0C(r0)
            goto L_0x02b5
        L_0x0142:
            com.instagram.clips.intf.ClipsViewerSource r5 = com.instagram.clips.intf.ClipsViewerSource.REMIX_REEL
            goto L_0x014a
        L_0x0145:
            com.instagram.clips.intf.ClipsViewerSource r5 = com.instagram.clips.intf.ClipsViewerSource.REMIX_ORIGINAL_REEL
            goto L_0x0180
        L_0x0148:
            com.instagram.clips.intf.ClipsViewerSource r5 = com.instagram.clips.intf.ClipsViewerSource.SEQUENCE_REEL
        L_0x014a:
            X.4DH r3 = r0.A05
            android.view.View r1 = r3.mView
            if (r1 == 0) goto L_0x0078
            X.GCf r1 = r0.A0P
            X.2Q9 r2 = r1.A02
            X.2Q9 r1 = r1.A01
            if (r2 == 0) goto L_0x016a
            X.0xx r4 = X.G9t.A0t(r3)
            r12 = 14
            X.ImT r3 = new X.ImT
            r7 = r3
            r8 = r2
            r9 = r5
            r10 = r0
            r11 = r6
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (X.AnonymousClass4D7) r11, (int) r12)
            goto L_0x055d
        L_0x016a:
            if (r1 == 0) goto L_0x1221
            X.0xx r4 = X.G9t.A0t(r3)
            r12 = 15
            X.ImT r3 = new X.ImT
            r7 = r3
            r8 = r1
            r9 = r5
            r10 = r0
            r11 = r6
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (X.AnonymousClass4D7) r11, (int) r12)
            goto L_0x055d
        L_0x017e:
            com.instagram.clips.intf.ClipsViewerSource r5 = com.instagram.clips.intf.ClipsViewerSource.SEQUENCE_ORIGINAL_REEL
        L_0x0180:
            X.4DH r3 = r0.A05
            android.view.View r1 = r3.mView
            if (r1 == 0) goto L_0x0078
            X.GCf r1 = r0.A0P
            X.2Q9 r2 = r1.A03
            X.2Q9 r1 = r1.A01
            if (r2 == 0) goto L_0x01a0
            X.0xx r4 = X.G9t.A0t(r3)
            r12 = 16
            X.ImT r3 = new X.ImT
            r7 = r3
            r8 = r2
            r9 = r5
            r10 = r0
            r11 = r6
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (X.AnonymousClass4D7) r11, (int) r12)
            goto L_0x055d
        L_0x01a0:
            if (r1 == 0) goto L_0x1225
            X.0xx r4 = X.G9t.A0t(r3)
            r12 = 17
            X.ImT r3 = new X.ImT
            r7 = r3
            r8 = r1
            r9 = r5
            r10 = r0
            r11 = r6
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (X.AnonymousClass4D7) r11, (int) r12)
            goto L_0x055d
        L_0x01b4:
            com.instagram.api.schemas.MediaTrialGraduationStrategy r5 = com.instagram.api.schemas.MediaTrialGraduationStrategy.SS_PERFORMANCE
            goto L_0x01b9
        L_0x01b7:
            com.instagram.api.schemas.MediaTrialGraduationStrategy r5 = com.instagram.api.schemas.MediaTrialGraduationStrategy.MANUAL
        L_0x01b9:
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            java.lang.String r3 = r3.getId()
            if (r3 == 0) goto L_0x0078
            java.lang.String r11 = X.1Xv.A06(r3)
            if (r11 == 0) goto L_0x0078
            X.LSk r7 = X.LK1.A01(r8, r1, r9)
            com.instagram.api.schemas.MediaTrialGraduationStrategy r1 = com.instagram.api.schemas.MediaTrialGraduationStrategy.SS_PERFORMANCE
            if (r5 != r1) goto L_0x01f1
            r1 = 3702(0xe76, float:5.188E-42)
        L_0x01d3:
            java.lang.String r10 = X.AnonymousClass000.A00(r1)
            java.lang.String r8 = "user"
            java.lang.String r9 = "overflow_menu"
            X.LSk.A02(r6, r7, r8, r9, r10, r11)
            X.4DH r1 = r0.A05
            X.0xx r4 = X.G9t.A0t(r1)
            X.Ilc r3 = new X.Ilc
            r7 = r3
            r8 = r0
            r9 = r5
            r10 = r11
            r11 = r6
            r12 = r2
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x055d
        L_0x01f1:
            r1 = 3703(0xe77, float:5.189E-42)
            goto L_0x01d3
        L_0x01f4:
            X.1Xj r1 = r0.A02
            if (r1 == 0) goto L_0x123e
            java.lang.String r2 = r1.A2n()
            if (r2 == 0) goto L_0x0078
            X.4DH r1 = r0.A05
            X.0xx r4 = X.AnonymousClass07a.A00(r1)
            r1 = 12
            X.IlT r3 = new X.IlT
            r3.<init>(r0, r2, r6, r1)
            goto L_0x055d
        L_0x020d:
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x123e
            boolean r5 = r2.A5c()
            X.4DH r2 = r0.A05
            android.content.Context r4 = r2.getContext()
            if (r4 == 0) goto L_0x0078
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            r2 = r5 ^ 1
            r0 = 2131964939(0x7f13340b, float:1.9566674E38)
            if (r5 == 0) goto L_0x022b
            r0 = 2131964941(0x7f13340d, float:1.9566678E38)
        L_0x022b:
            X.C56305HwI.A00(r4, r1, r3, r0, r2)
            return
        L_0x022f:
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x123e
            boolean r5 = r2.A61()
            X.4DH r2 = r0.A05
            android.content.Context r4 = r2.getContext()
            if (r4 == 0) goto L_0x0078
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            r2 = r5 ^ 1
            r0 = 2131973458(0x7f135552, float:1.9583952E38)
            if (r5 == 0) goto L_0x024d
            r0 = 2131973459(0x7f135553, float:1.9583954E38)
        L_0x024d:
            X.C56305HwI.A01(r4, r1, r3, r0, r2)
            return
        L_0x0251:
            androidx.fragment.app.FragmentActivity r8 = r0.A04
            X.4DH r3 = r0.A05
            android.content.Context r7 = r3.requireContext()
            X.1Xj r9 = r0.A02
            if (r9 == 0) goto L_0x123e
            X.1sQ r0 = X.C51966G9m.A0n(r9)
            if (r0 == 0) goto L_0x0279
            com.instagram.api.schemas.OriginalityInfo r0 = r0.BZI()
            if (r0 == 0) goto L_0x0279
            com.instagram.api.schemas.OriginalitySourceMediaInfo r0 = r0.BZ4()
            if (r0 == 0) goto L_0x0279
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x0279
            java.lang.String r6 = r0.getId()
        L_0x0279:
            com.instagram.user.model.User r0 = X.DbT.A0j(r1)
            boolean r0 = X.DbV.A1Z(r0, r6)
            if (r0 == 0) goto L_0x02b9
            r0 = 2131957159(0x7f1315a7, float:1.9550894E38)
            java.lang.String r3 = r7.getString(r0)
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r3)
        L_0x028f:
            X.8ab r4 = X.DbS.A0X(r8)
            r3 = 2131957160(0x7f1315a8, float:1.9550896E38)
            r4.A09(r3)
            r4.A0q(r0)
            r3 = 2131957157(0x7f1315a5, float:1.955089E38)
            X.DE5 r0 = new X.DE5
            r0.<init>(r5, r8, r1, r9)
            r4.A0J(r0, r3)
            r3 = 2131964884(0x7f1333d4, float:1.9566562E38)
            X.I8y r0 = new X.I8y
            r0.<init>((int) r2, (java.lang.Object) r7, (java.lang.Object) r1)
            r4.A0G(r0, r3)
        L_0x02b2:
            r4.A05()
        L_0x02b5:
            X.DbT.A1V(r4)
            return
        L_0x02b9:
            com.instagram.api.schemas.OriginalitySourceMediaInfo r0 = X.AnonymousClass3Y9.A00(r9)
            if (r0 == 0) goto L_0x0078
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x0078
            java.lang.String r10 = r0.getUsername()
            android.content.res.Resources r3 = r7.getResources()
            android.text.SpannableStringBuilder r6 = X.C51965G9l.A0E()
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            r0 = 2131957158(0x7f1315a6, float:1.9550892E38)
            java.lang.String r0 = r3.getString(r0)
            r6.append(r0)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r2)
            java.lang.String r3 = "{username}"
            java.lang.Object[] r11 = new java.lang.Object[]{r0}
            boolean r0 = r4.isEmpty()
            X.17k.A0F(r0)
            java.lang.String r0 = java.util.regex.Pattern.quote(r3)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r3 = r0.matcher(r6)
            boolean r0 = r3.find()
            if (r0 == 0) goto L_0x0318
            int r4 = r3.start()
            int r0 = r3.end()
            r6.replace(r4, r0, r10)
            r3 = r11[r5]
            int r0 = X.C51966G9m.A05(r10, r4)
            r6.setSpan(r3, r4, r0, r5)
        L_0x0318:
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r6)
            goto L_0x028f
        L_0x031f:
            androidx.fragment.app.FragmentActivity r9 = r0.A04
            X.4bN r7 = r0.A00
            if (r7 == 0) goto L_0x1229
            X.JRO r5 = r0.A09
            X.GBE r4 = r0.A0G
            X.HqC r3 = r0.A0H
            X.2YN r2 = new X.2YN
            r2.<init>(r9)
            java.lang.Class<X.GIc> r0 = X.C52186GIc.class
            X.2YL r0 = r2.A00(r0)
            X.GIc r0 = (X.C52186GIc) r0
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0078
            X.TpH r14 = X.C14068TpH.IG_CLIPS_SPIN
            r10 = r7
            r11 = r5
            r12 = r1
            r13 = r8
            r15 = r4
            r16 = r3
            r17 = r6
            r18 = r0
        L_0x0349:
            X.C56654I6j.A01(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x034d:
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x123e
            com.instagram.user.model.User r5 = r2.A2A(r1)
            if (r5 == 0) goto L_0x0078
            androidx.fragment.app.FragmentActivity r0 = r0.A04
            android.content.Context r4 = X.DbT.A05(r0)
            boolean r0 = r5.A22()
            r3 = r0 ^ 1
            X.4Cl r2 = r5.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.EW5(r0)
            r5.A0d(r1)
            java.lang.String r2 = r5.getId()
            if (r3 == 0) goto L_0x0390
            r0 = 3106(0xc22, float:4.352E-42)
        L_0x0377:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.1OC r3 = X.C49171Eqc.A00(r1, r2, r0)
            r2 = 17
            X.EDb r0 = new X.EDb
            r0.<init>((int) r2, (java.lang.Object) r1, (java.lang.Object) r5, (java.lang.Object) r4)
            r3.A00 = r0
            X.1ET r0 = X.1ES.A01()
            r0.schedule(r3)
            return
        L_0x0390:
            r0 = 4141(0x102d, float:5.803E-42)
            goto L_0x0377
        L_0x0393:
            androidx.fragment.app.FragmentActivity r8 = r0.A04
            X.4DH r7 = r0.A05
            X.1Xj r6 = r0.A02
            if (r6 == 0) goto L_0x123e
            java.util.List r0 = r6.A3U()
            if (r0 == 0) goto L_0x0078
            X.28D r5 = X.28D.A1v
            X.Hrt r4 = X.C250563lf.A0C(r5)
            r4.A0j = r0
            X.0Tu r0 = X.0Tu.A05
            r2 = 36317874088056443(0x8106ea0004167b, double:3.030908041403225E-306)
            boolean r0 = X.182.A06(r0, r1, r2)
            if (r0 == 0) goto L_0x03bc
            com.instagram.music.common.config.MusicAttributionConfig r0 = X.I7J.A03(r6)
            r4.A08 = r0
        L_0x03bc:
            android.os.Bundle r0 = r4.A00()
            X.I3M.A00(r8, r0, r7, r5, r1)
            return
        L_0x03c4:
            X.4DH r3 = r0.A05
            android.view.View r2 = r3.mView
            if (r2 == 0) goto L_0x0078
            X.Hto r5 = new X.Hto
            r5.<init>(r1)
            X.GCf r1 = r0.A0P
            X.2Q9 r2 = r1.A00
            X.2Q9 r1 = r1.A01
            if (r2 == 0) goto L_0x03e9
            X.0xx r4 = X.G9t.A0t(r3)
            r12 = 18
            X.ImT r3 = new X.ImT
            r7 = r3
            r8 = r2
            r9 = r5
            r10 = r0
            r11 = r6
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (X.AnonymousClass4D7) r11, (int) r12)
            goto L_0x055d
        L_0x03e9:
            if (r1 == 0) goto L_0x122d
            X.0xx r4 = X.G9t.A0t(r3)
            r12 = 19
            X.ImT r3 = new X.ImT
            r7 = r3
            r8 = r1
            r9 = r5
            r10 = r0
            r11 = r6
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (X.AnonymousClass4D7) r11, (int) r12)
            goto L_0x055d
        L_0x03fd:
            X.GHv r3 = r0.A0K
            X.Jw6 r2 = r3.A00
            if (r2 == 0) goto L_0x0078
            android.content.Context r6 = r3.A02
            com.instagram.common.session.UserSession r9 = r3.A06
            androidx.fragment.app.Fragment r8 = r3.A04
            java.lang.Object r0 = r2.A03
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r11 = r0.A2n()
            java.lang.Object r1 = r2.A03
            X.1Xj r1 = (X.1Xj) r1
            java.util.List r0 = X.C51965G9l.A0w(r1)
            r13 = 1
            if (r0 == 0) goto L_0x044f
            boolean r12 = X.AnonymousClass7TE.A1b(r0)
        L_0x0420:
            boolean r0 = X.AnonymousClass3WS.A0C(r1)
            if (r0 != 0) goto L_0x042d
            boolean r0 = X.AnonymousClass3WS.A0D(r1)
            if (r0 != 0) goto L_0x042d
            r13 = 0
        L_0x042d:
            X.3WR r1 = r1.CEL()
            java.util.Locale r0 = X.AnonymousClass1Q2.A03()
            java.lang.String r0 = r0.getLanguage()
            X.0qQ.A07(r0)
            boolean r14 = r1.A09(r0)
            X.I9G r7 = new X.I9G
            r7.<init>(r5, r2, r3)
            r0 = 425(0x1a9, float:5.96E-43)
            java.lang.String r10 = X.C273654mx.A00(r0)
            X.C49937FFq.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x044f:
            r12 = 0
            goto L_0x0420
        L_0x0451:
            java.lang.Integer r20 = X.C246353eS.A02(r1)
            if (r20 == 0) goto L_0x1239
            X.1Xj r2 = r0.A02
            r7 = 0
            if (r2 == 0) goto L_0x1231
            X.Dfd r15 = X.C246353eS.A01(r2)
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x1231
            X.HPj r6 = X.C59724JVi.A00(r2)
            boolean r2 = r6 instanceof X.KYX
            if (r2 == 0) goto L_0x0498
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x1231
            r16 = r8
            r17 = r1
            r18 = r2
            r19 = r6
            X.C246353eS.A08(r15, r16, r17, r18, r19, r20)
            X.LQz r5 = X.C64158LQz.A00
            X.4DH r0 = r0.A05
            android.content.Context r4 = r0.requireContext()
            X.KYX r6 = (X.KYX) r6
            X.Ki8 r3 = r6.A00()
            java.lang.String r2 = r6.A00
            if (r2 == 0) goto L_0x0494
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0494
            r7 = r2
        L_0x0494:
            r5.A01(r4, r1, r3, r7)
            return
        L_0x0498:
            boolean r2 = r15.A00()
            if (r2 != 0) goto L_0x0078
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x1231
            r16 = r8
            r17 = r1
            r18 = r2
            r19 = r6
            X.C246353eS.A08(r15, r16, r17, r18, r19, r20)
            X.818 r7 = X.AnonymousClass818.IG_REELS_OVERFLOW_MENU
            X.JZY r6 = X.JZY.SHARE_CLICK
            X.JZZ r5 = X.JZZ.REELS
            X.Jqo r4 = new X.Jqo
            r4.<init>()
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x1231
            java.lang.String r3 = r2.getId()
            java.lang.String r2 = "media_id"
            r4.A06(r2, r3)
            X.JZX.A00(r6, r5, r7, r4, r1)
            X.2ix r0 = r0.A08
            r0.Dk4()
            return
        L_0x04ce:
            X.8aR r3 = new X.8aR
            r3.<init>(r8, r1)
            java.lang.String r2 = "reels_viewer_overflow_menu_create_sticker_tapped"
            X.C358148aR.A01(r3, r2)
            X.4DH r4 = r0.A05
            X.0hq r3 = r4.mFragmentManager
            if (r3 == 0) goto L_0x0078
            androidx.fragment.app.FragmentActivity r2 = r0.A04
            android.content.Context r9 = r4.requireContext()
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x123e
            X.0gy r13 = X.AnonymousClass07i.A00(r2)
            r10 = r2
            r11 = r3
            r12 = r4
            r14 = r8
            r15 = r1
            r16 = r0
            X.C56266Hva.A01(r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x04f7:
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x123e
            java.lang.String r2 = r2.A2n()
            if (r2 == 0) goto L_0x0078
            X.LSk r15 = X.LK1.A01(r8, r1, r9)
            X.1Xj r1 = r0.A02
            if (r1 == 0) goto L_0x123e
            X.1Xy r1 = r1.A0C
            java.lang.Integer r1 = r1.Bd0()
            int r5 = X.DbX.A01(r1)
            X.1Xj r1 = r0.A02
            if (r1 == 0) goto L_0x123e
            int r4 = r1.A0v()
            X.1Xj r1 = r0.A02
            if (r1 == 0) goto L_0x123e
            int r3 = r1.A0r()
            X.1Xj r1 = r0.A02
            if (r1 == 0) goto L_0x123e
            int r1 = r1.A11()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            java.lang.String r11 = "active"
            r4 = r6
            r5 = r6
            r12 = r6
            r13 = r6
            X.Jqu r14 = X.LSk.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r16 = "user"
            java.lang.String r17 = "overflow_menu"
            java.lang.String r18 = "tap_share"
            r19 = r2
            X.LSk.A02(r14, r15, r16, r17, r18, r19)
            X.4DH r1 = r0.A05
            X.0xx r4 = X.G9t.A0t(r1)
            r1 = 13
            X.IlT r3 = new X.IlT
            r3.<init>(r0, r2, r6, r1)
        L_0x055d:
            X.AnonymousClass7TE.A1Z(r3, r4)
            return
        L_0x0561:
            r10 = -1
            goto L_0x001f
        L_0x0564:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0569:
            X.GCh r2 = r0.A0L
            X.4bN r3 = r0.A00
            if (r3 == 0) goto L_0x12bf
            com.instagram.common.session.UserSession r14 = r2.A03
            X.1QP r6 = X.AnonymousClass1QO.A00(r14)
            java.lang.String r0 = "delete_reel_confirmation_dialog"
            com.facebook.quicklog.reliability.UserFlowConfig r4 = new com.facebook.quicklog.reliability.UserFlowConfig
            r4.<init>(r0, r5)
            r0 = 658062002(0x27393ab2, double:3.25125828E-315)
            r6.flowStart(r0, r4)
            r2.A00 = r5
            X.4DH r10 = r2.A02
            androidx.fragment.app.FragmentActivity r0 = r10.requireActivity()
            X.GBE r1 = r2.A04
            X.EUh r11 = new X.EUh
            r11.<init>(r0, r3, r14, r1)
            r0 = 17
            X.I8y r8 = new X.I8y
            r8.<init>((int) r0, (java.lang.Object) r2, (java.lang.Object) r6)
            X.I9G r9 = new X.I9G
            r9.<init>(r7, r2, r6)
            androidx.fragment.app.FragmentActivity r0 = r10.requireActivity()
            X.EUg r12 = new X.EUg
            r12.<init>(r0, r3, r14, r1)
            androidx.fragment.app.FragmentActivity r0 = r10.requireActivity()
            X.HKF r13 = new X.HKF
            r13.<init>(r0, r3, r14, r1)
            X.1Xj r15 = r3.A02
            if (r15 == 0) goto L_0x05c2
            androidx.fragment.app.FragmentActivity r7 = r2.A01
            r1 = 21
            X.Ivj r0 = new X.Ivj
            r0.<init>(r2, r1)
            r16 = r0
            X.C56659I6o.A01(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x05c2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x05c7:
            androidx.fragment.app.FragmentActivity r6 = r0.A04
            X.1Xj r4 = r0.A02
            if (r4 == 0) goto L_0x12ba
            X.3W1 r2 = r0.A03
            if (r2 == 0) goto L_0x05ed
            X.Hlh r0 = r0.A0Q
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            int r11 = r2.getPosition()
            java.lang.String r0 = r0.A00
            r7 = r1
            r8 = r4
            r10 = r0
            r12 = r5
            android.os.Bundle r2 = X.C63502KyD.A00(r7, r8, r9, r10, r11, r12)
            r0 = 253(0xfd, float:3.55E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.DbU.A0w(r6, r2, r1, r3, r0)
            return
        L_0x05ed:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x05f2:
            X.JR6 r3 = r0.A0J
            X.4bN r2 = r0.A00
            if (r2 != 0) goto L_0x05fc
            r10 = r16
            goto L_0x1277
        L_0x05fc:
            X.GDe r1 = r0.A01
            if (r1 == 0) goto L_0x1277
            com.instagram.api.schemas.MediaControlEventSourceEnum r0 = com.instagram.api.schemas.MediaControlEventSourceEnum.THREE_DOT_MENU
            r3.DYM(r0, r2, r1)
            return
        L_0x0606:
            r0.A08(r2)
            return
        L_0x060a:
            r0.A08(r5)
            return
        L_0x060e:
            r0.A0A(r5)
            return
        L_0x0612:
            r0.A0A(r2)
            return
        L_0x0616:
            X.4DH r4 = r0.A05
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            X.4bN r2 = r0.A00
            if (r2 == 0) goto L_0x1229
            X.1Xj r2 = r2.A02
            if (r2 == 0) goto L_0x0628
            X.1sQ r6 = X.C51966G9m.A0n(r2)
        L_0x0628:
            X.GDe r0 = r0.A01
            if (r0 == 0) goto L_0x1277
            int r9 = r0.A09()
            r5 = r6
            r6 = r8
            r7 = r1
            r8 = r3
            X.C56370HxO.A00(r4, r5, r6, r7, r8, r9)
            return
        L_0x0638:
            X.4DH r4 = r0.A05
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            X.4bN r2 = r0.A00
            if (r2 == 0) goto L_0x1229
            X.1Xj r2 = r2.A02
            if (r2 == 0) goto L_0x064a
            X.1sQ r6 = X.C51966G9m.A0n(r2)
        L_0x064a:
            X.GDe r0 = r0.A01
            if (r0 == 0) goto L_0x1277
            int r9 = r0.A09()
            r5 = r6
            r6 = r8
            r7 = r1
            r8 = r3
            X.C56370HxO.A01(r4, r5, r6, r7, r8, r9)
            return
        L_0x065a:
            X.4DH r2 = r0.A05
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x123e
            X.GLX.A00(r2, r1, r0)
            return
        L_0x0664:
            X.4DH r2 = r0.A05
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x123e
            X.GLX.A01(r2, r1, r0)
            return
        L_0x066e:
            X.GDe r5 = r0.A01
            if (r5 == 0) goto L_0x1277
            X.3W1 r5 = r5.A0E
            if (r5 == 0) goto L_0x067b
            int r3 = r5.getPosition()
            long r3 = (long) r3
        L_0x067b:
            java.lang.String r11 = r25.getSessionId()
            X.1Xj r5 = r0.A02
            if (r5 == 0) goto L_0x123e
            java.lang.String r10 = "pin_as_creator_pick"
            r7 = r8
            r8 = r1
            r9 = r5
            r12 = r3
            X.C52086GEg.A0Z(r7, r8, r9, r10, r11, r12)
            X.4DH r3 = r0.A05
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x123e
            X.C52200GIr.A01(r3, r6, r1, r0, r2)
            return
        L_0x0696:
            X.GDe r2 = r0.A01
            if (r2 == 0) goto L_0x1277
            X.3W1 r2 = r2.A0E
            if (r2 == 0) goto L_0x06a3
            int r2 = r2.getPosition()
            long r3 = (long) r2
        L_0x06a3:
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x123e
            java.lang.String r18 = "unpin_creator_pick"
            r15 = r8
            r16 = r1
            r17 = r2
            r19 = r9
            r20 = r3
            X.C52086GEg.A0Z(r15, r16, r17, r18, r19, r20)
            X.4DH r2 = r0.A05
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x123e
            X.C52200GIr.A01(r2, r6, r1, r0, r5)
            return
        L_0x06bf:
            r0.A0B(r2)
            return
        L_0x06c3:
            r0.A0B(r5)
            return
        L_0x06c7:
            r0.A09(r2)
            return
        L_0x06cb:
            r0.A09(r5)
            return
        L_0x06cf:
            X.GDe r3 = r0.A01
            if (r3 == 0) goto L_0x1277
            int r3 = r3.A09()
            X.1Xj r10 = r0.A02
            if (r10 == 0) goto L_0x123e
            long r3 = (long) r3
            X.Hlh r7 = r0.A0Q
            java.lang.String r9 = r7.A00
            X.4bN r7 = r0.A00
            if (r7 == 0) goto L_0x1229
            X.1Xj r7 = r7.A02
            X.GN9.A00(r7)
            r17 = r1
            r18 = r10
            r19 = r8
            r20 = r25
            r21 = r9
            r22 = r3
            X.C52086GEg.A0j(r17, r18, r19, r20, r21, r22)
            X.JSw r8 = r0.A0D
            X.1Xj r7 = r0.A02
            if (r7 == 0) goto L_0x123e
            X.4bN r4 = r0.A00
            if (r4 == 0) goto L_0x1229
            X.1se r3 = X.1sd.A00(r1)
            X.GDe r1 = X.C52057GDd.A01(r4, r1, r3, r6, r6)
            X.3W1 r6 = r1.A0E
            if (r6 == 0) goto L_0x073c
            X.4DH r4 = r0.A05
            android.content.res.Resources r3 = X.DbV.A05(r4)
            r1 = 2131953870(0x7f1308ce, float:1.9544223E38)
            java.lang.String r11 = r3.getString(r1)
            android.content.res.Resources r3 = X.DbV.A05(r4)
            r1 = 2131953869(0x7f1308cd, float:1.9544221E38)
            java.lang.String r12 = r3.getString(r1)
            r13 = 2131238125(0x7f081ced, float:1.809252E38)
            r9 = r7
            r10 = r6
            r14 = r5
            r15 = r2
            r8.CLj(r9, r10, r11, r12, r13, r14, r15)
            X.4bN r3 = r0.A00
            if (r3 == 0) goto L_0x1229
            X.GBE r1 = r0.A0G
            java.lang.String r0 = "three_dot_menu"
            r1.A0N(r3, r0, r2, r2)
            return
        L_0x073c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0741:
            androidx.fragment.app.FragmentActivity r2 = r0.A04
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x123e
            X.C56654I6j.A02(r2, r1, r0)
            return
        L_0x074b:
            androidx.fragment.app.FragmentActivity r7 = r0.A04
            X.4DH r5 = r0.A05
            X.1Xj r4 = r0.A02
            if (r4 == 0) goto L_0x123e
            X.28D r9 = X.28D.A1D
            X.0Tu r0 = X.0Tu.A05
            r2 = 36330144809370083(0x811213000041e3, double:3.0386680949722E-306)
            boolean r14 = X.C51965G9l.A1a(r0, r1, r2)
            r8 = r5
            r10 = r6
            r11 = r1
            r12 = r4
            r13 = r6
            X.C55274Hf3.A00(r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0769:
            androidx.fragment.app.FragmentActivity r4 = r0.A04
            X.4DH r7 = r0.A05
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            com.instagram.clips.intf.ClipsViewerConfig r9 = r0.A07
            java.lang.Long r0 = r9.A0g
            java.lang.String r17 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r9.A0p
            java.lang.String r13 = r3.getId()
            java.lang.String r16 = X.DbT.A0x(r3)
            java.lang.String r14 = "clips_action_sheet"
            java.lang.String r15 = "copy_link"
            r11 = r6
            r12 = r6
            r18 = r0
            r19 = r6
            r20 = r6
            r21 = r6
            r9 = r1
            r10 = r6
            X.C22031Xty.A07(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.0hq r17 = r7.getParentFragmentManager()
            X.0gy r18 = X.AnonymousClass07i.A00(r4)
            java.lang.Integer r25 = X.AnonymousClass05K.A00
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r2)
            X.FT3 r0 = new X.FT3
            r0.<init>(r4, r6, r2, r5)
            r16 = r4
            r19 = r0
            r20 = r1
            r21 = r3
            r22 = r8
            r23 = r6
            r26 = r6
            r27 = r14
            r28 = r15
            r29 = r5
            X.C46395DeI.A0C(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return
        L_0x07c1:
            androidx.fragment.app.FragmentActivity r1 = r0.A04
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x123e
            X.C56301HwE.A00(r1, r0)
            return
        L_0x07cb:
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x1231
            java.lang.String r3 = r2.A2n()
            if (r3 == 0) goto L_0x07fe
            java.lang.String r2 = "media_id"
            r4.put(r2, r3)
            X.4DH r2 = r0.A05
            android.content.Context r7 = r2.requireContext()
            r12 = 0
            X.8dD r2 = new X.8dD
            r2.<init>(r1)
            java.lang.String r9 = "com.instagram.feed.injection.quick_injection_bottomsheet"
            r8 = r2
            r10 = r6
            r11 = r4
            X.8dn r3 = X.C359638dF.A00(r7, r8, r9, r10, r11, r12)
            r2 = 3
            X.OsJ r1 = new X.OsJ
            r1.<init>(r0, r2)
            r3.A9V(r1)
            return
        L_0x07fe:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0803:
            X.GCh r3 = r0.A0L
            X.4bN r1 = r0.A00
            if (r1 == 0) goto L_0x1229
            androidx.fragment.app.FragmentActivity r2 = r3.A01
            r0 = 2131955320(0x7f130e78, float:1.9547164E38)
            java.lang.String r13 = X.AnonymousClass7TE.A16(r2, r0)
            X.8ae r10 = X.C358278ae.RED_BOLD
            r0 = 18
            X.I8y r4 = new X.I8y
            r4.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r3)
            r14 = 2131955321(0x7f130e79, float:1.9547166E38)
            r15 = 2131955488(0x7f130f20, float:1.9547505E38)
            goto L_0x095b
        L_0x0823:
            androidx.fragment.app.FragmentActivity r3 = r0.A04
            X.1Xj r7 = r0.A02
            if (r7 == 0) goto L_0x123e
            boolean r0 = r7.A4z()
            if (r0 == 0) goto L_0x0867
            java.util.List r0 = r7.A3j()
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x083b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x086e
            java.lang.Object r11 = r12.next()
            X.536 r11 = (X.AnonymousClass536) r11
            com.instagram.user.model.User r10 = r11.ByI()
            java.lang.Boolean r0 = r11.Bbh()
            r9 = 0
            boolean r8 = X.AnonymousClass7TG.A1X(r0)
            java.lang.Boolean r0 = r11.CYy()
            if (r0 == 0) goto L_0x085e
            boolean r9 = r0.booleanValue()
        L_0x085e:
            com.instagram.pendingmedia.model.BrandedContentTag r0 = new com.instagram.pendingmedia.model.BrandedContentTag
            r0.<init>(r10, r8, r9)
            r4.add(r0)
            goto L_0x083b
        L_0x0867:
            java.util.List r4 = java.util.Collections.emptyList()
            X.0qQ.A07(r4)
        L_0x086e:
            boolean r0 = r7.A4z()
            if (r0 == 0) goto L_0x08ab
            X.1Xy r0 = r7.A0C
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r9 = r0.Aho()
        L_0x087a:
            X.1Xy r0 = r7.A0C
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r0 = r0.BQ3()
            if (r0 == 0) goto L_0x08a9
            X.1Xy r0 = r7.A0C
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r8 = r0.BQ3()
        L_0x0888:
            X.6Yo r3 = X.DbS.A0M(r3, r1)
            boolean r18 = r7.A5l()
            java.lang.String r11 = r7.getId()
            java.lang.String r12 = "reel"
            r10 = r1
            r13 = r4
            r14 = r5
            r15 = r5
            r16 = r2
            r17 = r2
            androidx.fragment.app.Fragment r0 = X.LLA.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3.A0B(r6, r0)
            r3.A04()
            return
        L_0x08a9:
            r8 = r6
            goto L_0x0888
        L_0x08ab:
            r9 = r6
            goto L_0x087a
        L_0x08ad:
            androidx.fragment.app.FragmentActivity r6 = r0.A04
            X.4DH r4 = r0.A05
            X.4bN r8 = r0.A00
            if (r8 == 0) goto L_0x1229
            X.0Tu r0 = X.0Tu.A05
            r2 = 36311169643905481(0x8100d1000101c9, double:3.026668123925527E-306)
            boolean r0 = X.182.A06(r0, r1, r2)
            if (r0 == 0) goto L_0x0904
            java.lang.String r4 = r8.A0C()
            com.instagram.user.model.User r2 = r8.A08(r1)
            if (r2 == 0) goto L_0x08ff
            java.lang.String r0 = r1.A05
            java.lang.String r3 = r2.getId()
            X.0qQ.A0B(r0, r5)
            android.os.Bundle r2 = X.DbX.A0C(r0)
            r0 = 2160(0x870, float:3.027E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r0, r4)
            r0 = 2159(0x86f, float:3.025E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r0, r3)
            X.7Pr r0 = X.DbS.A0W(r1)
            X.7Pu r1 = r0.A00()
            instagram.features.clips.viewer.recommend.ClipsViewerRecommendClipsFragment r0 = new instagram.features.clips.viewer.recommend.ClipsViewerRecommendClipsFragment
            r0.<init>()
            r0.setArguments(r2)
            r1.A02(r6, r0)
            return
        L_0x08ff:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0904:
            java.lang.String r3 = r8.A0C()
            com.instagram.user.model.User r0 = r8.A08(r1)
            if (r0 == 0) goto L_0x0938
            java.lang.String r2 = r0.getId()
            X.1NY r1 = X.AnonymousClass7TG.A0a(r1)
            r0 = 2795(0xaeb, float:3.917E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A0A(r0)
            java.lang.String r0 = "clips_media_id"
            r1.A9m(r0, r3)
            java.lang.String r0 = "author_id"
            X.DbX.A1M(r1, r0, r2)
            X.1OC r1 = r1.A0M()
            X.ECu r0 = new X.ECu
            r0.<init>(r6, r7)
            r1.A00 = r0
            r4.schedule(r1)
            return
        L_0x0938:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x093d:
            X.GCh r3 = r0.A0L
            X.4bN r1 = r0.A00
            if (r1 == 0) goto L_0x1229
            androidx.fragment.app.FragmentActivity r2 = r3.A01
            r0 = 2131955322(0x7f130e7a, float:1.9547168E38)
            java.lang.String r13 = X.AnonymousClass7TE.A16(r2, r0)
            X.8ae r10 = X.C358278ae.BLUE_BOLD
            r0 = 20
            X.I8y r4 = new X.I8y
            r4.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r3)
            r14 = 2131955323(0x7f130e7b, float:1.954717E38)
            r15 = 2131955695(0x7f130fef, float:1.9547925E38)
        L_0x095b:
            X.HqC r0 = r3.A05
            X.GE2 r0 = r0.A00
            X.GE2.A03(r0, r5)
            X.I8t r5 = X.C56713I8t.A00
            r1 = 8
            X.I9B r0 = new X.I9B
            r0.<init>(r3, r1)
            r16 = 2131954722(0x7f130c22, float:1.9545951E38)
            r7 = r0
            r8 = r6
            r9 = r2
            r11 = r6
            r12 = r6
            X.C56659I6o.A02(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0977:
            X.4bN r2 = r0.A00
            if (r2 == 0) goto L_0x1229
            java.lang.String r3 = r2.A0C()
            X.1NY r4 = X.AnonymousClass7TG.A0a(r1)
            java.lang.String r2 = "feed/profile_grid/remove/"
            X.C51968G9o.A1K(r4, r2, r3)
            java.lang.Class<X.Gyh> r3 = X.C54058Gyh.class
            java.lang.Class<X.HvJ> r2 = X.C56252HvJ.class
            X.1OC r4 = X.DbU.A0S(r4, r3, r2)
            goto L_0x09aa
        L_0x0991:
            X.4bN r2 = r0.A00
            if (r2 == 0) goto L_0x1229
            java.lang.String r3 = r2.A0C()
            X.1NY r4 = X.AnonymousClass7TG.A0a(r1)
            java.lang.String r2 = "feed/profile_grid/add/"
            X.C51968G9o.A1K(r4, r2, r3)
            java.lang.Class<X.Gyh> r3 = X.C54058Gyh.class
            java.lang.Class<X.HvJ> r2 = X.C56252HvJ.class
            X.1OC r4 = X.DbT.A0R(r6, r4, r3, r2, r5)
        L_0x09aa:
            androidx.fragment.app.FragmentActivity r3 = r0.A04
            X.H4l r2 = new X.H4l
            r2.<init>(r1, r3)
            r4.A00 = r2
            X.4DH r0 = r0.A05
            r0.schedule(r4)
            return
        L_0x09b9:
            androidx.fragment.app.FragmentActivity r6 = r0.A04
            X.4DH r5 = r0.A05
            X.1Xj r9 = r0.A02
            if (r9 == 0) goto L_0x123e
            X.1sQ r0 = X.C51966G9m.A0n(r9)
            java.lang.String r8 = "Required value was null."
            if (r0 == 0) goto L_0x0a28
            com.instagram.api.schemas.MusicInfo r0 = r0.BUr()
            if (r0 == 0) goto L_0x0a1e
            com.instagram.api.schemas.TrackData r7 = r0.BUk()
            if (r7 == 0) goto L_0x0a1e
            java.lang.String r4 = r7.getTitle()
            java.lang.String r3 = r7.getDisplayArtist()
            java.lang.String r0 = " • "
            java.lang.String r4 = X.002.A0g(r3, r0, r4)
            r0 = 2131972026(0x7f134fba, float:1.9581048E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r6, r0)
            java.lang.String r11 = r9.A2n()
            if (r11 == 0) goto L_0x0a19
            X.Dg1 r3 = new X.Dg1
            r3.<init>(r6, r1)
            r3.A0D(r4, r0)
            com.instagram.common.typedurl.ImageUrl r0 = r7.Arq()
            r3.A07(r0)
            X.DfA r0 = r3.A04
            if (r0 == 0) goto L_0x0a05
            r0.A0J = r2
        L_0x0a05:
            r2 = 2131972025(0x7f134fb9, float:1.9581046E38)
            r12 = 4
            X.ICC r0 = new X.ICC
            r7 = r0
            r8 = r6
            r9 = r5
            r10 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            r3.A02(r0, r2)
            X.C51969G9p.A11(r6, r3)
            return
        L_0x0a19:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0a1e:
            r0 = 2131972027(0x7f134fbb, float:1.958105E38)
            X.C59689JTv.A07(r6, r0)
            X.C51967G9n.A1K(r1, r9)
            return
        L_0x0a28:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x0a2d:
            X.I0Z r4 = X.I0Z.A00
            androidx.fragment.app.FragmentActivity r3 = r0.A04
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x123e
            X.0gy r0 = X.AnonymousClass07i.A00(r3)
            r4.A00(r3, r0, r1, r2)
            return
        L_0x0a3d:
            androidx.fragment.app.FragmentActivity r5 = r0.A04
            X.4DH r4 = r0.A05
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x1231
            java.lang.String r2 = r0.A2n()
            if (r2 == 0) goto L_0x0a6a
            X.1NY r3 = X.AnonymousClass7TG.A0a(r1)
            java.lang.String r0 = "clips/restore_original_audio_attribution/"
            r3.A0A(r0)
            java.lang.String r0 = "clips_media_id"
            r3.A9m(r0, r2)
            java.lang.Class<X.Gye> r2 = X.C54055Gye.class
            java.lang.Class<X.HvG> r0 = X.C56249HvG.class
            X.1OC r2 = X.DbU.A0S(r3, r2, r0)
            r0 = 27
            X.H51.A00(r2, r5, r1, r0)
            r4.schedule(r2)
            return
        L_0x0a6a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0a6f:
            X.1Xj r2 = r0.A02
            r16 = r14
            if (r2 == 0) goto L_0x12bf
            boolean r2 = r2.CbC()
            if (r2 != 0) goto L_0x0a88
            X.7kd r3 = X.C340057kd.A00(r1)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.1Xj r1 = r0.A02
            if (r1 == 0) goto L_0x12bf
            r3.A04(r1, r2)
        L_0x0a88:
            X.324 r4 = r0.A0E
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x12bf
            X.GDe r0 = r0.A01
            r16 = r10
            if (r0 == 0) goto L_0x12bf
            X.3W1 r2 = r0.A0E
            java.lang.String r0 = "Required value was null."
            if (r2 == 0) goto L_0x0aa6
            int r1 = r2.getPosition()
            X.JQg r0 = r4.CBn()
            r4.DgX(r3, r2, r0, r1)
            return
        L_0x0aa6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0aab:
            androidx.fragment.app.FragmentActivity r5 = r0.A04
            X.Hlh r4 = r0.A0Q
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x1231
            X.3W1 r2 = r0.A03
            if (r2 == 0) goto L_0x0aca
            X.IMi r0 = new X.IMi
            r9 = r0
            r10 = r5
            r11 = r1
            r12 = r3
            r13 = r8
            r14 = r2
            r15 = r25
            r16 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            X.HWR.A00(r5, r0, r1, r3)
            return
        L_0x0aca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0acf:
            androidx.fragment.app.FragmentActivity r13 = r0.A04
            X.4bN r11 = r0.A00
            if (r11 == 0) goto L_0x12bf
            X.GDe r14 = r0.A01
            if (r14 == 0) goto L_0x12bd
            X.JRO r7 = r0.A09
            X.GBE r9 = r0.A0G
            X.JSw r4 = r0.A0D
            X.Hlh r12 = r0.A0Q
            X.H3C r3 = r0.A0M
            X.1Xj r10 = r11.A02
            if (r10 == 0) goto L_0x0b3e
            X.1se r15 = X.1sd.A00(r1)
            X.GDe r6 = X.C52057GDd.A01(r11, r1, r15, r6, r6)
            X.3W1 r6 = r6.A0E
            if (r6 == 0) goto L_0x0bdb
            X.3WA r15 = X.AnonymousClass3WA.CLIPS_VIEWER_ORGANIC_SHOW_LESS
            boolean r15 = X.I71.A05(r10, r15, r6)
            if (r15 == 0) goto L_0x0b48
            com.instagram.api.schemas.MediaControlEventSourceEnum r18 = com.instagram.api.schemas.MediaControlEventSourceEnum.THREE_DOT_MENU
            r17 = r13
            r19 = r8
            r20 = r1
            r21 = r10
            r22 = r4
            r23 = r6
            r24 = r3
            X.I65.A01(r17, r18, r19, r20, r21, r22, r23, r24)
            X.3W1 r3 = r14.A0E
            if (r3 == 0) goto L_0x0b3e
            int r3 = r3.getPosition()
            long r6 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            if (r3 == 0) goto L_0x0b3e
            X.0Tu r13 = X.0Tu.A05
            r3 = 36312183257236419(0x8101bd001103c3, double:3.0273091370775056E-306)
            boolean r3 = X.182.A06(r13, r1, r3)
            if (r3 != 0) goto L_0x0b3e
            java.lang.String r4 = r12.A00
            X.1Xj r3 = r11.A02
            X.GN9.A00(r3)
            r17 = r1
            r18 = r10
            r20 = r25
            r21 = r4
            r22 = r6
            X.C52086GEg.A0j(r17, r18, r19, r20, r21, r22)
        L_0x0b3e:
            X.4bN r1 = r0.A00
            if (r1 == 0) goto L_0x12bf
            java.lang.String r0 = "three_dot_menu"
            r9.A0N(r1, r0, r2, r5)
            return
        L_0x0b48:
            X.Ho4 r10 = new X.Ho4
            r17 = r10
            r18 = r13
            r19 = r11
            r20 = r7
            r21 = r1
            r22 = r9
            r17.<init>(r18, r19, r20, r21, r22)
            X.JRO r4 = r10.A02
            X.4bN r3 = r10.A01
            X.HLU r1 = X.HLU.PENDING
            r4.Ek5(r3, r1)
            android.app.Activity r11 = r10.A00
            com.instagram.common.session.UserSession r14 = r10.A03
            X.Dg1 r8 = new X.Dg1
            r8.<init>(r11, r14)
            r1 = 7
            java.lang.Integer[] r13 = X.AnonymousClass05K.A00(r1)
            int r12 = r13.length
            r7 = 0
        L_0x0b72:
            if (r7 >= r12) goto L_0x0bc7
            r6 = r13[r7]
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            if (r6 != r1) goto L_0x0b89
            r3 = 2131975851(0x7f135eab, float:1.9588806E38)
            r1 = 64
            X.ICy r1 = X.C56801ICy.A00(r10, r1)
            r8.A02(r1, r3)
        L_0x0b86:
            int r7 = r7 + 1
            goto L_0x0b72
        L_0x0b89:
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            if (r6 != r1) goto L_0x0b9a
            X.0Tu r1 = X.0Tu.A05
            r3 = 36315606345190827(0x8104da00020dab, double:3.029473911683542E-306)
            boolean r1 = X.182.A06(r1, r14, r3)
            if (r1 == 0) goto L_0x0b86
        L_0x0b9a:
            int r1 = r6.intValue()
            switch(r1) {
                case 1: goto L_0x0baf;
                case 2: goto L_0x0bb3;
                case 3: goto L_0x0bb7;
                case 4: goto L_0x0bbb;
                case 5: goto L_0x0bbf;
                case 6: goto L_0x0bc3;
                default: goto L_0x0ba1;
            }
        L_0x0ba1:
            r4 = 2131956133(0x7f1311a5, float:1.9548813E38)
        L_0x0ba4:
            r3 = 22
            X.ID3 r1 = new X.ID3
            r1.<init>((int) r3, (java.lang.Object) r6, (java.lang.Object) r10)
            r8.A04(r1, r4)
            goto L_0x0b86
        L_0x0baf:
            r4 = 2131956129(0x7f1311a1, float:1.9548805E38)
            goto L_0x0ba4
        L_0x0bb3:
            r4 = 2131956130(0x7f1311a2, float:1.9548807E38)
            goto L_0x0ba4
        L_0x0bb7:
            r4 = 2131956134(0x7f1311a6, float:1.9548815E38)
            goto L_0x0ba4
        L_0x0bbb:
            r4 = 2131956132(0x7f1311a4, float:1.9548811E38)
            goto L_0x0ba4
        L_0x0bbf:
            r4 = 2131956131(0x7f1311a3, float:1.954881E38)
            goto L_0x0ba4
        L_0x0bc3:
            r4 = 2131975851(0x7f135eab, float:1.9588806E38)
            goto L_0x0ba4
        L_0x0bc7:
            r1 = 2131968504(0x7f1341f8, float:1.9573904E38)
            r8.A01(r1)
            r3 = 8
            X.IVE r1 = new X.IVE
            r1.<init>(r10, r3)
            r8.A03 = r1
            X.C51969G9p.A11(r11, r8)
            goto L_0x0b3e
        L_0x0bdb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0be0:
            X.GCi r6 = r0.A0O
            X.4bN r8 = r0.A00
            if (r8 == 0) goto L_0x12bf
            X.1Xj r7 = r8.A02
            if (r7 == 0) goto L_0x0c57
            androidx.fragment.app.FragmentActivity r5 = r6.A00
            com.instagram.common.session.UserSession r10 = r6.A02
            X.Dg1 r4 = new X.Dg1
            r4.<init>(r5, r10)
            r0 = 2131974937(0x7f135b19, float:1.9586952E38)
            r4.A01(r0)
            X.0eE r9 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r9.A01(r10)
            boolean r0 = r7.A6e(r0)
            if (r0 == 0) goto L_0x0c12
            r3 = 2131956083(0x7f131173, float:1.9548712E38)
            r1 = 32
            X.ID0 r0 = new X.ID0
            r0.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r7, (java.lang.Object) r6)
            r4.A02(r0, r3)
        L_0x0c12:
            com.instagram.user.model.User r0 = r9.A01(r10)
            boolean r0 = X.Hd1.A00(r7, r0)
            if (r0 == 0) goto L_0x0c29
            r3 = 2131955619(0x7f130fa3, float:1.954777E38)
            r1 = 33
            X.ID0 r0 = new X.ID0
            r0.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r7, (java.lang.Object) r6)
            r4.A02(r0, r3)
        L_0x0c29:
            X.1Xy r0 = r7.A0C
            java.lang.Boolean r0 = r0.Bc5()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r2)
            r2 = 2131969440(0x7f1345a0, float:1.9575803E38)
            r1 = 15
            if (r0 == 0) goto L_0x0c3f
            r2 = 2131969437(0x7f13459d, float:1.9575797E38)
            r1 = 14
        L_0x0c3f:
            X.ID3 r0 = new X.ID3
            r0.<init>((int) r1, (java.lang.Object) r7, (java.lang.Object) r6)
            r4.A04(r0, r2)
            r1 = 2131956082(0x7f131172, float:1.954871E38)
            r0 = 60
            X.ICy r0 = X.C56801ICy.A00(r6, r0)
            r4.A04(r0, r1)
            X.C51969G9p.A11(r5, r4)
            return
        L_0x0c57:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0c5c:
            androidx.fragment.app.FragmentActivity r2 = r0.A04
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x123e
            X.AnonymousClass3YV.A02(r2, r1, r0)
            return
        L_0x0c66:
            androidx.fragment.app.FragmentActivity r3 = r0.A04
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x1231
            X.3W1 r0 = r0.A03
            if (r0 == 0) goto L_0x0c74
            X.C56304HwH.A01(r3, r1, r2, r0)
            return
        L_0x0c74:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0c79:
            androidx.fragment.app.FragmentActivity r2 = r0.A04
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x123e
            X.C56304HwH.A00(r2, r1, r0)
            return
        L_0x0c83:
            X.GOp r3 = X.C52345GOp.A00
            androidx.fragment.app.FragmentActivity r2 = r0.A04
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x123e
            X.0gy r5 = X.AnonymousClass07i.A00(r2)
            java.lang.String r8 = r8.getModuleName()
            r4 = r2
            r6 = r1
            r7 = r0
            r3.A0H(r4, r5, r6, r7, r8)
            return
        L_0x0c9a:
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x123e
            X.1s9 r2 = r2.A1N()
            if (r2 == 0) goto L_0x0ca8
            X.4bJ r6 = r2.BZ6()
        L_0x0ca8:
            java.lang.String r3 = "Required value was null."
            if (r6 == 0) goto L_0x0cc7
            X.4bJ r2 = r2.BZ6()
            if (r2 == 0) goto L_0x0cb8
            java.lang.String r8 = r2.getPk()
            if (r8 != 0) goto L_0x0cd6
        L_0x0cb8:
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x123e
            java.lang.String r8 = r2.A30()
            if (r8 != 0) goto L_0x0cd6
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0cc7:
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x123e
            java.lang.String r8 = r2.getId()
            if (r8 != 0) goto L_0x0cd6
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0cd6:
            androidx.fragment.app.FragmentActivity r6 = r0.A04
            java.lang.String r7 = X.AnonymousClass7TG.A0j()
            X.GDe r2 = r0.A01
            if (r2 == 0) goto L_0x1277
            X.3W1 r2 = r2.A0E
            if (r2 == 0) goto L_0x0d1c
            int r5 = r2.getPosition()
        L_0x0ce8:
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x123e
            java.lang.String r4 = r0.getId()
            if (r4 == 0) goto L_0x0d1e
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r2 = X.C51971G9r.A0N(r8)
            java.lang.String r0 = "media_tap_token"
            r2.putString(r0, r7)
            r0 = 1875(0x753, float:2.627E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putInt(r0, r5)
            r0 = 991(0x3df, float:1.389E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.putString(r0, r4)
            X.DbU.A1D(r2, r1)
            r0 = 617(0x269, float:8.65E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.DbU.A0w(r6, r2, r1, r3, r0)
            return
        L_0x0d1c:
            r5 = -1
            goto L_0x0ce8
        L_0x0d1e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r3)
            throw r0
        L_0x0d23:
            X.4DH r2 = r0.A05
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x123e
            X.C56654I6j.A04(r2, r8, r1, r0)
            return
        L_0x0d2d:
            X.4bN r2 = r0.A00
            if (r2 == 0) goto L_0x1229
            X.JTB r1 = r0.A0I
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r1.Cvo(r2, r0, r6)
            return
        L_0x0d39:
            X.1Yh r9 = X.C18138VmE.A00()
            X.1Xj r4 = r0.A02
            if (r4 == 0) goto L_0x123e
            java.lang.String r16 = r8.getModuleName()
            X.4DH r3 = r0.A05
            X.G7V r0 = r0.A06
            r10 = r3
            r11 = r0
            r12 = r6
            r13 = r8
            r14 = r1
            r15 = r4
            r17 = r6
            r18 = r2
            r9.A07(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0d57:
            X.Hto r8 = new X.Hto
            r8.<init>(r1)
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            X.1Xy r3 = r3.A0C
            com.instagram.api.schemas.ClipsTrialDict r3 = r3.AoL()
            if (r3 == 0) goto L_0x0ff3
            com.instagram.api.schemas.MediaTrialStatus r3 = r3.BzK()
        L_0x0d6c:
            com.instagram.api.schemas.MediaTrialStatus r9 = com.instagram.api.schemas.MediaTrialStatus.ACTIVE
            boolean r10 = X.AnonymousClass7TF.A1W(r3, r9)
            X.4DH r3 = r0.A05
            android.content.res.Resources r4 = X.DbV.A05(r3)
            r3 = 2131965840(0x7f133790, float:1.9568501E38)
            if (r10 == 0) goto L_0x0d80
            r3 = 2131965843(0x7f133793, float:1.9568507E38)
        L_0x0d80:
            java.lang.String r3 = X.AnonymousClass7TF.A0d(r4, r3)
            r8.A02 = r3
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            if (r10 == 0) goto L_0x0dc0
            X.HNR r3 = X.HNR.A0o
            r5.add(r3)
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            X.1Xy r3 = r3.A0C
            com.instagram.api.schemas.ClipsTrialDict r3 = r3.AoL()
            if (r3 == 0) goto L_0x0dc0
            java.lang.Boolean r3 = r3.Akq()
            boolean r3 = X.AnonymousClass7TF.A1Y(r3, r2)
            if (r3 == 0) goto L_0x0dc0
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            X.1Xy r3 = r3.A0C
            com.instagram.api.schemas.ClipsTrialDict r3 = r3.AoL()
            if (r3 == 0) goto L_0x0ff0
            com.instagram.api.schemas.MediaTrialGraduationStrategy r4 = r3.B9i()
        L_0x0db7:
            com.instagram.api.schemas.MediaTrialGraduationStrategy r3 = com.instagram.api.schemas.MediaTrialGraduationStrategy.MANUAL
            if (r4 != r3) goto L_0x0fd3
            X.HNR r3 = X.HNR.A2G
            r5.add(r3)
        L_0x0dc0:
            X.HNR r3 = X.HNR.A0d
            r5.add(r3)
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            boolean r3 = X.AnonymousClass3WS.A09(r1, r3)
            if (r3 == 0) goto L_0x0dd4
            X.HNR r3 = X.HNR.A2Z
            r5.add(r3)
        L_0x0dd4:
            boolean r3 = X.AnonymousClass430.A00(r1)
            if (r3 == 0) goto L_0x0ddf
            X.HNR r3 = X.HNR.A19
            r5.add(r3)
        L_0x0ddf:
            X.1Z0 r13 = X.AnonymousClass2BF.A00()
            X.4kW r12 = r13.A03()
            X.1Xj r11 = r0.A02
            r10 = 0
            if (r11 == 0) goto L_0x123e
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            X.GKD r3 = X.GKD.UNRECOGNIZED
            boolean r4 = r12.A01(r3, r1, r11, r4)
            X.1Xj r3 = r0.A02
            if (r4 == 0) goto L_0x0f9b
            if (r3 == 0) goto L_0x123e
            X.1Xy r3 = r3.A0C
            X.8wJ r3 = r3.BPi()
            if (r3 == 0) goto L_0x0e06
            com.instagram.api.schemas.MediaGiftCountVisibilityState r10 = r3.B9J()
        L_0x0e06:
            com.instagram.api.schemas.MediaGiftCountVisibilityState r3 = com.instagram.api.schemas.MediaGiftCountVisibilityState.ENABLED
            if (r10 != r3) goto L_0x0f97
            X.HNR r3 = X.HNR.A0q
        L_0x0e0c:
            r5.add(r3)
        L_0x0e0f:
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            boolean r3 = r3.A4c()
            if (r3 == 0) goto L_0x0f93
            X.HNR r3 = X.HNR.A28
        L_0x0e1b:
            r5.add(r3)
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            boolean r3 = X.C250563lf.A0p(r1, r3)
            if (r3 == 0) goto L_0x0e3d
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            X.1Xy r3 = r3.A0C
            java.lang.Boolean r3 = r3.Cd9()
            boolean r3 = X.AnonymousClass7TF.A1Y(r3, r2)
            if (r3 == 0) goto L_0x0f8f
            X.HNR r3 = X.HNR.A25
        L_0x0e3a:
            r5.add(r3)
        L_0x0e3d:
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            boolean r3 = X.GLX.A02(r1, r3)
            if (r3 == 0) goto L_0x0e58
            X.1Xj r4 = r0.A02
            if (r4 == 0) goto L_0x123e
            java.lang.String r3 = r1.A06
            boolean r3 = r4.A6g(r3)
            if (r3 == 0) goto L_0x0f8b
            X.HNR r3 = X.HNR.A2Q
        L_0x0e55:
            r5.add(r3)
        L_0x0e58:
            X.0Tu r7 = X.0Tu.A05
            r3 = 36315640704929216(0x8104e200020dc0, double:3.029495640920455E-306)
            boolean r3 = X.182.A06(r7, r1, r3)
            if (r3 == 0) goto L_0x0e74
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            boolean r3 = r3.A5c()
            if (r3 == 0) goto L_0x0f87
            X.HNR r3 = X.HNR.A2K
        L_0x0e71:
            r5.add(r3)
        L_0x0e74:
            X.2ib r3 = X.AnonymousClass3YZ.A00(r1)
            boolean r3 = r3.A00()
            if (r3 == 0) goto L_0x0e8d
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            boolean r3 = r3.A61()
            if (r3 == 0) goto L_0x0f83
            X.HNR r3 = X.HNR.A2L
        L_0x0e8a:
            r5.add(r3)
        L_0x0e8d:
            X.4bN r4 = r0.A00
            if (r4 == 0) goto L_0x1229
            boolean r3 = r4.A0Z
            if (r3 == 0) goto L_0x0f5f
            boolean r3 = r4.A0a
            if (r3 == 0) goto L_0x0f5f
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            boolean r3 = r3.A58()
            if (r3 != 0) goto L_0x0f5f
            X.4bN r3 = r0.A00
            if (r3 == 0) goto L_0x1229
            X.1Xj r3 = r3.A02
            if (r3 == 0) goto L_0x0eb9
            X.1Xy r3 = r3.A0C
            com.instagram.api.schemas.ClipsTrialDict r3 = r3.AoL()
            if (r3 == 0) goto L_0x0eb9
            com.instagram.api.schemas.MediaTrialStatus r3 = r3.BzK()
            if (r3 == r9) goto L_0x0f5f
        L_0x0eb9:
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            X.3QO r4 = r3.A1t()
            X.3QO r3 = X.AnonymousClass3QO.OPAL
            if (r4 != r3) goto L_0x0f58
            X.HNR r3 = X.HNR.A1K
            r5.add(r3)
        L_0x0eca:
            X.1Xj r4 = r0.A02
            if (r4 == 0) goto L_0x123e
            X.LTW r3 = X.LTW.A00
            boolean r3 = r3.A0B(r1, r4)
            if (r3 == 0) goto L_0x0edb
            X.HNR r3 = X.HNR.A0c
            r5.add(r3)
        L_0x0edb:
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            X.1sQ r3 = X.C51966G9m.A0n(r3)
            if (r3 == 0) goto L_0x0f56
            com.instagram.api.schemas.OriginalAudioSubtype r4 = X.C291335gz.A00(r3)
        L_0x0ee9:
            X.4bN r3 = r0.A00
            if (r3 == 0) goto L_0x1229
            X.1Xj r3 = r3.A02
            if (r3 == 0) goto L_0x0f12
            X.1sQ r3 = X.C51966G9m.A0n(r3)
            if (r3 == 0) goto L_0x0f12
            X.1rp r3 = r3.AZY()
            if (r3 == 0) goto L_0x0f12
            X.1rn r3 = r3.Adm()
            if (r3 == 0) goto L_0x0f12
            boolean r3 = r3.getShouldAllowRestore()
            if (r3 != r2) goto L_0x0f12
            com.instagram.api.schemas.OriginalAudioSubtype r2 = com.instagram.api.schemas.OriginalAudioSubtype.A04
            if (r4 != r2) goto L_0x0f53
            X.HNR r2 = X.HNR.A1V
        L_0x0f0f:
            r5.add(r2)
        L_0x0f12:
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x123e
            boolean r2 = r2.A58()
            if (r2 != 0) goto L_0x0f2b
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x123e
            boolean r2 = r2.A62()
            if (r2 == 0) goto L_0x0f2b
            X.HNR r2 = X.HNR.A2W
            r5.add(r2)
        L_0x0f2b:
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x123e
            boolean r2 = r2.A58()
            if (r2 == 0) goto L_0x0f50
            X.HNR r2 = X.HNR.A0A
        L_0x0f37:
            r5.add(r2)
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x123e
            boolean r1 = X.GKS.A03(r1, r2)
            if (r1 == 0) goto L_0x0f49
            X.HNR r1 = X.HNR.A2N
            r5.add(r1)
        L_0x0f49:
            r0.A0G(r8, r5)
            r0.A0C(r6, r8)
            return
        L_0x0f50:
            X.HNR r2 = X.HNR.A0E
            goto L_0x0f37
        L_0x0f53:
            X.HNR r2 = X.HNR.A1N
            goto L_0x0f0f
        L_0x0f56:
            r4 = r6
            goto L_0x0ee9
        L_0x0f58:
            X.HNR r3 = X.HNR.A1L
            r5.add(r3)
            goto L_0x0eca
        L_0x0f5f:
            X.4bN r3 = r0.A00
            if (r3 == 0) goto L_0x1229
            boolean r3 = X.AnonymousClass3ZC.A0G(r3, r1)
            if (r3 == 0) goto L_0x0eca
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            X.3QO r4 = r3.A1t()
            X.3QO r3 = X.AnonymousClass3QO.OPAL
            if (r4 != r3) goto L_0x0f7c
            X.HNR r3 = X.HNR.A07
            r5.add(r3)
            goto L_0x0eca
        L_0x0f7c:
            X.HNR r3 = X.HNR.A08
            r5.add(r3)
            goto L_0x0eca
        L_0x0f83:
            X.HNR r3 = X.HNR.A0u
            goto L_0x0e8a
        L_0x0f87:
            X.HNR r3 = X.HNR.A0s
            goto L_0x0e71
        L_0x0f8b:
            X.HNR r3 = X.HNR.A1E
            goto L_0x0e55
        L_0x0f8f:
            X.HNR r3 = X.HNR.A2F
            goto L_0x0e3a
        L_0x0f93:
            X.HNR r3 = X.HNR.A1y
            goto L_0x0e1b
        L_0x0f97:
            X.HNR r3 = X.HNR.A2J
            goto L_0x0e0c
        L_0x0f9b:
            if (r3 == 0) goto L_0x123e
            X.1Xy r3 = r3.A0C
            X.8wJ r3 = r3.BPi()
            if (r3 == 0) goto L_0x0e0f
            com.instagram.api.schemas.MediaGiftingState r3 = r3.BQ5()
            if (r3 == 0) goto L_0x0e0f
            int r3 = r3.ordinal()
            if (r3 == r7) goto L_0x0fc3
            if (r3 != r2) goto L_0x0e0f
            X.4kW r4 = r13.A03()
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            boolean r3 = r4.A03(r1, r3, r2)
            if (r3 == 0) goto L_0x0e0f
            X.HNR r3 = X.HNR.A29
            goto L_0x0e0c
        L_0x0fc3:
            X.4kW r4 = r13.A03()
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            boolean r3 = r4.A03(r1, r3, r2)
            if (r3 == 0) goto L_0x0e0f
            X.HNR r3 = X.HNR.A1z
            goto L_0x0e0c
        L_0x0fd3:
            X.1Xj r3 = r0.A02
            if (r3 == 0) goto L_0x123e
            X.1Xy r3 = r3.A0C
            com.instagram.api.schemas.ClipsTrialDict r3 = r3.AoL()
            if (r3 == 0) goto L_0x0fee
            com.instagram.api.schemas.MediaTrialGraduationStrategy r4 = r3.B9i()
        L_0x0fe3:
            com.instagram.api.schemas.MediaTrialGraduationStrategy r3 = com.instagram.api.schemas.MediaTrialGraduationStrategy.SS_PERFORMANCE
            if (r4 != r3) goto L_0x0dc0
            X.HNR r3 = X.HNR.A27
            r5.add(r3)
            goto L_0x0dc0
        L_0x0fee:
            r4 = r6
            goto L_0x0fe3
        L_0x0ff0:
            r4 = r6
            goto L_0x0db7
        L_0x0ff3:
            r3 = r6
            goto L_0x0d6c
        L_0x0ff6:
            X.GHv r0 = r0.A0K
            r0.DQq(r6)
            return
        L_0x0ffc:
            androidx.fragment.app.FragmentActivity r2 = r0.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.C56313HwQ.A01(r2, r1, r0)
            return
        L_0x1004:
            X.4DH r2 = r0.A05
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x123e
            java.lang.String r16 = r25.getSessionId()
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            r9 = r2
            r10 = r1
            r11 = r0
            r12 = r8
            r14 = r6
            r15 = r6
            X.C56624I5c.A01(r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x101a:
            androidx.fragment.app.FragmentActivity r4 = r0.A04
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x1231
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x104f
            X.1NY r3 = X.AnonymousClass7TG.A0b(r1)
            r3.A02()
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r0 = "api/v1/media/%s/clips_fb_info/"
            X.DbU.A1P(r3, r0, r2)
            java.lang.Class<X.DuP> r2 = X.C47296DuP.class
            java.lang.Class<X.F49> r0 = X.F49.class
            X.1OC r3 = X.DbT.A0R(r6, r3, r2, r0, r5)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.ClipsFacebookInfoResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.ClipsFacebookInfoResponse>>"
            X.0qQ.A0C(r3, r0)
            r2 = 4
            X.EDb r0 = new X.EDb
            r0.<init>((int) r2, (java.lang.Object) r8, (java.lang.Object) r1, (java.lang.Object) r4)
            r3.A00 = r0
            X.1ES.A03(r3)
            return
        L_0x104f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x1054:
            X.1Ng r5 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Class<X.Jy0> r4 = X.C61149Jy0.class
            X.1wn r3 = r0.A0A
            r5.A01(r3, r4)
            X.IXg r4 = new X.IXg
            r4.<init>(r2)
            X.EZv r3 = X.C48153EZv.A05
            X.4DH r2 = r0.A05
            X.EXN r0 = X.EXN.A0K
            r3.A04(r2, r1, r4, r0)
            return
        L_0x106e:
            X.GCh r4 = r0.A0L
            X.4bN r8 = r0.A00
            if (r8 == 0) goto L_0x12bf
            java.lang.String r0 = r25.getSessionId()
            X.0qQ.A0B(r0, r2)
            com.instagram.common.session.UserSession r7 = r4.A03
            X.0wc r28 = X.AnonymousClass0kN.A02(r7)
            X.1QP r2 = X.AnonymousClass1QO.A00(r7)
            java.lang.String r0 = "move_to_drafts_dialog"
            com.facebook.quicklog.reliability.UserFlowConfig r3 = new com.facebook.quicklog.reliability.UserFlowConfig
            r3.<init>(r0, r5)
            r0 = 658062002(0x27393ab2, double:3.25125828E-315)
            r2.flowStart(r0, r3)
            X.4DH r15 = r4.A02
            androidx.fragment.app.FragmentActivity r3 = r15.requireActivity()
            X.GBE r0 = r4.A04
            X.EUg r14 = new X.EUg
            r14.<init>(r3, r8, r7, r0)
            r0 = 19
            X.I8y r13 = new X.I8y
            r13.<init>((int) r0, (java.lang.Object) r4, (java.lang.Object) r2)
            r0 = 3
            X.I9G r11 = new X.I9G
            r11.<init>(r0, r4, r2)
            X.1Xj r9 = r8.A02
            if (r9 == 0) goto L_0x1119
            X.2MU r1 = com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository.A09
            android.app.Application r0 = r3.getApplication()
            X.0qQ.A07(r0)
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r10 = r1.A00(r0, r7)
            r0 = 8
            X.Iny r8 = new X.Iny
            r8.<init>(r0, r9, r4, r10)
            X.I6o r22 = X.C56659I6o.A00
            boolean r2 = X.C56659I6o.A03(r7, r9)
            java.lang.String r19 = X.I5I.A00(r3, r7, r2)
            if (r2 == 0) goto L_0x10e0
            X.0Tu r12 = X.0Tu.A05
            r0 = 36325360216191910(0x810db9000633a6, double:3.035642298980313E-306)
            boolean r0 = X.182.A06(r12, r7, r0)
            r21 = 2131956706(0x7f1313e2, float:1.9549975E38)
            if (r0 != 0) goto L_0x10e3
        L_0x10e0:
            r21 = 2131971792(0x7f134ed0, float:1.9580573E38)
        L_0x10e3:
            X.8ae r16 = X.C358278ae.BLUE
            androidx.fragment.app.FragmentActivity r0 = r4.A01
            r23 = r0
            r24 = r13
            r25 = r11
            r26 = r15
            r27 = r10
            r29 = r14
            r30 = r7
            r31 = r9
            r32 = r8
            r33 = r2
            android.content.DialogInterface$OnClickListener r10 = r22.A05(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            androidx.fragment.app.FragmentActivity r0 = r15.getActivity()
            X.I9M r14 = X.C56659I6o.A00(r0, r7, r9, r5)
            r20 = 2131971793(0x7f134ed1, float:1.9580575E38)
            r22 = 2131954722(0x7f130c22, float:1.9545951E38)
            r11 = r6
            r12 = r6
            r13 = r6
            r15 = r3
            r17 = r6
            r18 = r6
            X.C56659I6o.A02(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        L_0x1119:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x111e:
            X.GCj r4 = r0.A0N
            X.GzP r3 = new X.GzP
            r3.<init>()
            com.instagram.common.session.UserSession r0 = r4.A02
            X.7Pr r2 = X.DbS.A0W(r0)
            X.4DH r0 = r4.A01
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x1146
            r0 = 2131966515(0x7f133a33, float:1.956987E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x113a:
            r2.A0d = r0
            X.7Pu r1 = r2.A00()
            androidx.fragment.app.FragmentActivity r0 = r4.A00
            r1.A02(r0, r3)
            return
        L_0x1146:
            r0 = 0
            goto L_0x113a
        L_0x1148:
            X.Hto r3 = new X.Hto
            r3.<init>(r1)
            X.4DH r1 = r0.A05
            android.content.res.Resources r2 = X.DbV.A05(r1)
            r1 = 2131976719(0x7f13620f, float:1.9590566E38)
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r2, r1)
            r3.A02 = r1
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            X.HNR r1 = X.HNR.A1x
            r2.add(r1)
            X.HNR r1 = X.HNR.A26
            r2.add(r1)
            r0.A0G(r3, r2)
            r0.A0C(r6, r3)
            return
        L_0x1171:
            X.JTB r3 = r0.A0I
            X.1Xj r2 = r0.A02
            r1 = 0
            if (r2 == 0) goto L_0x123e
            X.GBn r0 = r0.A0R
            X.9Iy r0 = r0.A0B()
            if (r0 == 0) goto L_0x1182
            java.lang.String r1 = r0.A02
        L_0x1182:
            r3.Ev4(r2, r1)
            return
        L_0x1186:
            androidx.fragment.app.FragmentActivity r3 = r0.A04
            java.lang.String r19 = r8.getModuleName()
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x123e
            java.lang.String r20 = r2.A2n()
            X.9OT r16 = X.AnonymousClass9OT.REEL
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x123e
            com.instagram.api.schemas.MediaGenAIDetectionMethod r17 = r2.A1I()
            r15 = r3
            r18 = r1
            r21 = r5
            X.JUL.A00(r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r7 = r8.getModuleName()
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x123e
            java.lang.String r9 = r2.A2n()
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x123e
            com.instagram.api.schemas.MediaGenAIDetectionMethod r4 = r0.A1I()
            r0 = 1388(0x56c, float:1.945E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r0)
            r3 = r16
            r5 = r1
            X.C250563lf.A0e(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x11c7:
            X.JTB r5 = r0.A0I
            X.1Xj r4 = r0.A02
            if (r4 == 0) goto L_0x123e
            X.GCb r5 = (X.C52029GCb) r5
            X.GBn r0 = r5.A0d
            X.9Iy r1 = r0.A0B()
            if (r1 == 0) goto L_0x1200
            X.GIY r3 = r5.A0L
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x11eb
            X.1Xj r0 = r3.A00
            if (r0 == 0) goto L_0x123e
            java.lang.String r0 = r0.getId()
            boolean r0 = X.C51969G9p.A1Z(r4, r0)
            if (r0 != 0) goto L_0x1200
        L_0x11eb:
            java.lang.Object r0 = r1.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = X.C51970G9q.A0l(r0)
            X.05G r0 = r3.A04
            r0.Epw(r1)
            r3.A02 = r2
            r3.A00 = r4
            X.GAc r0 = r5.A0X
            r3.A01 = r0
        L_0x1200:
            androidx.fragment.app.FragmentActivity r4 = r5.A07
            X.GIY r3 = r5.A0L
            r0 = 31
            X.IwI r1 = new X.IwI
            r1.<init>(r5, r0)
            java.lang.String r0 = ""
            X.C55254Hej.A00(r4, r3, r0, r1, r2)
            return
        L_0x1211:
            X.JTB r3 = r0.A0I
            X.4bN r2 = r0.A00
            if (r2 == 0) goto L_0x1229
            X.JRO r1 = r0.A09
            X.GCb r3 = (X.C52029GCb) r3
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            r3.A0J(r2, r1, r0)
            return
        L_0x1221:
            A01(r5, r0)
            return
        L_0x1225:
            A00(r5, r0)
            return
        L_0x1229:
            X.0qQ.A0F(r16)
            goto L_0x127a
        L_0x122d:
            A04(r6, r5, r0)
            return
        L_0x1231:
            X.0qQ.A0F(r14)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x1239:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x123e:
            X.0qQ.A0F(r14)
            goto L_0x127a
        L_0x1242:
            X.3W1 r2 = r0.A03
            if (r2 == 0) goto L_0x1282
            int r3 = r2.A03
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            if (r5 == 0) goto L_0x1282
            java.util.concurrent.atomic.AtomicBoolean r2 = X.1Xj.A0i
            X.4bN r2 = r0.A00
            r10 = r16
            if (r2 == 0) goto L_0x1277
            java.util.List r2 = r2.A0R
            boolean r2 = X.1Xv.A09(r3, r2)
            if (r2 == 0) goto L_0x1282
            X.4bN r2 = r0.A00
            if (r2 == 0) goto L_0x1277
            java.util.List r2 = r2.A0R
            if (r2 == 0) goto L_0x127f
            X.1Xj r2 = X.DbZ.A0T(r2, r3)
            if (r2 == 0) goto L_0x127f
            java.lang.String r21 = r2.getId()
        L_0x1270:
            X.4DH r4 = r0.A05
            X.1Xj r3 = r0.A02
            if (r3 != 0) goto L_0x1286
            r10 = r14
        L_0x1277:
            X.0qQ.A0F(r10)
        L_0x127a:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x127f:
            r21 = r6
            goto L_0x1270
        L_0x1282:
            r5 = r6
            r21 = r6
            goto L_0x1270
        L_0x1286:
            com.instagram.clips.intf.ClipsViewerConfig r2 = r0.A07
            java.lang.Long r0 = r2.A0g
            java.lang.String r17 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r2.A0p
            java.lang.String r13 = r3.getId()
            java.lang.String r16 = X.DbT.A0x(r3)
            java.lang.Long r12 = X.DbZ.A0c(r5)
            java.lang.String r14 = "clips_action_sheet"
            java.lang.String r15 = "share"
            r9 = r1
            r10 = r6
            r11 = r6
            r18 = r0
            r19 = r6
            r20 = r6
            X.C22031Xty.A07(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = r4
            r2 = r3
            r3 = r8
            r4 = r6
            r5 = r14
            X.C46395DeI.A0U(r0, r1, r2, r3, r4, r5)
            return
        L_0x12b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x12ba:
            java.lang.String r16 = "media"
            goto L_0x12bf
        L_0x12bd:
            java.lang.String r16 = "clipsItemState"
        L_0x12bf:
            X.0qQ.A0F(r16)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52034GCg.A0D(X.HNR):void");
    }

    public static final void A00(ClipsViewerSource clipsViewerSource, C52034GCg gCg) {
        String str;
        AnonymousClass4DU r6 = gCg.A0C;
        FragmentActivity fragmentActivity = gCg.A04;
        AnonymousClass4DH r1 = gCg.A05;
        UserSession userSession = gCg.A0B;
        1Xj r8 = gCg.A02;
        if (r8 == null) {
            str = "media";
        } else {
            C267324bN r4 = gCg.A00;
            if (r4 == null) {
                str = "clipsItem";
            } else {
                C52058GDe gDe = gCg.A01;
                if (gDe == null) {
                    str = "clipsItemState";
                } else {
                    C56654I6j.A00(fragmentActivity, r1, gCg.A07, clipsViewerSource, r4, gDe, r6, userSession, r8, gCg.A0Q);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(ClipsViewerSource clipsViewerSource, C52034GCg gCg) {
        Integer num;
        String str;
        ClipsMashupType clipsMashupType;
        C52345GOp gOp = C52345GOp.A00;
        C52034GCg gCg2 = gCg;
        AnonymousClass4DU r9 = gCg2.A0C;
        UserSession userSession = gCg2.A0B;
        1Xj r12 = gCg2.A02;
        if (r12 == null) {
            str = "media";
        } else {
            C52058GDe gDe = gCg2.A01;
            if (gDe == null) {
                str = "clipsItemState";
            } else {
                AnonymousClass3W1 r1 = gDe.A0E;
                if (r1 != null) {
                    num = C51968G9o.A0s(r1);
                } else {
                    num = null;
                }
                String str2 = gCg2.A0Q.A00;
                FragmentActivity fragmentActivity = gCg2.A04;
                AnonymousClass4DH r5 = gCg2.A05;
                ClipsViewerSource clipsViewerSource2 = clipsViewerSource;
                28D A002 = C55275Hf4.A00(clipsViewerSource2);
                C267324bN r3 = gCg2.A00;
                str = "clipsItem";
                if (r3 != null) {
                    String A082 = I7J.A08(r3);
                    C267324bN r32 = gCg2.A00;
                    if (r32 != null) {
                        String A092 = I7J.A09(r32);
                        C267324bN r33 = gCg2.A00;
                        if (r33 != null) {
                            String A072 = I7J.A07(r33);
                            C267324bN r34 = gCg2.A00;
                            if (r34 != null) {
                                Boolean A062 = I7J.A06(r34);
                                C267324bN r0 = gCg2.A00;
                                if (r0 != null) {
                                    ImageUrl A012 = I7J.A01(r0);
                                    if (clipsViewerSource2 == ClipsViewerSource.REMIX_REEL || clipsViewerSource2 == ClipsViewerSource.REMIX_ORIGINAL_REEL) {
                                        clipsMashupType = ClipsMashupType.A0B;
                                    } else if (clipsViewerSource2 == ClipsViewerSource.SEQUENCE_REEL || clipsViewerSource2 == ClipsViewerSource.SEQUENCE_ORIGINAL_REEL) {
                                        clipsMashupType = ClipsMashupType.A0A;
                                    } else {
                                        clipsMashupType = null;
                                    }
                                    0qQ.A0B(A002, 7);
                                    C52345GOp.A04(r5, fragmentActivity, A002, clipsMashupType, r9, userSession, A012, r12, (1Xj) null, gOp, A062, num, str2, A082, A092, A072);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A03(C67161s9 r6, C56160Hto hto, C52034GCg gCg) {
        Context context;
        HNR hnr;
        if (r6 == null) {
            context = gCg.A05.getContext();
        } else {
            AnonymousClass4DH r4 = gCg.A05;
            hto.A02 = AnonymousClass7TF.A0d(DbV.A05(r4), 2131971972);
            ArrayList A1C = AnonymousClass7TE.A1C();
            if (r6.getHasBeenMashedUp() && r6.getCanToggleMashupsAllowed()) {
                A1C.add(HNR.A1f);
            }
            C267324bN r2 = gCg.A00;
            if (r2 == null) {
                0qQ.A0F("clipsItem");
                throw AnonymousClass00P.createAndThrow();
            }
            if (AnonymousClass3ZC.A0H(r2, gCg.A0B) && r6.getCanToggleMashupsAllowed()) {
                if (r6.getMashupsAllowed()) {
                    hnr = HNR.A23;
                } else {
                    hnr = HNR.A2D;
                }
                A1C.add(hnr);
            }
            gCg.A0G(hto, A1C);
            if (A1C.isEmpty()) {
                context = r4.getContext();
            } else {
                gCg.A0C((View) null, hto);
                return;
            }
        }
        C59689JTv.A0F(context, "remix_unavailable", 2131956124);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r2 != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r3 != null) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.C52034GCg r5, java.lang.Boolean r6, java.lang.Boolean r7) {
        /*
            X.1Xj r0 = r5.A02
            java.lang.String r4 = "media"
            if (r0 == 0) goto L_0x004e
            X.1Xy r0 = r0.A0C
            X.8wJ r1 = r0.BPi()
            if (r6 != 0) goto L_0x0045
            if (r1 == 0) goto L_0x0016
            com.instagram.api.schemas.MediaGiftingState r3 = r1.BQ5()
            if (r3 != 0) goto L_0x0018
        L_0x0016:
            com.instagram.api.schemas.MediaGiftingState r3 = com.instagram.api.schemas.MediaGiftingState.DISABLED
        L_0x0018:
            if (r7 != 0) goto L_0x003c
            if (r1 == 0) goto L_0x0022
            com.instagram.api.schemas.MediaGiftCountVisibilityState r2 = r1.B9J()
            if (r2 != 0) goto L_0x0024
        L_0x0022:
            com.instagram.api.schemas.MediaGiftCountVisibilityState r2 = com.instagram.api.schemas.MediaGiftCountVisibilityState.DISABLED
        L_0x0024:
            X.1Xj r0 = r5.A02
            if (r0 == 0) goto L_0x004e
            X.8wI r1 = new X.8wI
            r1.<init>(r2, r3)
            X.1Xy r0 = r0.A0C
            r0.Ecs(r1)
            X.1Xj r1 = r5.A02
            if (r1 == 0) goto L_0x004e
            com.instagram.common.session.UserSession r0 = r5.A0B
            r1.AE7(r0)
            return
        L_0x003c:
            boolean r0 = r7.booleanValue()
            if (r0 != 0) goto L_0x0022
            com.instagram.api.schemas.MediaGiftCountVisibilityState r2 = com.instagram.api.schemas.MediaGiftCountVisibilityState.ENABLED
            goto L_0x0024
        L_0x0045:
            boolean r0 = r6.booleanValue()
            if (r0 == 0) goto L_0x0016
            com.instagram.api.schemas.MediaGiftingState r3 = com.instagram.api.schemas.MediaGiftingState.ENABLED
            goto L_0x0018
        L_0x004e:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52034GCg.A06(X.GCg, java.lang.Boolean, java.lang.Boolean):void");
    }

    public static final void A07(C52034GCg gCg, 0sL r6, boolean z, boolean z2) {
        C363388je.A00(gCg.A0B).A01(gCg.A0T, new C57156IQu(r6, 1, z, z2), AnonymousClass000.A00(759));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        if (r1 == null) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A08(boolean r17) {
        /*
            r16 = this;
            r4 = r16
            androidx.fragment.app.FragmentActivity r0 = r4.A04
            X.2YN r1 = new X.2YN
            r1.<init>(r0)
            java.lang.Class<X.GIc> r0 = X.C52186GIc.class
            X.2YL r0 = r1.A00(r0)
            X.GIc r0 = (X.C52186GIc) r0
            java.lang.String r3 = r0.A01
            if (r3 == 0) goto L_0x0029
            r0 = 1
            char[] r2 = new char[r0]
            r1 = 0
            r0 = 95
            r2[r1] = r0
            java.util.List r0 = X.00l.A0Q(r3, r2, r1)
            java.lang.Object r1 = X.00k.A0J(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x002b
        L_0x0029:
            java.lang.String r1 = ""
        L_0x002b:
            X.GCh r2 = r4.A0L
            com.instagram.common.session.UserSession r0 = r2.A03
            X.JRL r0 = X.C63504KyF.A00(r0)
            X.0qQ.A07(r0)
            r3 = r17
            int r13 = r0.AwF(r3)
            androidx.fragment.app.FragmentActivity r8 = r2.A01
            int r0 = r0.AwE(r3)
            java.lang.String r12 = X.AnonymousClass7TE.A16(r8, r0)
            X.8ae r9 = X.C358278ae.RED_BOLD
            r0 = 21
            X.FJh r3 = new X.FJh
            r3.<init>((java.lang.String) r1, (java.lang.Object) r2, (int) r0)
            r5 = 0
            r14 = 2131957531(0x7f13171b, float:1.9551649E38)
            X.HqC r0 = r2.A05
            X.GE2 r1 = r0.A00
            r0 = 0
            X.GE2.A03(r1, r0)
            X.I8t r4 = X.C56713I8t.A00
            r0 = 8
            X.I9B r6 = new X.I9B
            r6.<init>(r2, r0)
            r15 = 2131954722(0x7f130c22, float:1.9545951E38)
            r7 = r5
            r10 = r5
            r11 = r5
            X.C56659I6o.A02(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52034GCg.A08(boolean):void");
    }

    private final void A09(boolean z) {
        Integer num;
        AnonymousClass7TE.A1Z(new MGB(this, (AnonymousClass4D7) null, 24, z), DbV.A0J(this.A05));
        1Z0 A002 = AnonymousClass2BF.A00();
        UserSession userSession = this.A0B;
        AnonymousClass4DU r2 = this.A0C;
        C63757L5p A012 = A002.A01(r2, userSession, DbS.A0t(this.A0S), r2.getModuleName());
        1Xj r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("media");
            throw AnonymousClass00P.createAndThrow();
        }
        String A2n = r0.A2n();
        if (A2n != null) {
            LTO lto = A012.A00;
            boolean A052 = AnonymousClass2o3.A00(A012.A02).A05(UserMonetizationProductType.CONTENT_APPRECIATION);
            Integer num2 = AnonymousClass05K.A03;
            if (z) {
                num = AnonymousClass05K.A0A;
            } else {
                num = AnonymousClass05K.A0B;
            }
            LTO.A04(lto, num2, num, A2n, A052, false);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    private final void A0A(boolean z) {
        Context requireContext = this.A05.requireContext();
        1Xj r2 = this.A02;
        if (r2 == null) {
            0qQ.A0F("media");
            throw AnonymousClass00P.createAndThrow();
        } else {
            LTW.A03(requireContext, this.A0B, r2, this.A0C.getModuleName(), z);
        }
    }

    private final void A0B(boolean z) {
        Integer num;
        AnonymousClass7TE.A1Z(new MGB(this, (AnonymousClass4D7) null, 25, z), DbV.A0J(this.A05));
        1Z0 A002 = AnonymousClass2BF.A00();
        UserSession userSession = this.A0B;
        AnonymousClass4DU r2 = this.A0C;
        C63757L5p A012 = A002.A01(r2, userSession, DbS.A0t(this.A0S), r2.getModuleName());
        1Xj r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("media");
            throw AnonymousClass00P.createAndThrow();
        }
        String A2n = r0.A2n();
        if (A2n != null) {
            LTO lto = A012.A00;
            boolean A052 = AnonymousClass2o3.A00(A012.A02).A05(UserMonetizationProductType.CONTENT_APPRECIATION);
            Integer num2 = AnonymousClass05K.A03;
            if (z) {
                num = AnonymousClass05K.A15;
            } else {
                num = AnonymousClass05K.A1F;
            }
            LTO.A04(lto, num2, num, A2n, A052, false);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A0C(View view, C56160Hto hto) {
        if (AnonymousClass7TE.A1b(hto.A05)) {
            GE2.A03(this.A0H.A00, false);
            new C17897Vho(hto).A00(this.A05.requireContext());
            AnonymousClass37D A012 = AnonymousClass37D.A00.A01(this.A04);
            if (A012 != null) {
                A012.A0Q(new HFZ(3, this, view));
            }
        }
    }

    public final void A0E(HNR hnr, C56160Hto hto) {
        String A0d = AnonymousClass7TF.A0d(DbV.A05(this.A05), A0V.A03(this.A0B, hnr));
        ID3 id3 = new ID3(18, (Object) hnr, (Object) this);
        int i = hnr.A00;
        String A002 = I5Y.A00(hnr);
        1Xj r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("media");
            throw AnonymousClass00P.createAndThrow();
        }
        float A003 = C55271Hf0.A00(r0, hnr);
        C71065Oak oak = new C71065Oak((View.OnClickListener) id3, (CharSequence) A0d, (String) null, false);
        oak.A05 = i;
        oak.A0A = A002;
        oak.A00 = A003;
        hto.A05.add(oak);
        A05(hnr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0165, code lost:
        if (r4 != true) goto L_0x0167;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(X.HNR r25, X.C56160Hto r26, java.lang.String r27) {
        /*
            r24 = this;
            r19 = r27
            r2 = 1
            r1 = r25
            X.0qQ.A0B(r1, r2)
            X.I5Y r7 = A0V
            r0 = r24
            com.instagram.common.session.UserSession r6 = r0.A0B
            X.4bN r4 = r0.A00
            if (r4 != 0) goto L_0x001c
            java.lang.String r9 = "clipsItem"
        L_0x0014:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001c:
            int r5 = r1.ordinal()
            r3 = 148(0x94, float:2.07E-43)
            if (r5 == r3) goto L_0x015a
            r3 = 149(0x95, float:2.09E-43)
            if (r5 == r3) goto L_0x015a
            r9 = 0
        L_0x0029:
            r3 = 154(0x9a, float:2.16E-43)
            if (r5 != r3) goto L_0x0156
            X.GBn r3 = r0.A0R
            r20 = 0
            X.9Iy r3 = r3.A0B()
            if (r3 == 0) goto L_0x003f
            java.lang.String r3 = r3.A02
            if (r3 == 0) goto L_0x0147
            java.lang.String r20 = X.AnonymousClass3WS.A01(r3)
        L_0x003f:
            r3 = r26
            if (r9 == 0) goto L_0x00ab
            androidx.fragment.app.FragmentActivity r5 = r0.A04
            if (r27 != 0) goto L_0x0055
            X.4DH r4 = r0.A05
            android.content.res.Resources r8 = X.DbV.A05(r4)
            int r4 = r7.A03(r6, r1)
            java.lang.String r19 = X.AnonymousClass7TF.A0d(r8, r4)
        L_0x0055:
            X.4DH r4 = r0.A05
            android.content.res.Resources r6 = X.DbV.A05(r4)
            int r4 = r9.intValue()
            java.lang.String r21 = X.AnonymousClass7TF.A0d(r6, r4)
            int r6 = r1.A00
            r4 = 19
            X.ID3 r7 = new X.ID3
            r7.<init>((int) r4, (java.lang.Object) r1, (java.lang.Object) r0)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r4 = 2132018616(0x7f1405b8, float:1.9675544E38)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)
            int r4 = X.2Yu.A07(r5)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            r4 = 2132018053(0x7f140385, float:1.9674402E38)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)
            int r4 = X.2Yu.A08(r5)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r4)
            r8 = 0
            X.Njo r11 = X.C69349Njo.TYPE_UNKNOWN
            X.OIM r6 = new X.OIM
            r9 = r8
            r10 = r8
            r17 = r8
            r18 = r8
            r20 = r8
            r22 = r2
            r23 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x00a2:
            java.util.LinkedList r2 = r3.A05
            r2.add(r6)
        L_0x00a7:
            r0.A05(r1)
            return
        L_0x00ab:
            androidx.fragment.app.FragmentActivity r4 = r0.A04
            if (r20 == 0) goto L_0x00ee
            if (r27 != 0) goto L_0x00bf
            X.4DH r5 = r0.A05
            android.content.res.Resources r8 = X.DbV.A05(r5)
            int r5 = r7.A03(r6, r1)
            java.lang.String r19 = X.AnonymousClass7TF.A0d(r8, r5)
        L_0x00bf:
            r5 = 20
            X.ID3 r7 = new X.ID3
            r7.<init>((int) r5, (java.lang.Object) r1, (java.lang.Object) r0)
            r5 = 2132018616(0x7f1405b8, float:1.9675544E38)
            int r4 = X.2Yu.A07(r4)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            r8 = 0
            X.Njo r11 = X.C69349Njo.TYPE_UNKNOWN
            X.OIM r6 = new X.OIM
            r9 = r8
            r10 = r8
            r12 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r21 = r8
            r22 = r2
            r23 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x00a2
        L_0x00ee:
            if (r27 != 0) goto L_0x00fe
            X.4DH r2 = r0.A05
            android.content.res.Resources r8 = X.DbV.A05(r2)
            int r2 = r7.A03(r6, r1)
            java.lang.String r19 = X.AnonymousClass7TF.A0d(r8, r2)
        L_0x00fe:
            boolean r16 = X.I5Y.A02(r1)
            r2 = 21
            X.ID3 r7 = new X.ID3
            r7.<init>((int) r2, (java.lang.Object) r1, (java.lang.Object) r0)
            int r6 = r1.A00
            java.lang.String r12 = X.I5Y.A00(r1)
            X.1Xj r2 = r0.A02
            java.lang.String r9 = "media"
            if (r2 == 0) goto L_0x0014
            float r13 = X.C55271Hf0.A00(r2, r1)
            X.1Xj r8 = r0.A02
            if (r8 == 0) goto L_0x0014
            r2 = 48
            r18 = 1
            if (r5 == r2) goto L_0x0139
            r2 = 52
            if (r5 == r2) goto L_0x0144
            r2 = 53
            if (r5 == r2) goto L_0x0144
        L_0x012b:
            r15 = 0
            r8 = r3
            r9 = r4
            r10 = r7
            r11 = r19
            r14 = r6
            r17 = r15
            r8.A02(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x00a7
        L_0x0139:
            X.Dfd r2 = X.C246353eS.A01(r8)
            boolean r2 = r2.A00()
            if (r2 != 0) goto L_0x0144
            goto L_0x012b
        L_0x0144:
            r18 = 0
            goto L_0x012b
        L_0x0147:
            X.4DH r3 = r0.A05
            android.content.res.Resources r4 = X.DbV.A05(r3)
            r3 = 2131971895(0x7f134f37, float:1.9580782E38)
            java.lang.String r20 = r4.getString(r3)
            goto L_0x003f
        L_0x0156:
            r20 = 0
            goto L_0x003f
        L_0x015a:
            X.1Xj r3 = r4.A02
            if (r3 == 0) goto L_0x0167
            boolean r4 = r3.A4S()
            r3 = 2131956011(0x7f13112b, float:1.9548566E38)
            if (r4 == r2) goto L_0x016a
        L_0x0167:
            r3 = 2131956012(0x7f13112c, float:1.9548568E38)
        L_0x016a:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52034GCg.A0F(X.HNR, X.Hto, java.lang.String):void");
    }

    public C52034GCg(FragmentActivity fragmentActivity, AnonymousClass4DH r14, G7V g7v, ClipsViewerConfig clipsViewerConfig, C227282ix r17, JRO jro, UserSession userSession, AnonymousClass4DU r20, JSw jSw, AnonymousClass324 r22, AnonymousClass93U r23, GBE gbe, C55948HqC hqC, C52009GBg gBg, JTB jtb, JR6 jr6, C52179GHv gHv, H3C h3c, C52033GCf gCf, C55684Hlh hlh, C52016GBn gBn) {
        UserSession userSession2 = userSession;
        this.A0B = userSession2;
        this.A04 = fragmentActivity;
        this.A05 = r14;
        this.A0C = r20;
        this.A0F = r23;
        this.A0Q = hlh;
        GBE gbe2 = gbe;
        this.A0G = gbe2;
        C55948HqC hqC2 = hqC;
        this.A0H = hqC2;
        this.A0E = r22;
        C52009GBg gBg2 = gBg;
        this.A0U = gBg2;
        this.A09 = jro;
        this.A0K = gHv;
        this.A07 = clipsViewerConfig;
        this.A0D = jSw;
        this.A0I = jtb;
        this.A0J = jr6;
        this.A08 = r17;
        this.A06 = g7v;
        this.A0P = gCf;
        this.A0M = h3c;
        this.A0R = gBn;
        this.A0L = new C52035GCh(fragmentActivity, r14, userSession2, gbe2, hqC2);
        this.A0O = new C52036GCi(fragmentActivity, r14, userSession2, hqC2, gBg2);
        this.A0N = new C52037GCj(fragmentActivity, r14, userSession2);
        r14.registerLifecycleListener(new IO7(this, 3));
    }

    public static final void A02(ClipsViewerSource clipsViewerSource, C52034GCg gCg) {
        Context context;
        int i;
        String str;
        int ordinal = clipsViewerSource.ordinal();
        if (ordinal == 57 || ordinal == 54) {
            context = gCg.A05.getContext();
            i = 2131956124;
            str = "remix_unavailable";
        } else if (ordinal == 58 || ordinal == 60) {
            context = gCg.A05.getContext();
            i = 2131956128;
            str = "sequencing_unavailable";
        } else {
            return;
        }
        C59689JTv.A0F(context, str, i);
    }

    private final void A05(HNR hnr) {
        UserSession userSession;
        AnonymousClass818 r5;
        JZY jzy;
        JZZ jzz;
        0bb r2;
        String str;
        String str2;
        int ordinal = hnr.ordinal();
        if (ordinal == 52 || ordinal == 53) {
            userSession = this.A0B;
            r5 = AnonymousClass818.IG_REELS_OVERFLOW_MENU;
            jzy = JZY.UNAVAILABLE;
            jzz = JZZ.REELS;
            r2 = new 0bb();
            1Xj r0 = this.A02;
            if (r0 != null) {
                r2.A06("media_id", r0.getId());
                str = C273654mx.A00(58);
                str2 = "unavailable_reason";
            }
            0qQ.A0F("media");
            throw AnonymousClass00P.createAndThrow();
        }
        switch (ordinal) {
            case 48:
            case 49:
            case 51:
                userSession = this.A0B;
                r5 = AnonymousClass818.IG_REELS_OVERFLOW_MENU;
                jzy = JZY.VIEW;
                jzz = JZZ.REELS;
                r2 = new 0bb();
                1Xj r02 = this.A02;
                if (r02 != null) {
                    str = r02.getId();
                    str2 = "media_id";
                    break;
                }
                break;
            default:
                return;
        }
        r2.A06(str2, str);
        JZX.A00(jzy, jzz, r5, r2, userSession);
    }

    public final void A0G(C56160Hto hto, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0F((HNR) it.next(), hto, (String) null);
        }
    }
}
