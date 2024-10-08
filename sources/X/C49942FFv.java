package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.FFv  reason: case insensitive filesystem */
public final class C49942FFv {
    public static final C49869FAq A0c = new Object();
    public int A00;
    public View A01;
    public RecyclerView A02;
    public C46831Dm7 A03;
    public FBM A04;
    public C49472EwD A05;
    public String A06;
    public List A07 = 0sn.A00;
    public boolean A08 = true;
    public final Context A09;
    public final FragmentActivity A0A;
    public final UserSession A0B;
    public final 2el A0C;
    public final FZU A0D;
    public final C51927G7v A0E;
    public final AnonymousClass4DU A0F;
    public final 2FW A0G;
    public final String A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final Fragment A0M;
    public final 0hq A0N;
    public final AnonymousClass07i A0O;
    public final C48145EZn A0P;
    public final G9Z A0Q;
    public final C2357330z A0R;
    public final AnonymousClass3W1 A0S;
    public final Long A0T;
    public final Runnable A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;

    private final boolean A01(Object obj) {
        if (this.A0G != 2FW.A1P || !(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        String id = user.getId();
        String str = this.A0B.A06;
        if (!0qQ.A0K(id, str)) {
            if (0qQ.A0K(user.getId(), str)) {
                return false;
            }
            if (AnonymousClass7TF.A1Y(user.A0K(), false) || user.A29()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final List A02() {
        Object Aqc = this.A0E.Aqc();
        if (Aqc == null) {
            return 0sn.A00;
        }
        return A00(this, Aqc);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r6v47, types: [X.EJw] */
    /* JADX WARNING: type inference failed for: r4v158 */
    /* JADX WARNING: type inference failed for: r6v48, types: [X.EJx] */
    /* JADX WARNING: type inference failed for: r24v18, types: [X.EK5] */
    /* JADX WARNING: type inference failed for: r4v159 */
    /* JADX WARNING: type inference failed for: r5v40, types: [X.EK6] */
    /* JADX WARNING: type inference failed for: r24v19, types: [X.EK1] */
    /* JADX WARNING: type inference failed for: r24v20, types: [X.EJz] */
    /* JADX WARNING: type inference failed for: r24v21, types: [X.EK5] */
    /* JADX WARNING: type inference failed for: r4v160 */
    /* JADX WARNING: type inference failed for: r24v22, types: [X.EK0] */
    /* JADX WARNING: type inference failed for: r24v23, types: [X.EK3] */
    /* JADX WARNING: type inference failed for: r24v24, types: [X.EK5] */
    /* JADX WARNING: type inference failed for: r24v25, types: [X.EK5] */
    /* JADX WARNING: type inference failed for: r4v161 */
    /* JADX WARNING: type inference failed for: r8v25, types: [X.EJy] */
    /* JADX WARNING: type inference failed for: r24v26, types: [X.EK5] */
    /* JADX WARNING: type inference failed for: r24v27, types: [X.EK2] */
    /* JADX WARNING: type inference failed for: r24v28, types: [X.EK5] */
    /* JADX WARNING: type inference failed for: r24v29, types: [X.EK0] */
    /* JADX WARNING: type inference failed for: r4v162 */
    /* JADX WARNING: type inference failed for: r24v30, types: [X.EJq] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x072d, code lost:
        r23.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x07e2, code lost:
        r23.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0245, code lost:
        r23.add(r9);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A00(X.C49942FFv r43, java.lang.Object r44) {
        /*
            java.util.ArrayList r23 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r0 = X.FF0.A07
            r0 = r43
            com.instagram.common.session.UserSession r2 = r0.A0B
            android.content.Context r1 = r0.A09
            r43 = r1
            android.content.Context r4 = X.DbT.A05(r43)
            r22 = 1
            X.Phg r3 = new X.Phg
            r1 = r22
            r3.<init>(r1, r4, r2)
            java.lang.Class<X.FF0> r1 = X.FF0.class
            java.lang.Object r4 = r2.A01(r1, r3)
            X.FF0 r4 = (X.FF0) r4
            X.2FW r3 = r0.A0G
            boolean r1 = r0.A0Z
            r42 = r1
            java.util.ArrayList r18 = r4.A01(r3, r1)
            X.OC6 r8 = X.C70166NyK.A00(r2)
            r20 = 0
            java.lang.String r21 = ", "
            java.lang.String r19 = ""
            r7 = r21
            r6 = r19
            r4 = r18
            r1 = r20
            java.lang.String r6 = X.00k.A0P(r7, r6, r6, r4, r1)
            X.02m r5 = r8.A00
            r17 = 145754014(0x8b0079e, float:1.05944055E-33)
            java.lang.String r4 = "initial_ranking"
            r1 = r17
            r5.markerAnnotate(r1, r4, r6)
            java.util.Iterator r16 = r18.iterator()
        L_0x0053:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x07e9
            java.lang.String r5 = X.AnonymousClass7TE.A18(r16)
            int r4 = r5.hashCode()
            r6 = 0
            r1 = r44
            switch(r4) {
                case -2133928234: goto L_0x078f;
                case -1628054559: goto L_0x0777;
                case -1499838031: goto L_0x0734;
                case -1436108013: goto L_0x06e1;
                case -1273433329: goto L_0x06a6;
                case -1268958287: goto L_0x065b;
                case -1240898147: goto L_0x0616;
                case -1209041162: goto L_0x05c4;
                case -1183699191: goto L_0x0546;
                case -916346253: goto L_0x0573;
                case -401297215: goto L_0x0512;
                case -266143003: goto L_0x04cb;
                case 3016245: goto L_0x0481;
                case 3321844: goto L_0x0435;
                case 3522941: goto L_0x03da;
                case 164757360: goto L_0x0401;
                case 284397090: goto L_0x038c;
                case 389639919: goto L_0x0347;
                case 486515695: goto L_0x02fb;
                case 497130182: goto L_0x00ba;
                case 1505434244: goto L_0x024c;
                case 1534364196: goto L_0x02af;
                case 1539093419: goto L_0x0180;
                case 1671380268: goto L_0x0134;
                case 1687614991: goto L_0x010e;
                case 1898136107: goto L_0x0104;
                case 1934780818: goto L_0x0068;
                default: goto L_0x0067;
            }
        L_0x0067:
            goto L_0x0053
        L_0x0068:
            java.lang.String r4 = "whatsapp"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            X.4DU r14 = r0.A0F
            X.3W1 r13 = r0.A0S
            androidx.fragment.app.FragmentActivity r12 = r0.A0A
            X.0hq r11 = r0.A0N
            X.07i r10 = r0.A0O
            java.lang.Runnable r9 = r0.A0U
            X.EZn r8 = r0.A0P
            java.lang.String r7 = r0.A0X
            java.lang.String r6 = r0.A0Y
            java.lang.String r5 = r0.A0W
            r4 = 9
            X.0qQ.A0B(r10, r4)
            X.EWV r34 = X.EWV.A0N
            r40 = 2131237902(0x7f081c0e, float:1.8092068E38)
            r41 = 2131960059(0x7f1320fb, float:1.9556776E38)
            X.EJo r4 = new X.EJo
            r28 = r10
            r29 = r8
            r30 = r2
            r31 = r14
            r32 = r13
            r33 = r3
            r35 = r1
            r36 = r9
            r37 = r7
            r38 = r6
            r39 = r5
            r24 = r4
            r25 = r43
            r26 = r12
            r27 = r11
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r1 = r23
            r1.add(r4)
            goto L_0x0053
        L_0x00ba:
            java.lang.String r4 = "facebook"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            boolean r4 = r1 instanceof X.1Xj
            if (r4 == 0) goto L_0x00c9
            r6 = r1
            X.1Xj r6 = (X.1Xj) r6
        L_0x00c9:
            boolean r4 = X.C246353eS.A09(r2, r6)
            if (r4 != 0) goto L_0x0053
            X.EJq r6 = new X.EJq
            X.4DU r13 = r0.A0F
            X.3W1 r12 = r0.A0S
            androidx.fragment.app.FragmentActivity r11 = r0.A0A
            X.0hq r10 = r0.A0N
            X.07i r9 = r0.A0O
            java.lang.Runnable r8 = r0.A0U
            java.lang.String r7 = r0.A0X
            java.lang.String r5 = r0.A0Y
            java.lang.String r4 = r0.A0W
            r28 = r9
            r29 = r2
            r30 = r13
            r31 = r12
            r32 = r3
            r33 = r1
            r34 = r8
            r35 = r7
            r36 = r5
            r37 = r4
            r24 = r6
            r25 = r43
            r26 = r11
            r27 = r10
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x05bd
        L_0x0104:
            java.lang.String r4 = "system_share_sheet_share_to"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0351
            goto L_0x0053
        L_0x010e:
            java.lang.String r4 = "view_profile"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            X.2FW r4 = X.2FW.A1P
            if (r3 != r4) goto L_0x0053
            boolean r4 = r1 instanceof com.instagram.user.model.User
            if (r4 == 0) goto L_0x0053
            X.0Tu r6 = X.0Tu.A05
            r4 = 36327426095528363(0x810f9a000739ab, double:3.036948769391314E-306)
            boolean r4 = X.182.A06(r6, r2, r4)
            if (r4 == 0) goto L_0x0053
            androidx.fragment.app.FragmentActivity r5 = r0.A0A
            X.EJu r4 = new X.EJu
            r4.<init>(r5, r3, r1)
            goto L_0x07e2
        L_0x0134:
            java.lang.String r4 = "discord"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            X.4DU r13 = r0.A0F
            X.3W1 r12 = r0.A0S
            androidx.fragment.app.FragmentActivity r11 = r0.A0A
            X.0hq r10 = r0.A0N
            X.07i r8 = r0.A0O
            java.lang.Runnable r7 = r0.A0U
            java.lang.String r6 = r0.A0X
            java.lang.String r5 = r0.A0Y
            java.lang.String r4 = r0.A0W
            r9 = 9
            X.0qQ.A0B(r8, r9)
            X.EWV r34 = X.EWV.A0D
            r40 = 2131237874(0x7f081bf2, float:1.809201E38)
            r41 = 2131960044(0x7f1320ec, float:1.9556746E38)
            X.EJi r9 = new X.EJi
            r28 = r8
            r29 = r20
            r30 = r2
            r31 = r13
            r32 = r12
            r33 = r3
            r35 = r1
            r36 = r7
            r37 = r6
            r38 = r5
            r39 = r4
            r24 = r9
            r25 = r43
            r26 = r11
            r27 = r10
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            goto L_0x0245
        L_0x0180:
            java.lang.String r4 = "barcelona"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            X.G7v r4 = r0.A0E
            boolean r4 = r4.CWy()
            if (r4 == 0) goto L_0x0053
            X.0Tu r8 = X.0Tu.A05
            r4 = 36602278232265325(0x8209940001126d, double:3.21076636740449E-306)
            int r7 = X.DbS.A04(r8, r2, r4)
            int r7 = r7 - r22
            X.2FW r6 = X.2FW.A1P
            if (r3 == r6) goto L_0x0203
            if (r7 < 0) goto L_0x0203
            int r6 = r23.size()
            if (r7 >= r6) goto L_0x0203
            r6 = 36321950011893607(0x810a9f00022767, double:3.0334856720502757E-306)
            boolean r6 = X.182.A06(r8, r2, r6)
            if (r6 != 0) goto L_0x0203
            int r4 = X.DbS.A04(r8, r2, r4)
            int r12 = r4 + -1
            X.4DU r14 = r0.A0F
            X.3W1 r13 = r0.A0S
            androidx.fragment.app.FragmentActivity r11 = r0.A0A
            X.0hq r10 = r0.A0N
            X.07i r9 = r0.A0O
            java.lang.Runnable r8 = r0.A0U
            java.lang.String r7 = r0.A0X
            java.lang.String r6 = r0.A0Y
            java.lang.String r5 = r0.A0W
            r4 = 9
            X.0qQ.A0B(r9, r4)
            X.EWV r34 = X.EWV.A0B
            r40 = 2131237898(0x7f081c0a, float:1.809206E38)
            r41 = 2131960058(0x7f1320fa, float:1.9556774E38)
            X.EJn r4 = new X.EJn
            r28 = r9
            r29 = r20
            r30 = r2
            r31 = r14
            r32 = r13
            r33 = r3
            r35 = r1
            r36 = r8
            r37 = r7
            r38 = r6
            r39 = r5
            r24 = r4
            r25 = r43
            r26 = r11
            r27 = r10
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r1 = r23
            r1.add(r12, r4)
            goto L_0x0053
        L_0x0203:
            X.4DU r13 = r0.A0F
            X.3W1 r12 = r0.A0S
            androidx.fragment.app.FragmentActivity r11 = r0.A0A
            X.0hq r10 = r0.A0N
            X.07i r8 = r0.A0O
            java.lang.Runnable r7 = r0.A0U
            java.lang.String r6 = r0.A0X
            java.lang.String r5 = r0.A0Y
            java.lang.String r4 = r0.A0W
            r9 = 9
            X.0qQ.A0B(r8, r9)
            X.EWV r34 = X.EWV.A0B
            r40 = 2131237898(0x7f081c0a, float:1.809206E38)
            r41 = 2131960058(0x7f1320fa, float:1.9556774E38)
            X.EJn r9 = new X.EJn
            r28 = r8
            r29 = r20
            r30 = r2
            r31 = r13
            r32 = r12
            r33 = r3
            r35 = r1
            r36 = r7
            r37 = r6
            r38 = r5
            r39 = r4
            r24 = r9
            r25 = r43
            r26 = r11
            r27 = r10
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
        L_0x0245:
            r1 = r23
            r1.add(r9)
            goto L_0x0053
        L_0x024c:
            java.lang.String r4 = "copy_link"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            X.2FW r4 = X.2FW.A1O
            if (r3 != r4) goto L_0x0267
            X.0Tu r6 = X.0Tu.A05
            r4 = 36314859024485214(0x81042c00390b5e, double:3.0290013030600935E-306)
            boolean r4 = X.182.A06(r6, r2, r4)
            if (r4 == 0) goto L_0x0267
            goto L_0x0053
        L_0x0267:
            X.4DU r15 = r0.A0F
            X.3W1 r14 = r0.A0S
            androidx.fragment.app.Fragment r13 = r0.A0M
            androidx.fragment.app.FragmentActivity r12 = r0.A0A
            X.0hq r11 = r0.A0N
            X.07i r10 = r0.A0O
            java.lang.Runnable r9 = r0.A0U
            X.EZn r8 = r0.A0P
            java.lang.String r7 = r0.A0X
            java.lang.String r6 = r0.A0Y
            java.lang.String r5 = r0.A0W
            int r4 = r23.size()
            java.lang.Long r34 = X.DbS.A0j(r4)
            X.EK4 r4 = new X.EK4
            r26 = r12
            r27 = r11
            r28 = r10
            r29 = r8
            r30 = r2
            r31 = r15
            r32 = r14
            r33 = r3
            r35 = r1
            r36 = r9
            r37 = r7
            r38 = r6
            r39 = r5
            r24 = r4
            r25 = r13
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r1 = r23
            r1.add(r4)
            goto L_0x0053
        L_0x02af:
            java.lang.String r10 = "clips_download"
            boolean r4 = r5.equals(r10)
            if (r4 == 0) goto L_0x0053
            boolean r4 = r1 instanceof X.1Xj
            if (r4 == 0) goto L_0x02be
            r6 = r1
            X.1Xj r6 = (X.1Xj) r6
        L_0x02be:
            X.LTW r4 = X.LTW.A00
            boolean r4 = r4.A0B(r2, r6)
            if (r4 == 0) goto L_0x0053
            r4 = r22
            boolean r4 = X.LTW.A08(r2, r4)
            if (r4 == 0) goto L_0x0053
            X.4DU r9 = r0.A0F
            X.G9Z r8 = r0.A0Q
            java.lang.String r7 = r0.A0X
            java.lang.String r6 = r0.A0Y
            java.lang.String r5 = r0.A0W
            int r4 = r23.size()
            java.lang.Long r29 = X.DbS.A0j(r4)
            X.EK0 r4 = new X.EK0
            r25 = r2
            r26 = r8
            r27 = r9
            r28 = r3
            r30 = r1
            r31 = r7
            r32 = r6
            r33 = r5
            r34 = r10
            r24 = r4
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x07e2
        L_0x02fb:
            java.lang.String r4 = "kakaotalk"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            X.4DU r13 = r0.A0F
            X.3W1 r12 = r0.A0S
            androidx.fragment.app.FragmentActivity r11 = r0.A0A
            X.0hq r10 = r0.A0N
            X.07i r9 = r0.A0O
            java.lang.Runnable r8 = r0.A0U
            java.lang.String r7 = r0.A0X
            java.lang.String r6 = r0.A0Y
            java.lang.String r4 = r0.A0W
            r5 = 9
            X.0qQ.A0B(r9, r5)
            X.EWV r34 = X.EWV.A0F
            r40 = 2131237885(0x7f081bfd, float:1.8092033E38)
            r41 = 2131960046(0x7f1320ee, float:1.955675E38)
            X.EJj r5 = new X.EJj
            r28 = r9
            r29 = r20
            r30 = r2
            r31 = r13
            r32 = r12
            r33 = r3
            r35 = r1
            r36 = r8
            r37 = r7
            r38 = r6
            r39 = r4
            r24 = r5
            r25 = r43
            r26 = r11
            r27 = r10
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            goto L_0x072d
        L_0x0347:
            java.lang.String r4 = "system_share_sheet"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0351
            goto L_0x0053
        L_0x0351:
            X.EK2 r6 = new X.EK2
            X.3W1 r15 = r0.A0S
            androidx.fragment.app.Fragment r14 = r0.A0M
            androidx.fragment.app.FragmentActivity r13 = r0.A0A
            X.0hq r12 = r0.A0N
            X.07i r11 = r0.A0O
            X.4DU r10 = r0.A0F
            java.lang.Runnable r9 = r0.A0U
            X.EZn r8 = r0.A0P
            java.lang.String r7 = r0.A0X
            java.lang.String r5 = r0.A0Y
            java.lang.String r4 = r0.A0W
            r24 = r6
            r25 = r14
            r26 = r13
            r27 = r12
            r28 = r11
            r29 = r8
            r30 = r2
            r31 = r10
            r32 = r15
            r33 = r3
            r34 = r1
            r35 = r9
            r36 = r7
            r37 = r5
            r38 = r4
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            goto L_0x05bd
        L_0x038c:
            java.lang.String r4 = "snapchat"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            X.EJm r6 = new X.EJm
            X.4DU r14 = r0.A0F
            X.3W1 r13 = r0.A0S
            androidx.fragment.app.FragmentActivity r12 = r0.A0A
            X.0hq r11 = r0.A0N
            X.07i r10 = r0.A0O
            java.lang.Runnable r9 = r0.A0U
            X.EZn r8 = r0.A0P
            java.lang.String r7 = r0.A0X
            java.lang.String r5 = r0.A0Y
            java.lang.String r4 = r0.A0W
            r15 = 9
            X.0qQ.A0B(r10, r15)
            X.EWV r34 = X.EWV.A0L
            r40 = 2131238806(0x7f081f96, float:1.8093901E38)
            r41 = 2131960054(0x7f1320f6, float:1.9556766E38)
            r28 = r10
            r29 = r8
            r30 = r2
            r31 = r14
            r32 = r13
            r33 = r3
            r35 = r1
            r36 = r9
            r37 = r7
            r38 = r5
            r39 = r4
            r24 = r6
            r25 = r43
            r26 = r12
            r27 = r11
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            goto L_0x05bd
        L_0x03da:
            java.lang.String r4 = "save"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            boolean r4 = r1 instanceof X.C255773uh
            if (r4 == 0) goto L_0x03ea
            boolean r4 = r1 instanceof com.instagram.direct.groupinvites.models.InviteLinkShareInfo
            if (r4 != 0) goto L_0x0053
        L_0x03ea:
            X.30z r7 = r0.A0R
            X.3W1 r6 = r0.A0S
            X.G9Z r5 = r0.A0Q
            boolean r14 = X.I56.A03(r2)
            X.EJy r4 = new X.EJy
            r8 = r4
            r9 = r5
            r10 = r7
            r11 = r6
            r12 = r3
            r13 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            goto L_0x07e2
        L_0x0401:
            java.lang.String r4 = "add_to_wall"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            X.2FW r4 = X.2FW.A0W
            if (r3 == r4) goto L_0x0411
            X.2FW r4 = X.2FW.A1D
            if (r3 != r4) goto L_0x0053
        L_0x0411:
            X.C65001Zz.A00()
            X.0Tu r6 = X.0Tu.A05
            r4 = 36322353738688598(0x810afd00002856, double:3.033740990501105E-306)
            boolean r4 = X.182.A06(r6, r2, r4)
            if (r4 == 0) goto L_0x0053
            r4 = 36322353739081820(0x810afd0006285c, double:3.0337409907497805E-306)
            boolean r4 = X.182.A06(r6, r2, r4)
            if (r4 == 0) goto L_0x0053
            X.G9Z r5 = r0.A0Q
            X.EJr r4 = new X.EJr
            r4.<init>(r5, r3, r1)
            goto L_0x07e2
        L_0x0435:
            java.lang.String r4 = "line"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            X.EJk r6 = new X.EJk
            X.4DU r13 = r0.A0F
            X.3W1 r12 = r0.A0S
            androidx.fragment.app.FragmentActivity r11 = r0.A0A
            X.0hq r10 = r0.A0N
            X.07i r9 = r0.A0O
            java.lang.Runnable r8 = r0.A0U
            java.lang.String r7 = r0.A0X
            java.lang.String r5 = r0.A0Y
            java.lang.String r4 = r0.A0W
            r14 = 9
            X.0qQ.A0B(r9, r14)
            X.EWV r34 = X.EWV.A0G
            r40 = 2131237887(0x7f081bff, float:1.8092037E38)
            r41 = 2131960047(0x7f1320ef, float:1.9556752E38)
            r28 = r9
            r29 = r20
            r30 = r2
            r31 = r13
            r32 = r12
            r33 = r3
            r35 = r1
            r36 = r8
            r37 = r7
            r38 = r5
            r39 = r4
            r24 = r6
            r25 = r43
            r26 = r11
            r27 = r10
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            goto L_0x05bd
        L_0x0481:
            java.lang.String r4 = "band"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            X.4DU r12 = r0.A0F
            X.3W1 r11 = r0.A0S
            androidx.fragment.app.FragmentActivity r10 = r0.A0A
            X.0hq r9 = r0.A0N
            X.07i r8 = r0.A0O
            java.lang.Runnable r7 = r0.A0U
            java.lang.String r6 = r0.A0X
            java.lang.String r4 = r0.A0Y
            r5 = 9
            X.0qQ.A0B(r8, r5)
            X.EWV r34 = X.EWV.A0A
            r40 = 2131237873(0x7f081bf1, float:1.8092009E38)
            r41 = 2131960042(0x7f1320ea, float:1.9556741E38)
            X.EJh r5 = new X.EJh
            r28 = r8
            r29 = r20
            r30 = r2
            r31 = r12
            r32 = r11
            r33 = r3
            r35 = r1
            r36 = r7
            r37 = r6
            r38 = r4
            r39 = r20
            r24 = r5
            r25 = r43
            r26 = r10
            r27 = r9
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            goto L_0x072d
        L_0x04cb:
            java.lang.String r4 = "user_sms"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            X.EK3 r5 = new X.EK3
            X.4DU r14 = r0.A0F
            X.3W1 r13 = r0.A0S
            androidx.fragment.app.FragmentActivity r12 = r0.A0A
            X.0hq r11 = r0.A0N
            X.07i r10 = r0.A0O
            java.lang.Runnable r9 = r0.A0U
            X.EZn r8 = r0.A0P
            java.lang.String r7 = r0.A0X
            java.lang.String r6 = r0.A0Y
            java.lang.String r4 = r0.A0W
            int r15 = r23.size()
            java.lang.Long r33 = X.DbS.A0j(r15)
            r24 = r5
            r25 = r12
            r26 = r11
            r27 = r10
            r28 = r8
            r29 = r2
            r30 = r14
            r31 = r13
            r32 = r3
            r34 = r1
            r35 = r9
            r36 = r7
            r37 = r6
            r38 = r4
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            goto L_0x072d
        L_0x0512:
            java.lang.String r10 = "profile_card_download"
            boolean r4 = r5.equals(r10)
            if (r4 == 0) goto L_0x0053
            boolean r4 = r0.A01(r1)
            if (r4 == 0) goto L_0x0053
            X.4DU r9 = r0.A0F
            X.G9Z r8 = r0.A0Q
            java.lang.String r7 = r0.A0X
            java.lang.String r5 = r0.A0Y
            java.lang.String r4 = r0.A0W
            X.EK0 r6 = new X.EK0
            r24 = r6
            r25 = r2
            r26 = r8
            r27 = r9
            r28 = r3
            r29 = r20
            r30 = r1
            r31 = r7
            r32 = r5
            r33 = r4
            r34 = r10
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x05bd
        L_0x0546:
            java.lang.String r4 = "invite"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            X.2FW r4 = X.2FW.A1P
            if (r3 != r4) goto L_0x0053
            boolean r4 = r1 instanceof com.instagram.user.model.User
            if (r4 == 0) goto L_0x0053
            java.lang.String r5 = X.DbS.A0q(r1)
            java.lang.String r4 = r2.A06
            boolean r4 = X.0qQ.A0K(r5, r4)
            if (r4 == 0) goto L_0x0053
            r4 = r43
            boolean r4 = X.C267044ar.A01(r4, r2)
            if (r4 == 0) goto L_0x0053
            X.G9Z r5 = r0.A0Q
            X.EJs r4 = new X.EJs
            r4.<init>(r5, r3, r1)
            goto L_0x07e2
        L_0x0573:
            java.lang.String r4 = "twitter"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            X.EJp r6 = new X.EJp
            X.4DU r13 = r0.A0F
            X.3W1 r12 = r0.A0S
            androidx.fragment.app.FragmentActivity r11 = r0.A0A
            X.0hq r10 = r0.A0N
            X.07i r9 = r0.A0O
            java.lang.Runnable r8 = r0.A0U
            java.lang.String r7 = r0.A0X
            java.lang.String r5 = r0.A0Y
            java.lang.String r4 = r0.A0W
            r14 = 9
            X.0qQ.A0B(r9, r14)
            X.EWV r34 = X.EWV.A0O
            r40 = 2131237903(0x7f081c0f, float:1.809207E38)
            r41 = 2131960060(0x7f1320fc, float:1.9556778E38)
            r28 = r9
            r29 = r20
            r30 = r2
            r31 = r13
            r32 = r12
            r33 = r3
            r35 = r1
            r36 = r8
            r37 = r7
            r38 = r5
            r39 = r4
            r24 = r6
            r25 = r43
            r26 = r11
            r27 = r10
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
        L_0x05bd:
            r1 = r23
            r1.add(r6)
            goto L_0x0053
        L_0x05c4:
            java.lang.String r4 = "direct_sharesheet"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            X.2FW r4 = X.2FW.A1P
            if (r3 != r4) goto L_0x0053
            boolean r4 = r1 instanceof com.instagram.user.model.User
            if (r4 == 0) goto L_0x0053
            java.lang.String r4 = r2.A06
            r8 = r1
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            boolean r1 = X.DbV.A1Z(r8, r4)
            if (r1 == 0) goto L_0x05f2
            boolean r1 = X.DbV.A1Z(r8, r4)
            if (r1 == 0) goto L_0x0053
            X.0Tu r1 = X.0Tu.A05
            r4 = 36327426095462826(0x810f9a000639aa, double:3.0369487693498684E-306)
            boolean r1 = X.182.A06(r1, r2, r4)
            if (r1 == 0) goto L_0x0053
        L_0x05f2:
            androidx.fragment.app.FragmentActivity r7 = r0.A0A
            X.4DU r6 = r0.A0F
            java.lang.String r5 = r0.A06
            X.Eto r1 = new X.Eto
            r1.<init>(r0)
            X.EJz r4 = new X.EJz
            r24 = r4
            r25 = r7
            r26 = r2
            r27 = r1
            r28 = r6
            r29 = r3
            r30 = r8
            r31 = r5
            r32 = r42
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x07e2
        L_0x0616:
            java.lang.String r4 = "add_to_channel"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            boolean r4 = r0.A08
            if (r4 == 0) goto L_0x0053
            boolean r4 = r1 instanceof X.1Xj
            if (r4 != 0) goto L_0x062a
            boolean r4 = r1 instanceof X.C255773uh
            if (r4 == 0) goto L_0x0053
        L_0x062a:
            X.4DU r12 = r0.A0F
            X.3W1 r11 = r0.A0S
            androidx.fragment.app.Fragment r10 = r0.A0M
            androidx.fragment.app.FragmentActivity r9 = r0.A0A
            X.0hq r8 = r0.A0N
            X.07i r7 = r0.A0O
            java.lang.Runnable r6 = r0.A0U
            X.G9Z r5 = r0.A0Q
            X.EK1 r4 = new X.EK1
            r25 = r43
            r26 = r10
            r27 = r9
            r28 = r8
            r29 = r7
            r30 = r2
            r31 = r5
            r32 = r12
            r33 = r11
            r34 = r3
            r35 = r1
            r36 = r6
            r24 = r4
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x07e2
        L_0x065b:
            java.lang.String r4 = "follow"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            X.2FW r4 = X.2FW.A1P
            if (r3 != r4) goto L_0x0053
            boolean r4 = r1 instanceof com.instagram.user.model.User
            if (r4 == 0) goto L_0x0053
            java.lang.String r4 = r2.A06
            r5 = r1
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            boolean r1 = X.DbV.A1Z(r5, r4)
            if (r1 != 0) goto L_0x0053
            r6 = 4
            com.instagram.user.model.FollowStatus r1 = r5.B6o()
            int r4 = r1.ordinal()
            if (r4 == r6) goto L_0x069f
            r1 = 5
            r10 = 2131238959(0x7f08202f, float:1.8094211E38)
            if (r4 == r1) goto L_0x068a
            r10 = 2131238947(0x7f082023, float:1.8094187E38)
        L_0x068a:
            r11 = 2131960317(0x7f1321fd, float:1.95573E38)
            if (r4 == r1) goto L_0x0692
            r11 = 2131960313(0x7f1321f9, float:1.9557291E38)
        L_0x0692:
            X.EK6 r4 = new X.EK6
            r6 = r43
            r7 = r2
            r8 = r3
            r9 = r5
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x07e2
        L_0x069f:
            r10 = 2131238950(0x7f082026, float:1.8094193E38)
            r11 = 2131960314(0x7f1321fa, float:1.9557293E38)
            goto L_0x0692
        L_0x06a6:
            java.lang.String r4 = "add_to_your_story"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            int r4 = r0.A00
            if (r4 == 0) goto L_0x0053
            X.G7v r4 = r0.A0E
            boolean r4 = r4.CX1()
            if (r4 == 0) goto L_0x0053
            boolean r4 = r1 instanceof X.C255773uh
            if (r4 != 0) goto L_0x0053
            boolean r6 = r0.A0a
            boolean r7 = r0.A0b
            X.0Tu r4 = X.0Tu.A05
            boolean r5 = X.DbW.A1T(r4, r2)
            r4 = r7 ^ 1
            boolean r4 = X.FGK.A02(r2, r6, r5, r4)
            if (r4 == 0) goto L_0x06d6
            boolean r4 = r0.A01(r1)
            if (r4 == 0) goto L_0x0053
        L_0x06d6:
            X.G9Z r6 = r0.A0Q
            int r5 = r0.A00
            X.EJv r4 = new X.EJv
            r4.<init>(r6, r3, r1, r5)
            goto L_0x07e2
        L_0x06e1:
            java.lang.String r4 = "messenger"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            X.EJl r5 = new X.EJl
            X.4DU r14 = r0.A0F
            X.3W1 r13 = r0.A0S
            androidx.fragment.app.FragmentActivity r12 = r0.A0A
            X.0hq r11 = r0.A0N
            X.07i r10 = r0.A0O
            java.lang.Runnable r9 = r0.A0U
            X.EZn r8 = r0.A0P
            java.lang.String r7 = r0.A0X
            java.lang.String r6 = r0.A0Y
            java.lang.String r4 = r0.A0W
            r15 = 9
            X.0qQ.A0B(r10, r15)
            X.EWV r34 = X.EWV.A0H
            r40 = 2131237893(0x7f081c05, float:1.809205E38)
            r41 = 2131960048(0x7f1320f0, float:1.9556754E38)
            r28 = r10
            r29 = r8
            r30 = r2
            r31 = r14
            r32 = r13
            r33 = r3
            r35 = r1
            r36 = r9
            r37 = r7
            r38 = r6
            r39 = r4
            r24 = r5
            r25 = r43
            r26 = r12
            r27 = r11
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
        L_0x072d:
            r1 = r23
            r1.add(r5)
            goto L_0x0053
        L_0x0734:
            java.lang.String r4 = "direct_message"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            X.2FW r4 = X.2FW.A1P
            if (r3 != r4) goto L_0x0053
            boolean r4 = r1 instanceof com.instagram.user.model.User
            if (r4 == 0) goto L_0x0053
            java.lang.String r4 = r2.A06
            r6 = r1
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            boolean r1 = X.DbV.A1Z(r6, r4)
            if (r1 != 0) goto L_0x0053
            java.lang.Boolean r4 = r6.A0K()
            r1 = r22
            boolean r1 = X.AnonymousClass7TF.A1Y(r4, r1)
            if (r1 == 0) goto L_0x0763
            boolean r1 = r6.A29()
            if (r1 != 0) goto L_0x0763
            goto L_0x0053
        L_0x0763:
            androidx.fragment.app.FragmentActivity r7 = r0.A0A
            androidx.fragment.app.Fragment r5 = r0.A0M
            X.4DU r1 = r0.A0F
            X.EJx r4 = new X.EJx
            r8 = r43
            r9 = r5
            r10 = r2
            r11 = r1
            r12 = r3
            r13 = r6
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x07e2
        L_0x0777:
            java.lang.String r4 = "add_to_audio_note"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            X.2FW r4 = X.2FW.A1S
            if (r3 != r4) goto L_0x0053
            boolean r4 = r0.A0L
            if (r4 != 0) goto L_0x0053
            X.G9Z r5 = r0.A0Q
            X.EJt r4 = new X.EJt
            r4.<init>(r5, r3, r1)
            goto L_0x07e2
        L_0x078f:
            java.lang.String r4 = "add_content_note"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0053
            boolean r4 = r1 instanceof X.1Xj
            if (r4 == 0) goto L_0x0053
            r6 = r1
            X.1Xj r6 = (X.1Xj) r6
            if (r6 == 0) goto L_0x0053
            X.3de r5 = new X.3de
            r4 = r20
            r5.<init>(r6, r4)
            X.2FW r4 = X.2FW.A0W
            if (r3 == r4) goto L_0x07af
            X.2FW r4 = X.2FW.A1D
            if (r3 != r4) goto L_0x0053
        L_0x07af:
            boolean r4 = X.C245953dk.A00(r2, r5)
            if (r4 == 0) goto L_0x0053
            X.FGK r5 = X.FGK.A00
            boolean r4 = r5.A04(r2)
            if (r4 == 0) goto L_0x0053
            boolean r4 = r5.A05(r2)
            if (r4 == 0) goto L_0x07cb
            com.instagram.common.typedurl.ImageUrl r7 = r6.A1Q()
            if (r7 != 0) goto L_0x07cf
            goto L_0x0053
        L_0x07cb:
            com.instagram.common.typedurl.ImageUrl r7 = X.DbX.A0X(r2)
        L_0x07cf:
            X.G9Z r5 = r0.A0Q
            boolean r4 = r6.CeS()
            boolean r11 = X.AnonymousClass7TF.A1P(r4)
            X.EJw r4 = new X.EJw
            r8 = r5
            r9 = r3
            r10 = r1
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x07e2:
            r1 = r23
            r1.add(r4)
            goto L_0x0053
        L_0x07e9:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r23.iterator()
        L_0x07f1:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x080e
            java.lang.Object r3 = r4.next()
            X.FBq r3 = (X.C49890FBq) r3
            java.lang.String r1 = r3.A08
            X.0qQ.A07(r1)
            r5.add(r1)
            java.lang.String r1 = r0.A0V
            r3.A03 = r1
            java.lang.Long r1 = r0.A0T
            r3.A01 = r1
            goto L_0x07f1
        L_0x080e:
            X.OC6 r6 = X.C70166NyK.A00(r2)
            r4 = r21
            r3 = r19
            r0 = r20
            java.lang.String r4 = X.00k.A0P(r4, r3, r3, r5, r0)
            X.02m r3 = r6.A00
            java.lang.String r1 = "final_ranking"
            r0 = r17
            r3.markerAnnotate(r0, r1, r4)
            java.util.Set r5 = X.00k.A0k(r5)
            java.util.Iterator r4 = r18.iterator()
        L_0x082d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0853
            java.lang.String r1 = X.AnonymousClass7TE.A18(r4)
            boolean r0 = r5.contains(r1)
            if (r0 != 0) goto L_0x082d
            java.lang.String r0 = "HSCROLL_HIDE_"
            java.lang.String r0 = X.002.A0R(r0, r1)
            java.lang.String r3 = X.AnonymousClass7TF.A0k(r0)
            X.OC6 r0 = X.C70166NyK.A00(r2)
            X.02m r1 = r0.A00
            r0 = r17
            r1.markerPoint(r0, r3)
            goto L_0x082d
        L_0x0853:
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49942FFv.A00(X.FFv, java.lang.Object):java.util.ArrayList");
    }

    public C49942FFv(Context context, Fragment fragment, FragmentActivity fragmentActivity, 0hq r10, AnonymousClass07i r11, C48145EZn eZn, UserSession userSession, 2el r14, G9Z g9z, C51927G7v g7v, C2357330z r17, AnonymousClass4DU r18, AnonymousClass3W1 r19, 2FW r20, Long l, Runnable runnable, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        0qQ.A0B(context, 1);
        AnonymousClass4DU r2 = r18;
        AnonymousClass7TG.A0w(2, userSession, r2, fragmentActivity);
        AnonymousClass7TF.A1G(r10, 7, r14);
        2FW r3 = r20;
        0qQ.A0B(r3, 10);
        Runnable runnable2 = runnable;
        0qQ.A0B(runnable2, 11);
        String str6 = str4;
        0qQ.A0B(str6, 24);
        this.A09 = context;
        this.A0B = userSession;
        this.A0F = r2;
        this.A0A = fragmentActivity;
        this.A0M = fragment;
        this.A0E = g7v;
        this.A0N = r10;
        this.A0O = r11;
        this.A0C = r14;
        this.A0G = r3;
        this.A0U = runnable2;
        this.A0Q = g9z;
        this.A0R = r17;
        this.A0S = r19;
        this.A0J = z;
        this.A0P = eZn;
        this.A0X = str;
        this.A0Y = str2;
        this.A0W = str3;
        this.A0a = z2;
        this.A0b = z3;
        this.A0Z = z4;
        this.A0L = z5;
        this.A0H = str6;
        this.A0I = z6;
        this.A0T = l;
        this.A0V = str5;
        this.A0K = z7;
        this.A0D = new FZU(r2, userSession);
    }
}
