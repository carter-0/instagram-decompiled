package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4PG  reason: invalid class name */
public final class AnonymousClass4PG {
    public C265114Sp A00;
    public String A01;
    public boolean A02;
    public final Context A03;
    public final Handler A04;
    public final AnonymousClass2SB A05;
    public final 28S A06;
    public final AnonymousClass4OS A07;
    public final C264184Ox A08;
    public final 27D A09;
    public final ServiceEventCallbackImpl A0A;
    public final AnonymousClass4P8 A0B;
    public final AnonymousClass4PE A0C;
    public final C290435fJ A0D;
    public final C290445fK A0E;
    public final HeroPlayerSetting A0F;
    public final Map A0G;

    /* JADX WARNING: type inference failed for: r1v2, types: [X.4Q0, java.lang.Object] */
    private DefaultAudioSink A00() {
        C264384Pr r3 = C264384Pr.A01;
        ArrayList arrayList = new ArrayList();
        C264394Ps[] r0 = (C264394Ps[]) arrayList.toArray(new C264394Ps[arrayList.size()]);
        r0.getClass();
        C264404Pt r2 = new C264404Pt(r0);
        r3.getClass();
        if (!TextUtils.isEmpty((CharSequence) null)) {
            AtomicReference atomicReference = 2CY.A0G;
            0qQ.A0B((Object) null, 0);
        } else if (TextUtils.isEmpty((CharSequence) null)) {
            return new DefaultAudioSink(r3, r2, new Object());
        } else {
            AtomicReference atomicReference2 = 2CY.A0G;
            0qQ.A0B((Object) null, 0);
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public static C256633w6 A01(Context context, AnonymousClass4OI r6, HeroPlayerSetting heroPlayerSetting) {
        Uri parse = Uri.parse("");
        C255653uU r0 = r6.A0K;
        String str = r0.A0G;
        String str2 = r0.A09;
        Uri uri = r0.A05;
        if (uri != null) {
            parse = uri;
        }
        C256633w6 A022 = C256373vf.A02(parse, new C256343vc(context, heroPlayerSetting, str, false), str2);
        if (A022 != null) {
            return A022;
        }
        throw new IOException("Missing manifest");
    }

    public static String A02(C256883wV r5) {
        List list;
        if (r5 == null || (list = r5.A01) == null || list.isEmpty()) {
            return "";
        }
        int size = list.size();
        int[] iArr = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((C256733wG) list.get(i2)).A02.A05;
        }
        Arrays.sort(iArr);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i3 = size - 1;
            if (i < i3) {
                sb.append(iArr[i]);
                sb.append(":");
                i++;
            } else {
                sb.append(iArr[i3]);
                return sb.toString();
            }
        }
    }

    public final AnonymousClass4PK A03(AnonymousClass4OI r28, C256823wP r29) {
        27D r0 = this.A09;
        HeroPlayerSetting heroPlayerSetting = this.A0F;
        AnonymousClass4PH r12 = new AnonymousClass4PH(r0);
        1xH r02 = heroPlayerSetting.A01;
        AnonymousClass4OI r15 = r28;
        C256823wP r21 = r29;
        if (r02 == null || ((!r02.A0O || !heroPlayerSetting.A10.A0e) && !heroPlayerSetting.A10.A0d)) {
            Context context = this.A03;
            AnonymousClass2SB r10 = this.A05;
            long j = heroPlayerSetting.A0k;
            C265114Sp r9 = this.A00;
            Handler handler = this.A04;
            AnonymousClass4P8 r7 = this.A0B;
            boolean z = heroPlayerSetting.A3O;
            boolean z2 = heroPlayerSetting.A2h;
            boolean z3 = heroPlayerSetting.A1J;
            boolean z4 = false;
            String str = r15.A0K.A0B;
            if (!TextUtils.isEmpty(str) && heroPlayerSetting.A1C.contains(str)) {
                z4 = true;
            }
            AnonymousClass4PI r14 = new AnonymousClass4PI(context, handler, r12, r10, r9, r21, r7, j);
            r14.A0X = z;
            r14.A0T = false;
            r14.A0Y = z2;
            r14.A0S = null;
            r14.A0O = false;
            r14.A0K = z3;
            r14.A0N = z4;
            return r14;
        }
        Context context2 = this.A03;
        AnonymousClass2SB r8 = this.A05;
        C284775Nw r6 = new C284775Nw(r12, r8, (Object) null, true);
        long j2 = heroPlayerSetting.A0k;
        Handler handler2 = this.A04;
        AnonymousClass4P8 r16 = this.A0B;
        boolean z5 = heroPlayerSetting.A3O;
        boolean z6 = heroPlayerSetting.A2h;
        boolean z7 = heroPlayerSetting.A1J;
        boolean z8 = false;
        String str2 = r15.A0K.A0B;
        if (!TextUtils.isEmpty(str2) && heroPlayerSetting.A1C.contains(str2)) {
            z8 = true;
        }
        boolean z9 = heroPlayerSetting.A2r;
        AnonymousClass5O1 r2 = new AnonymousClass5O1(r15, this);
        AnonymousClass5O2 r142 = new AnonymousClass5O2(context2, handler2, r2, r12, r8, r6, r21, r16, (Object) null, j2, z9);
        r142.A0N = z5;
        r142.A0G = false;
        r142.A0M = z6;
        r142.A0c = false;
        r142.A0X = z7;
        r142.A0b = z8;
        return r142;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: X.3wP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: X.5OT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: X.SwU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: X.5OT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: X.5OT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: X.5OT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: X.5OT} */
    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r16v4 */
    /* JADX WARNING: type inference failed for: r15v6 */
    /* JADX WARNING: type inference failed for: r17v14, types: [X.4Pp] */
    /* JADX WARNING: type inference failed for: r17v15, types: [X.4Xp] */
    /* JADX WARNING: type inference failed for: r8v22 */
    /* JADX WARNING: type inference failed for: r17v16, types: [X.4Po] */
    /* JADX WARNING: type inference failed for: r17v17, types: [X.5Nv] */
    /* JADX WARNING: type inference failed for: r16v14 */
    /* JADX WARNING: type inference failed for: r21v11, types: [X.XOO] */
    /* JADX WARNING: type inference failed for: r21v12, types: [X.XON] */
    /* JADX WARNING: type inference failed for: r21v13, types: [X.4PI] */
    /* JADX WARNING: type inference failed for: r21v14, types: [X.5O2] */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03f0, code lost:
        if (r10.A0R != false) goto L_0x03f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03f2, code lost:
        r0 = false;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03f3, code lost:
        r7 = r48;
        r5 = new X.AnonymousClass4QM(r11.getLooper(), new X.AnonymousClass4QK(r1), new X.AnonymousClass4QI(r7, r3, r0));
        r4 = new X.AnonymousClass4QN(r7, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x040d, code lost:
        if (r10 == null) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0411, code lost:
        if (r10.A0Q == false) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0413, code lost:
        r2 = new X.AnonymousClass4QR(r11.getLooper(), X.AnonymousClass4QP.A00, r4, r2.A08);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x042a, code lost:
        return new X.AnonymousClass4PL[]{r16, r8, r5, r2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x042b, code lost:
        r2 = new X.C290295f5(r11.getLooper(), X.AnonymousClass4QP.A00, r4, r2.A08);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04cd, code lost:
        if (r10 == null) goto L_0x03f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00eb, code lost:
        if (r11.A0T == false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0186, code lost:
        if (r6.A08 != false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01a0, code lost:
        if (r1.A1d == false) goto L_0x01a2;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0507  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4PL[] A05(X.AnonymousClass4OI r47, X.AnonymousClass4OS r48, X.C256633w6 r49) {
        /*
            r46 = this;
            r6 = r47
            X.3uU r2 = r6.A0K
            boolean r10 = r2.A02()
            r3 = r46
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r1 = r3.A0F
            boolean r8 = r1.A1J
            r9 = 0
            if (r8 == 0) goto L_0x0012
            r9 = 1
        L_0x0012:
            boolean r0 = r1.A1N
            r7 = 0
            if (r0 == 0) goto L_0x0018
            r7 = 1
        L_0x0018:
            boolean r5 = r1.A2y
            r4 = 0
            if (r5 == 0) goto L_0x001e
            r4 = 1
        L_0x001e:
            java.util.HashMap r0 = r1.A19
            r21 = r0
            if (r10 == 0) goto L_0x0048
            boolean r0 = r1.A2x
            if (r0 == 0) goto L_0x0042
            java.lang.String r11 = "video/av01"
            X.5OT r0 = new X.5OT
            r10 = r0
            r12 = r21
            r13 = r9
            r14 = r7
            r15 = r4
            r10.<init>(r11, r12, r13, r14, r15)
        L_0x0035:
            boolean r4 = r1.A2i
            r11 = r49
            if (r4 == 0) goto L_0x00a9
            java.lang.String r14 = "; Exception: "
            java.lang.String r7 = "Device: "
            if (r49 == 0) goto L_0x0068
            goto L_0x005d
        L_0x0042:
            X.SwU r0 = new X.SwU
            r0.<init>(r9, r7, r4)
            goto L_0x0035
        L_0x0048:
            if (r7 == 0) goto L_0x0057
            r11 = 0
            r14 = 1
            X.5OT r0 = new X.5OT
            r10 = r0
            r12 = r21
            r13 = r9
            r15 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0035
        L_0x0057:
            X.3wP r0 = X.C256823wP.A00
            r0.getClass()
            goto L_0x0035
        L_0x005d:
            java.lang.String r9 = r2.A0G     // Catch:{ 2A7 -> 0x008a }
            X.28S r4 = r3.A06     // Catch:{ 2A7 -> 0x008a }
            X.WMB r4 = X.C256813wO.A00(r4, r11, r9)     // Catch:{ 2A7 -> 0x008a }
            r3.A00 = r4     // Catch:{ 2A7 -> 0x008a }
            goto L_0x00a9
        L_0x0068:
            boolean r4 = r2.A03()
            if (r4 == 0) goto L_0x00a9
            java.lang.String r10 = r2.A0G     // Catch:{ 2A7 -> 0x0080 }
            X.28S r9 = r3.A06     // Catch:{ 2A7 -> 0x0080 }
            java.util.Set r4 = X.C256813wO.A00     // Catch:{ 2A7 -> 0x0080 }
            X.SwH r4 = new X.SwH     // Catch:{ 2A7 -> 0x0080 }
            r4.<init>(r9, r10)     // Catch:{ 2A7 -> 0x0080 }
            X.WMB r4 = X.C256813wO.A01(r4)     // Catch:{ 2A7 -> 0x0080 }
            r3.A00 = r4     // Catch:{ 2A7 -> 0x0080 }
            goto L_0x00a9
        L_0x0080:
            r16 = move-exception
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r13 = r3.A0A
            java.lang.String r12 = r2.A0G
            java.lang.String r10 = "DRM"
            X.4Yz r4 = X.C266464Yz.A0F
            goto L_0x0093
        L_0x008a:
            r16 = move-exception
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r13 = r3.A0A
            java.lang.String r12 = r2.A0G
            java.lang.String r10 = "DRM"
            X.4Yz r4 = X.C266464Yz.A0E
        L_0x0093:
            java.lang.String r9 = r4.name()
            java.lang.String r15 = android.os.Build.MODEL
            java.lang.String r4 = r16.getMessage()
            java.lang.String r7 = X.002.A0u(r7, r15, r14, r4)
            X.4Yy r4 = new X.4Yy
            r4.<init>(r12, r10, r9, r7)
            r13.callback(r4)
        L_0x00a9:
            r7 = 0
            r3.A02 = r7
            boolean r4 = r2.A02()
            r16 = 0
            java.lang.String r20 = "HeroExo2InitHelper"
            r10 = 1
            if (r4 == 0) goto L_0x02cd
            java.lang.String r9 = r2.A0G
            boolean r4 = r6.A0U
            r19 = r4
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r19)
            boolean r4 = r6.A0V
            r17 = r4
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r17)
            boolean r12 = r6.A0W
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r12)
            boolean r4 = r2.A0N
            r13 = 0
            if (r4 == 0) goto L_0x00d5
            r13 = 1
        L_0x00d5:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r4 = r18
            java.lang.Object[] r14 = new java.lang.Object[]{r9, r4, r15, r14, r13}
            java.lang.String r13 = "VideoId: %s, NeedCentering: %b, ShouldCropToFit: %b, isSponsored: %b"
            r4 = r20
            X.27B.A01(r4, r13, r14)
            if (r49 == 0) goto L_0x00ed
            boolean r4 = r11.A0T
            r14 = 1
            if (r4 != 0) goto L_0x00ee
        L_0x00ed:
            r14 = 0
        L_0x00ee:
            boolean r4 = r1.A2x
            r18 = r4
            r11 = r21
            boolean r4 = X.AnonymousClass5OU.A01(r11, r4)
            r13 = 0
            if (r4 == 0) goto L_0x00fc
            r13 = 1
        L_0x00fc:
            if (r5 == 0) goto L_0x0138
            java.lang.String r4 = "video/av01"
            java.util.List r4 = X.2BR.A05(r4, r7, r7)     // Catch:{ 275 -> 0x0124 }
            if (r4 == 0) goto L_0x0138
            java.util.Iterator r11 = r4.iterator()
        L_0x010a:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x0138
            java.lang.Object r4 = r11.next()
            X.2Km r4 = (X.2Km) r4
            if (r4 == 0) goto L_0x010a
            java.lang.String r5 = r4.A03
            java.lang.String r4 = "c2.android.av1-dav1d.decoder"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x010a
            r4 = 1
            goto L_0x0139
        L_0x0124:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            java.lang.Object[] r11 = new java.lang.Object[]{r4}
            java.lang.String r5 = "AV1Helper"
            r4 = 1269(0x4f5, float:1.778E-42)
            java.lang.String r4 = X.C273654mx.A00(r4)
            X.27B.A02(r5, r4, r11)
        L_0x0138:
            r4 = 0
        L_0x0139:
            if (r8 != 0) goto L_0x013f
            if (r13 != 0) goto L_0x026c
            if (r4 != 0) goto L_0x026c
        L_0x013f:
            if (r9 != 0) goto L_0x0143
            java.lang.String r9 = ""
        L_0x0143:
            if (r17 == 0) goto L_0x0146
            goto L_0x014e
        L_0x0146:
            if (r12 == 0) goto L_0x014b
            exoplayer2.av1.src.Dav1dScalingMode r22 = exoplayer2.av1.src.Dav1dScalingMode.SCALE_FILL     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            goto L_0x0150
        L_0x014b:
            exoplayer2.av1.src.Dav1dScalingMode r22 = exoplayer2.av1.src.Dav1dScalingMode.ASPECT_FIT     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            goto L_0x0150
        L_0x014e:
            exoplayer2.av1.src.Dav1dScalingMode r22 = exoplayer2.av1.src.Dav1dScalingMode.ASPECT_FILL     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
        L_0x0150:
            long r4 = r1.A0k     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r44 = r4
            X.2Cz r11 = X.2Cz.A0A     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            X.2D2 r5 = X.2CY.A02     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            X.2Cz r4 = r5.A01     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            if (r11 != r4) goto L_0x0171
            int r11 = X.2CY.A01(r5)     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            if (r11 <= 0) goto L_0x0171
        L_0x0162:
            X.2Cz r12 = X.2Cz.A09     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            X.2D2 r5 = X.2CY.A01     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            X.2Cz r4 = r5.A01     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            if (r12 != r4) goto L_0x0176
            int r4 = X.2CY.A01(r5)     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            if (r4 <= 0) goto L_0x0176
            goto L_0x0174
        L_0x0171:
            int r11 = r1.A0F     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            goto L_0x0162
        L_0x0174:
            r12 = 1
            goto L_0x0178
        L_0x0176:
            int r12 = r1.A0D     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
        L_0x0178:
            int r4 = r1.A0E     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r24 = r4
            boolean r4 = r1.A1w     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            if (r4 != 0) goto L_0x0188
            if (r14 != 0) goto L_0x0188
            boolean r4 = r6.A08     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r31 = 0
            if (r4 == 0) goto L_0x018a
        L_0x0188:
            r31 = 1
        L_0x018a:
            boolean r4 = r1.A1v     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r23 = r4
            boolean r4 = r1.A1O     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r21 = r4
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r4 = r3.A0A     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r17 = r4
            r35 = r19 ^ 1
            boolean r4 = r6.A0Q     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            if (r4 == 0) goto L_0x01a2
            boolean r4 = r1.A1d     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r36 = 1
            if (r4 != 0) goto L_0x01a4
        L_0x01a2:
            r36 = 0
        L_0x01a4:
            int r15 = r1.A0T     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            boolean r14 = r1.A1x     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            boolean r13 = r1.A1u     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            X.1yD r5 = r1.A10     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            android.content.Context r4 = r3.A03     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r43 = r4
            exoplayer2.av1.src.Dav1dMediaCodecAdapterSetting r4 = new exoplayer2.av1.src.Dav1dMediaCodecAdapterSetting     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r25 = r7
            r26 = r11
            r27 = r12
            r28 = r24
            r29 = r10
            r30 = r7
            r32 = r23
            r33 = r21
            r34 = r17
            r37 = r15
            r38 = r14
            r39 = r13
            r40 = r7
            r41 = r7
            r42 = r9
            r21 = r4
            r23 = r44
            r21.<init>(r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            X.27D r11 = r3.A09     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            X.4PH r9 = new X.4PH     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r9.<init>(r11)     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            X.1xH r11 = r1.A01     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            if (r11 == 0) goto L_0x0232
            boolean r11 = r11.A0O     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            if (r11 == 0) goto L_0x01ea
            boolean r11 = r5.A0e     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            if (r11 != 0) goto L_0x01ee
        L_0x01ea:
            boolean r5 = r5.A0d     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            if (r5 == 0) goto L_0x0232
        L_0x01ee:
            X.2SB r12 = r3.A05     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            X.5Nw r11 = new X.5Nw     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r11.<init>(r9, r12, r4, r10)     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            android.os.Handler r5 = r3.A04     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r23 = r5
            X.4P8 r5 = r3.A0B     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r19 = r5
            boolean r14 = r1.A3O     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            boolean r13 = r1.A2h     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            boolean r5 = r1.A2r     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r17 = r5
            X.Xyf r5 = new X.Xyf     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r5.<init>(r6, r3)     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            X.5O2 r15 = new X.5O2     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r21 = r15
            r22 = r43
            r24 = r5
            r25 = r9
            r26 = r12
            r27 = r11
            r28 = r0
            r29 = r19
            r30 = r4
            r31 = r44
            r33 = r17
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33)     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r15.A0N = r14     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r15.A0G = r7     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r15.A0M = r13     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r15.A0c = r10     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r15.A0X = r8     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r15.A0b = r7     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            goto L_0x0265
        L_0x0232:
            X.2SB r5 = r3.A05     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r17 = r5
            X.4Sp r14 = r3.A00     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            android.os.Handler r13 = r3.A04     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            X.4P8 r12 = r3.A0B     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            boolean r11 = r1.A3O     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            boolean r5 = r1.A2h     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            X.4PI r15 = new X.4PI     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r21 = r15
            r22 = r43
            r23 = r13
            r24 = r9
            r25 = r17
            r26 = r14
            r27 = r0
            r28 = r12
            r29 = r44
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r15.A0X = r11     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r15.A0T = r7     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r15.A0Y = r5     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r15.A0S = r4     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r15.A0O = r10     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r15.A0K = r8     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            r15.A0N = r7     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
        L_0x0265:
            r3.A02 = r10     // Catch:{ Exception | NoClassDefFoundError -> 0x0268 }
            goto L_0x0273
        L_0x0268:
            r17 = move-exception
            r16 = r15
            goto L_0x0277
        L_0x026c:
            X.4PK r15 = r3.A03(r6, r0)     // Catch:{ Exception | NoClassDefFoundError -> 0x0271 }
            goto L_0x0273
        L_0x0271:
            r17 = move-exception
            goto L_0x0277
        L_0x0273:
            r17 = r16
            r16 = r15
        L_0x0277:
            boolean r4 = r3.A02
            java.lang.String r5 = "N/A"
            if (r8 != 0) goto L_0x028e
            if (r4 == 0) goto L_0x028e
            java.lang.String r4 = "meta.dav1d.av1.decoder"
        L_0x0281:
            r3.A01 = r4
            boolean r4 = r1.A1P
            if (r4 == 0) goto L_0x0394
            if (r18 != 0) goto L_0x0394
            boolean r4 = r3.A02
            if (r4 != 0) goto L_0x0394
            goto L_0x02a9
        L_0x028e:
            java.lang.String r4 = "video/av01"
            java.util.List r8 = r0.Ave(r4, r7, r7)     // Catch:{ 275 -> 0x02a7 }
            if (r8 == 0) goto L_0x02a7
            boolean r4 = r8.isEmpty()
            if (r4 != 0) goto L_0x02a7
            java.lang.Object r4 = r8.get(r7)
            X.2Km r4 = (X.2Km) r4
            if (r4 == 0) goto L_0x02a7
            java.lang.String r4 = r4.A03
            goto L_0x0281
        L_0x02a7:
            r4 = r5
            goto L_0x0281
        L_0x02a9:
            java.lang.String r1 = "video/av01"
            java.util.List r1 = r0.Ave(r1, r7, r7)     // Catch:{ 275 -> 0x02c1 }
            if (r1 == 0) goto L_0x02c1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x02c1
            java.lang.Object r0 = r1.get(r7)
            X.2Km r0 = (X.2Km) r0
            if (r0 == 0) goto L_0x02c1
            java.lang.String r5 = r0.A03
        L_0x02c1:
            java.lang.String r0 = "Expected Dav1d decoder but observing %s"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r5)
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r1)
            throw r0
        L_0x02cd:
            r17 = r16
        L_0x02cf:
            r2.A04()
            boolean r4 = r1.A2o
            if (r4 == 0) goto L_0x0507
            X.5fK r4 = r3.A0E
            if (r4 == 0) goto L_0x0507
            X.5fJ r4 = r3.A0D
            if (r4 == 0) goto L_0x0507
            X.27D r4 = r3.A09
            X.4PH r9 = new X.4PH
            r9.<init>(r4)
            X.1xH r4 = r1.A01
            if (r4 == 0) goto L_0x04d1
            boolean r4 = r4.A0O
            if (r4 == 0) goto L_0x02f3
            X.1yD r4 = r1.A10
            boolean r4 = r4.A0e
            if (r4 != 0) goto L_0x02f9
        L_0x02f3:
            X.1yD r4 = r1.A10
            boolean r4 = r4.A0d
            if (r4 == 0) goto L_0x04d1
        L_0x02f9:
            android.content.Context r4 = r3.A03
            r22 = r4
            X.2SB r12 = r3.A05
            r4 = 0
            X.5Nw r11 = new X.5Nw
            r11.<init>(r9, r12, r4, r10)
            long r4 = r1.A0k
            android.os.Handler r8 = r3.A04
            r19 = r8
            X.4P8 r8 = r3.A0B
            r18 = r8
            boolean r15 = r1.A3O
            boolean r14 = r1.A2h
            X.XZA r13 = new X.XZA
            r13.<init>(r3)
            boolean r10 = r1.A2r
            X.Xye r8 = new X.Xye
            r8.<init>(r6, r3)
            X.XON r16 = new X.XON
            r21 = r16
            r23 = r19
            r24 = r8
            r25 = r9
            r26 = r12
            r27 = r13
            r28 = r11
            r29 = r0
            r30 = r18
            r31 = r4
            r33 = r15
            r34 = r14
            r35 = r10
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r35)
        L_0x033e:
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r10 = r3.A0A
            java.lang.String r9 = ""
            if (r17 == 0) goto L_0x0378
            java.lang.String r4 = r2.A0G
            if (r4 == 0) goto L_0x0349
            r9 = r4
        L_0x0349:
            java.lang.String r11 = "AV1_INSTANTIATION"
            java.lang.Class r4 = r17.getClass()
            java.lang.String r8 = r4.getSimpleName()
            java.lang.String r4 = r17.getMessage()
            java.lang.Object[] r5 = new java.lang.Object[]{r8, r4}
            r4 = 201(0xc9, float:2.82E-43)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            java.lang.String r5 = java.lang.String.format(r4, r5)
            X.4Yy r4 = new X.4Yy
            r4.<init>(r9, r11, r11, r5)
            r10.callback(r4)
            java.lang.String r4 = r17.getMessage()
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r4}
            java.lang.String r5 = "Build AV1 renderer attempt with Dav1d failed with %s: %s"
            goto L_0x039c
        L_0x0378:
            boolean r4 = r2.A02()
            if (r4 == 0) goto L_0x03a1
            java.lang.String r4 = r2.A0G
            if (r4 == 0) goto L_0x0383
            r9 = r4
        L_0x0383:
            java.lang.String r8 = "AV1_INSTANTIATION"
            java.lang.String r5 = "Dav1d Voltron module is not available for AV1 video"
            X.4Yy r4 = new X.4Yy
            r4.<init>(r9, r8, r8, r5)
            r10.callback(r4)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r5 = "Build AV1 renderer attempt with Dav1d failed with voltron module unavailable"
            goto L_0x039c
        L_0x0394:
            if (r16 == 0) goto L_0x02cf
            java.lang.Object[] r8 = new java.lang.Object[]{r16}
            java.lang.String r5 = "Build AV1 renderer attempt with success, impl %s"
        L_0x039c:
            r4 = r20
            X.27B.A01(r4, r5, r8)
        L_0x03a1:
            X.27D r4 = r3.A09
            X.4PH r9 = new X.4PH
            r9.<init>(r4)
            boolean r4 = r6.A0R
            X.1xH r10 = r1.A01
            if (r4 == 0) goto L_0x0463
            if (r10 == 0) goto L_0x0439
            boolean r4 = r10.A0O
            if (r4 == 0) goto L_0x03ba
            X.1yD r4 = r1.A10
            boolean r4 = r4.A0c
            if (r4 != 0) goto L_0x03c0
        L_0x03ba:
            X.1yD r4 = r1.A10
            boolean r4 = r4.A0b
            if (r4 == 0) goto L_0x0439
        L_0x03c0:
            X.5Nv r8 = new X.5Nv
            android.content.Context r13 = r3.A03
            X.2SB r12 = r3.A05
            r4 = 0
            X.5Nw r6 = new X.5Nw
            r6.<init>(r9, r12, r4, r7)
            boolean r5 = r2.A0K
            android.os.Handler r11 = r3.A04
            X.4P8 r4 = r3.A0B
            com.google.android.exoplayer2.audio.DefaultAudioSink r24 = r3.A00()
            r22 = r1
            r23 = r4
            r25 = r6
            r26 = r0
            r27 = r5
            r17 = r8
            r18 = r13
            r19 = r11
            r20 = r9
            r21 = r12
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x03ed:
            boolean r4 = r10.A0R
            r0 = 1
            if (r4 != 0) goto L_0x03f3
        L_0x03f2:
            r0 = 0
        L_0x03f3:
            X.4QI r6 = new X.4QI
            r7 = r48
            r6.<init>(r7, r3, r0)
            android.os.Looper r4 = r11.getLooper()
            X.4QK r0 = new X.4QK
            r0.<init>(r1)
            X.4QM r5 = new X.4QM
            r5.<init>(r4, r0, r6)
            X.4QN r4 = new X.4QN
            r4.<init>(r7, r3)
            if (r10 == 0) goto L_0x042b
            boolean r0 = r10.A0Q
            if (r0 == 0) goto L_0x042b
            android.os.Looper r3 = r11.getLooper()
            X.4QP r1 = X.AnonymousClass4QP.A00
            java.lang.String r0 = r2.A08
            X.4QR r2 = new X.4QR
            r2.<init>(r3, r1, r4, r0)
        L_0x0420:
            X.4PL r8 = (X.AnonymousClass4PL) r8
            X.4PL r2 = (X.AnonymousClass4PL) r2
            r0 = r16
            X.4PL[] r0 = new X.AnonymousClass4PL[]{r0, r8, r5, r2}
            return r0
        L_0x042b:
            android.os.Looper r3 = r11.getLooper()
            X.4QP r1 = X.AnonymousClass4QP.A00
            java.lang.String r0 = r2.A08
            X.5f5 r2 = new X.5f5
            r2.<init>(r3, r1, r4, r0)
            goto L_0x0420
        L_0x0439:
            X.4Po r8 = new X.4Po
            android.content.Context r12 = r3.A03
            X.2SB r7 = r3.A05
            X.4Sp r6 = r3.A00
            boolean r5 = r2.A0K
            android.os.Handler r11 = r3.A04
            X.4P8 r4 = r3.A0B
            com.google.android.exoplayer2.audio.DefaultAudioSink r24 = r3.A00()
            r22 = r1
            r23 = r4
            r25 = r6
            r26 = r0
            r27 = r5
            r17 = r8
            r18 = r12
            r19 = r11
            r20 = r9
            r21 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x04cd
        L_0x0463:
            if (r10 == 0) goto L_0x04a6
            boolean r4 = r10.A0O
            if (r4 == 0) goto L_0x046f
            X.1yD r4 = r1.A10
            boolean r4 = r4.A0c
            if (r4 != 0) goto L_0x0475
        L_0x046f:
            X.1yD r4 = r1.A10
            boolean r4 = r4.A0b
            if (r4 == 0) goto L_0x04a6
        L_0x0475:
            X.4Xp r8 = new X.4Xp
            android.content.Context r14 = r3.A03
            X.2SB r13 = r3.A05
            r4 = 0
            X.5Nw r12 = new X.5Nw
            r12.<init>(r9, r13, r4, r7)
            boolean r6 = r2.A0K
            boolean r5 = r1.A2r
            android.os.Handler r11 = r3.A04
            X.4P8 r4 = r3.A0B
            com.google.android.exoplayer2.audio.DefaultAudioSink r23 = r3.A00()
            r22 = r4
            r24 = r12
            r25 = r0
            r26 = r6
            r27 = r5
            r17 = r8
            r18 = r14
            r19 = r11
            r20 = r9
            r21 = r13
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x03ed
        L_0x04a6:
            X.4Pp r8 = new X.4Pp
            android.content.Context r12 = r3.A03
            X.2SB r7 = r3.A05
            X.4Sp r6 = r3.A00
            boolean r5 = r2.A0K
            android.os.Handler r11 = r3.A04
            X.4P8 r4 = r3.A0B
            com.google.android.exoplayer2.audio.DefaultAudioSink r23 = r3.A00()
            r22 = r4
            r24 = r6
            r25 = r0
            r26 = r5
            r17 = r8
            r18 = r12
            r19 = r11
            r20 = r9
            r21 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x04cd:
            if (r10 == 0) goto L_0x03f2
            goto L_0x03ed
        L_0x04d1:
            android.content.Context r4 = r3.A03
            r18 = r4
            X.2SB r15 = r3.A05
            long r4 = r1.A0k
            android.os.Handler r14 = r3.A04
            X.4P8 r13 = r3.A0B
            boolean r12 = r1.A3O
            boolean r11 = r1.A2h
            X.4Sp r10 = r3.A00
            X.XZB r8 = new X.XZB
            r8.<init>(r3)
            X.XOO r16 = new X.XOO
            r21 = r16
            r22 = r18
            r23 = r14
            r24 = r9
            r25 = r15
            r26 = r8
            r27 = r10
            r28 = r0
            r29 = r13
            r30 = r4
            r32 = r12
            r33 = r11
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r33)
            goto L_0x033e
        L_0x0507:
            X.4PK r16 = r3.A03(r6, r0)
            goto L_0x033e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PG.A05(X.4OI, X.4OS, X.3w6):X.4PL[]");
    }

    public AnonymousClass4PG(Context context, Handler handler, 28T r6, AnonymousClass4OS r7, C264184Ox r8, ServiceEventCallbackImpl serviceEventCallbackImpl, AnonymousClass4PE r10, C290435fJ r11, C290445fK r12, Map map) {
        AnonymousClass2SA r2;
        this.A03 = context;
        this.A0G = map;
        HeroPlayerSetting heroPlayerSetting = r6.A06;
        this.A0F = heroPlayerSetting;
        this.A06 = r6.A05;
        this.A04 = handler;
        this.A0A = serviceEventCallbackImpl;
        this.A09 = new 27D(serviceEventCallbackImpl);
        this.A07 = r7;
        this.A0E = r12;
        this.A0D = r11;
        this.A08 = r8;
        27e.A01 = heroPlayerSetting.A2Q;
        this.A0B = new AnonymousClass4P8(r7, r11, r12, heroPlayerSetting);
        if (heroPlayerSetting.A2j) {
            r2.A09 = heroPlayerSetting.A2F;
            r2.A08 = heroPlayerSetting.A2E;
            r2.A00 = heroPlayerSetting.A0P;
            r2.A01 = heroPlayerSetting.A0Q;
            r2.A0B = heroPlayerSetting.A3T;
            r2.A06 = heroPlayerSetting.A1s;
            r2.A02 = heroPlayerSetting.A0i;
            r2.A0A = heroPlayerSetting.A2N;
            r2.A07 = heroPlayerSetting.A2C;
            r2.A03 = heroPlayerSetting.A10.A04;
            r2.A04 = heroPlayerSetting.A1W;
        } else {
            r2 = new AnonymousClass2SA();
            r2.A06 = heroPlayerSetting.A1s;
            r2.A02 = heroPlayerSetting.A0i;
            r2.A0A = heroPlayerSetting.A2N;
            r2.A07 = heroPlayerSetting.A2C;
            r2.A03 = heroPlayerSetting.A10.A04;
            r2.A0B = heroPlayerSetting.A3T;
        }
        r2.A05 = heroPlayerSetting.A1f;
        this.A05 = new AnonymousClass2SB(r2);
        this.A0C = r10;
    }

    public final boolean A04(C255653uU r9) {
        String A002;
        if (r9.A02()) {
            HeroPlayerSetting heroPlayerSetting = this.A0F;
            String str = "null";
            if (AnonymousClass5OU.A01(heroPlayerSetting.A19, heroPlayerSetting.A2x)) {
                ServiceEventCallbackImpl serviceEventCallbackImpl = this.A0A;
                String str2 = r9.A0G;
                if (str2 != null) {
                    str = str2;
                }
                serviceEventCallbackImpl.callback(new C266454Yy(str, "AV1_INSTANTIATION", "AV1_INSTANTIATION", AnonymousClass5OU.A00(this.A01, true)));
                A002 = AnonymousClass5OU.A00(this.A01, true);
            } else if (!this.A02 && Build.VERSION.SDK_INT < 30) {
                return true;
            } else {
                ServiceEventCallbackImpl serviceEventCallbackImpl2 = this.A0A;
                String str3 = r9.A0G;
                if (str3 != null) {
                    str = str3;
                }
                serviceEventCallbackImpl2.callback(new C266454Yy(str, "AV1_INSTANTIATION", "AV1_INSTANTIATION", AnonymousClass5OU.A00(this.A01, false)));
                A002 = AnonymousClass5OU.A00(this.A01, false);
            }
            27B.A01("HeroExo2InitHelper", A002, new Object[0]);
        }
        return false;
    }
}
