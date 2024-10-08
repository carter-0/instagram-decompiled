package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.H0f  reason: case insensitive filesystem */
public final class C54136H0f extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ThreadDeletionFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;

    public final void A06(C286575Wy r23, ImageUrl imageUrl, ImageUrl imageUrl2, int i) {
        int i2;
        ImageUrl imageUrl3 = imageUrl;
        0qQ.A0B(imageUrl3, 0);
        C286575Wy r7 = r23;
        r7.ExV(-1714787105);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r7, imageUrl3) | i;
        } else {
            i2 = i3;
        }
        ImageUrl imageUrl4 = imageUrl2;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r7, imageUrl4);
        }
        if ((i2 & 19) != 18 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1239630266, "com.instagram.direct.privacy.threaddeletion.ui.ThreadDeletionFragment.DoubleAvatarFacePile (ThreadDeletionFragment.kt:260)");
            }
            GSL.A01(r7, (Modifier) null, C51966G9m.A0o(r7, imageUrl3, i2), C51966G9m.A0o(r7, imageUrl4, i2 >> 3), GS7.A03.A02.AeN(), 0.0f, 0.75f, 817889280, 340, C51966G9m.A0A(r7), 0, false, true);
            if (0fL.A02()) {
                0fL.A00(1439120722);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(this, imageUrl4, imageUrl3, i3, 43);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0059, code lost:
        if (r2 == 0) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r7) {
        /*
            r6 = this;
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.0eM r5 = r6.A01
            java.lang.Object r0 = r5.getValue()
            X.Ggv r0 = (X.C53004Ggv) r0
            X.05G r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.JwM r0 = (X.C61084JwM) r0
            java.lang.Object r1 = r0.A00
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1 instanceof java.util.Collection
            r2 = 0
            if (r0 == 0) goto L_0x00a0
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00a0
        L_0x0023:
            r4 = 0
            r3 = 1
            if (r2 != 0) goto L_0x0094
            android.content.Context r1 = r6.requireContext()
            r0 = 2131960483(0x7f1322a3, float:1.9557636E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0032:
            r7.setTitle(r0)
            r1 = 59
            X.ICx r0 = new X.ICx
            r0.<init>(r6, r1)
            r7.Eu5(r0, r3)
            java.lang.Object r0 = r5.getValue()
            X.Ggv r0 = (X.C53004Ggv) r0
            X.05G r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.JwM r0 = (X.C61084JwM) r0
            java.lang.Object r0 = r0.A00
            int r0 = X.DbS.A05(r0)
            if (r0 != r2) goto L_0x005b
            r4 = 1
            r3 = 2131975997(0x7f135f3d, float:1.9589102E38)
            if (r2 != 0) goto L_0x005e
        L_0x005b:
            r3 = 2131973027(0x7f1353a3, float:1.9583078E38)
        L_0x005e:
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r5.getValue()
            X.Ggv r0 = (X.C53004Ggv) r0
            X.05G r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.JwM r0 = (X.C61084JwM) r0
            java.lang.Object r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            boolean r1 = X.AnonymousClass7TF.A1W(r1, r0)
            r2 = 0
            android.content.Context r0 = r6.getContext()
            if (r1 == 0) goto L_0x00c0
            if (r0 == 0) goto L_0x0083
            java.lang.String r2 = r0.getString(r3)
        L_0x0083:
            X.2dZ r7 = (X.2dZ) r7
            X.2dZ.A0G(r7)
            if (r2 == 0) goto L_0x0093
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0093
            r7.AA7(r2)
        L_0x0093:
            return
        L_0x0094:
            android.content.res.Resources r1 = X.DbV.A05(r6)
            r0 = 2131820841(0x7f110129, float:1.9274408E38)
            java.lang.String r0 = X.DbY.A0d(r1, r2, r0)
            goto L_0x0032
        L_0x00a0:
            java.util.Iterator r1 = r1.iterator()
        L_0x00a4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r1.next()
            X.GnV r0 = (X.C53398GnV) r0
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x00a4
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x00a4
            X.0sr.A1S()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c0:
            if (r0 == 0) goto L_0x00c6
            java.lang.String r2 = r0.getString(r3)
        L_0x00c6:
            r1 = 2
            X.IB1 r0 = new X.IB1
            r0.<init>(r1, r6, r4)
            r7.Eiy(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54136H0f.configureActionBar(X.2da):void");
    }

    public final String getModuleName() {
        return "direct_thread_deletion";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHI(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 43), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final void A05(LazyListState lazyListState, C286575Wy r20, C62320sa r21, int i, int i2, int i3) {
        int i4;
        LazyListState lazyListState2 = lazyListState;
        C62320sa r7 = r21;
        int i5 = i;
        DbY.A1S(lazyListState2, r7);
        C286575Wy r2 = r20;
        r2.ExV(1611941838);
        int i6 = i3;
        int i7 = i2;
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = G9t.A0O(r2, lazyListState2) | i2;
        } else {
            i4 = i7;
        }
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= G9t.A06(r2, i5);
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i7 & 384) == 0) {
            i4 |= G9t.A0G(r2, r7);
        }
        if ((i4 & 147) != 146 || !r2.Bwn()) {
            if (i8 != 0) {
                i5 = 5;
            }
            if (0fL.A02()) {
                0fL.A01(1129782165, "com.instagram.direct.privacy.threaddeletion.ui.ThreadDeletionFragment.AutoLoadMore (ThreadDeletionFragment.kt:223)");
            }
            C284945Oz A002 = C287175Zh.A00(r2, r7);
            Integer valueOf = Integer.valueOf(i5);
            r2.ExS(1315617849);
            boolean A1U = C51968G9o.A1U(r2, A002, AnonymousClass7TF.A1S(i4 & 14, 4), C51968G9o.A1S(i4));
            Object ECw = r2.ECw();
            if (A1U || ECw == AnonymousClass5XT.A00) {
                ECw = new JTZ(lazyListState2, A002, (AnonymousClass4D7) null, i5, 10);
                r2.FLL(ECw);
            }
            C51972G9s.A10(r2, ECw, valueOf);
            if (0fL.A02()) {
                0fL.A00(856652904);
            }
        } else {
            r2.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9D(lazyListState2, r7, this, i5, i7, i6, 3);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public C54136H0f() {
        C73921Pm1 pm1 = new C73921Pm1((Object) this, 9);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73921Pm1((Object) new C73921Pm1((Object) this, 6), 7));
        this.A01 = DbS.A0I(new C73921Pm1((Object) A002, 8), pm1, new C73667Phg(10, (Object) null, A002), DbS.A0z(C53004Ggv.class));
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r17, X.C61084JwM r18, X.C55482HiQ r19, X.C54136H0f r20, int r21) {
        /*
            r0 = -2049716940(0xffffffff85d3cd34, float:-1.9917724E-35)
            r14 = r17
            r14.ExV(r0)
            r3 = r21
            r0 = r21 & 6
            r8 = 4
            r5 = r19
            if (r0 != 0) goto L_0x0144
            int r2 = X.G9t.A0O(r14, r5)
            r2 = r2 | r21
        L_0x0017:
            r0 = r21 & 48
            r6 = r18
            if (r0 != 0) goto L_0x0022
            int r0 = X.G9t.A0F(r14, r6)
            r2 = r2 | r0
        L_0x0022:
            r0 = r3 & 384(0x180, float:5.38E-43)
            r4 = r20
            if (r0 != 0) goto L_0x002d
            int r0 = X.G9t.A0G(r14, r4)
            r2 = r2 | r0
        L_0x002d:
            r1 = r2 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L_0x004b
            boolean r0 = r14.Bwn()
            if (r0 == 0) goto L_0x004b
            r14.Evl()
        L_0x003c:
            X.5Xd r1 = r14.ASQ()
            if (r1 == 0) goto L_0x004a
            r0 = 40
        L_0x0044:
            X.JGN r0 = X.JGN.A01(r4, r5, r6, r3, r0)
            r1.A06 = r0
        L_0x004a:
            return
        L_0x004b:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0059
            r1 = -71178211(0xfffffffffbc1e81d, float:-2.0136422E36)
            java.lang.String r0 = "com.instagram.direct.privacy.threaddeletion.ui.ThreadDeletionFragment.DeleteButton (ThreadDeletionFragment.kt:276)"
            X.0fL.A01(r1, r0)
        L_0x0059:
            java.lang.Object r0 = r6.A02
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            if (r0 != r9) goto L_0x007e
            java.lang.Object r0 = r6.A00
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x007e
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0075
            r0 = -1138672256(0xffffffffbc213d80, float:-0.009841323)
            X.0fL.A00(r0)
        L_0x0075:
            X.5Xd r1 = r14.ASQ()
            if (r1 == 0) goto L_0x004a
            r0 = 39
            goto L_0x0044
        L_0x007e:
            X.5Zx r1 = X.C287275Zs.A06
            X.5Zr r0 = X.C287215Zl.A00
            X.5Qk r10 = androidx.compose.ui.Modifier.A00
            X.5RD r1 = X.C291495hO.A01(r1, r14, r0)
            r13 = 0
            int r12 = X.C287425a7.A00(r14)
            r7 = r14
            X.5Wx r7 = (X.C286565Wx) r7
            X.5RM r0 = X.C286565Wx.A04(r7)
            androidx.compose.ui.Modifier r11 = X.C287435a8.A01(r14, r10)
            X.C51973G9u.A0y(r14, r7)
            X.C51971G9r.A12(r14, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r7.A0K
            if (r0 != 0) goto L_0x00aa
            boolean r0 = X.C51972G9s.A1Q(r14, r12)
            if (r0 != 0) goto L_0x00ad
        L_0x00aa:
            X.C51971G9r.A13(r14, r1, r12)
        L_0x00ad:
            X.C51965G9l.A18(r14, r11)
            r1 = 1065353216(0x3f800000, float:1.0)
            X.4cd r0 = X.C51968G9o.A0Y(r14)
            float r0 = r0.AwL()
            float r1 = r1 / r0
            androidx.compose.ui.Modifier r0 = X.C51966G9m.A0T(r10)
            androidx.compose.ui.Modifier r10 = X.C287205Zk.A08(r0, r1)
            long r0 = X.C51965G9l.A0A(r14)
            r15 = 0
            X.C51969G9p.A14(r14, r10, r0)
            r0 = 2131960481(0x7f1322a1, float:1.9557632E38)
            java.lang.String r17 = X.C304346Dc.A00(r14, r0)
            X.HLX r16 = X.HLX.Destructive
            java.lang.Object r0 = r6.A01
            if (r0 != r9) goto L_0x00e6
            java.lang.Object r1 = r6.A00
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x012d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x012d
        L_0x00e6:
            r21 = 0
        L_0x00e8:
            r0 = 1193817932(0x4728374c, float:43063.297)
            boolean r1 = X.C51967G9n.A1Z(r14, r4, r0)
            r0 = r2 & 14
            if (r0 != r8) goto L_0x00f4
            r13 = 1
        L_0x00f4:
            r13 = r13 | r1
            java.lang.Object r1 = r14.ECw()
            if (r13 != 0) goto L_0x00ff
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            if (r1 != r8) goto L_0x0108
        L_0x00ff:
            r8 = 5
            X.Phg r1 = new X.Phg
            r1.<init>(r8, r5, r4)
            r14.FLL(r1)
        L_0x0108:
            X.0sa r1 = (X.C62320sa) r1
            X.C286565Wx.A0I(r7)
            r19 = 3072(0xc00, float:4.305E-42)
            r20 = 4
            r18 = r1
            X.HXR.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            r1 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r0
            r0 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r0
            A01(r14, r6, r5, r4, r1)
            boolean r0 = X.C51967G9n.A1R(r14)
            if (r0 == 0) goto L_0x003c
            r0 = 1494665453(0x5916c8ed, float:2.65263542E15)
            X.0fL.A00(r0)
            goto L_0x003c
        L_0x012d:
            java.util.Iterator r1 = r1.iterator()
        L_0x0131:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r0 = r1.next()
            X.GnV r0 = (X.C53398GnV) r0
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0131
            r21 = 1
            goto L_0x00e8
        L_0x0144:
            r2 = r3
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54136H0f.A00(X.5Wy, X.JwM, X.HiQ, X.H0f, int):void");
    }

    public static final void A01(C286575Wy r18, C61084JwM jwM, C55482HiQ hiQ, C54136H0f h0f, int i) {
        int i2;
        int i3;
        C286625Xd ASQ;
        int i4;
        C286575Wy r10 = r18;
        r10.ExV(1091358381);
        int i5 = i;
        C55482HiQ hiQ2 = hiQ;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r10, hiQ2) | i;
        } else {
            i2 = i5;
        }
        C61084JwM jwM2 = jwM;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r10, jwM2);
        }
        C54136H0f h0f2 = h0f;
        if ((i5 & 384) == 0) {
            i2 |= G9t.A0G(r10, h0f2);
        }
        if ((i2 & 147) != 146 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1294177820, "com.instagram.direct.privacy.threaddeletion.ui.ThreadDeletionFragment.DeletionDialog (ThreadDeletionFragment.kt:310)");
            }
            if (!C51971G9r.A1W(hiQ2.A00)) {
                if (0fL.A02()) {
                    0fL.A00(192585672);
                }
                ASQ = r10.ASQ();
                if (ASQ != null) {
                    i4 = 41;
                    ASQ.A06 = JGN.A01(h0f2, hiQ2, jwM2, i5, i4);
                }
                return;
            }
            List<C53398GnV> list = (List) jwM2.A00;
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                i3 = 0;
                for (C53398GnV gnV : list) {
                    if (gnV.A05 && (i3 = i3 + 1) < 0) {
                        0sr.A1S();
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            } else {
                i3 = 0;
            }
            C51968G9o.A0j(h0f2).A02.markerPoint(834879336, "delete_popup_impression");
            r10.ExS(-806572923);
            int i6 = i2 & 14;
            boolean A1S = AnonymousClass7TF.A1S(i6, 4);
            Object ECw = r10.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = new C73921Pm1((Object) hiQ2, 3);
                r10.FLL(ECw);
            }
            C62320sa r4 = (C62320sa) ECw;
            C286565Wx r3 = (C286565Wx) r10;
            C286565Wx.A0L(r3, false);
            String A02 = C304346Dc.A02(r10, AnonymousClass7TF.A1b(i3), R.plurals.direct_thread_deletion_confirmation_dialog_title_with_count, i3);
            String A002 = C304346Dc.A00(r10, 2131960475);
            String A003 = C304346Dc.A00(r10, 2131960476);
            Integer num = AnonymousClass05K.A0C;
            boolean A1Z = C51967G9n.A1Z(r10, h0f2, -806552890);
            Object ECw2 = r10.ECw();
            if (A1Z || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C73921Pm1((Object) h0f2, 4);
                r10.FLL(ECw2);
            }
            C53398GnV gnV2 = new C53398GnV(num, A003, C51965G9l.A0y(r3, ECw2, false), 12);
            String A004 = C304346Dc.A00(r10, 2131960477);
            boolean A1Z2 = C51967G9n.A1Z(r10, h0f2, -806539408);
            if (i6 == 4) {
                z = true;
            }
            boolean z2 = A1Z2 | z;
            Object ECw3 = r10.ECw();
            if (z2 || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = new C73667Phg(6, hiQ2, h0f2);
                r10.FLL(ECw3);
            }
            C286575Wy r13 = r10;
            C56632I5m.A01((View) null, r13, gnV2, new C53398GnV((Integer) null, A004, C51965G9l.A0y(r3, ECw3, false), 14), (C53398GnV) null, A02, A002, r4, 100663296, 3808, true);
            if (0fL.A02()) {
                0fL.A00(1433921907);
            }
        } else {
            r10.Evl();
        }
        ASQ = r10.ASQ();
        if (ASQ != null) {
            i4 = 42;
            ASQ.A06 = JGN.A01(h0f2, hiQ2, jwM2, i5, i4);
        }
    }

    public static final void A02(C286575Wy r10, C61084JwM jwM, C54136H0f h0f, int i) {
        int i2;
        C286625Xd ASQ;
        int i3;
        C286575Wy r4 = r10;
        r10.ExV(89318171);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r10, jwM) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1833312871, "com.instagram.direct.privacy.threaddeletion.ui.ThreadDeletionFragment.EmptyState (ThreadDeletionFragment.kt:135)");
            }
            if (jwM.A02 != AnonymousClass05K.A01 || G9w.A1b(jwM.A00)) {
                if (0fL.A02()) {
                    0fL.A00(-948144769);
                }
                ASQ = r10.ASQ();
                if (ASQ != null) {
                    i3 = 13;
                    JGO.A01(ASQ, jwM, h0f, i, i3);
                }
                return;
            }
            AnonymousClass2DO A0J = C51967G9n.A0J(r10, R.drawable.instagram_app_messenger_outline_96);
            C285245Qk r2 = Modifier.A00;
            C288165bT.A00(r4, C287195Zj.A0B(C51966G9m.A0T(r2), 0.0f, 32.0f, 0.0f, 0.0f), A0J, 432, 24, 0);
            AnonymousClass5ZZ.A0S(r4, C287195Zj.A09(r2, 0.0f, 12.0f), C51966G9m.A0e(r4), C304346Dc.A00(r4, 2131960479), C51966G9m.A0H(r4));
            C51975G9x.A14(r4, C51966G9m.A0g(r4), C304346Dc.A00(r4, 2131960480));
            if (0fL.A02()) {
                0fL.A00(1166499672);
            }
        } else {
            r10.Evl();
        }
        ASQ = r4.ASQ();
        if (ASQ != null) {
            i3 = 14;
            JGO.A01(ASQ, jwM, h0f, i, i3);
        }
    }

    public static final void A03(C286575Wy r10, C61084JwM jwM, C54136H0f h0f, int i) {
        int i2;
        C286575Wy r6 = r10;
        r10.ExV(1612450719);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r10, jwM) | i;
        } else {
            i2 = i;
        }
        C54136H0f h0f2 = h0f;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r10, h0f);
        }
        if ((i2 & 19) != 18 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1703728826, "com.instagram.direct.privacy.threaddeletion.ui.ThreadDeletionFragment.ThreadList (ThreadDeletionFragment.kt:158)");
            }
            boolean z = false;
            LazyListState A002 = C305066Gi.A00(r10, 0, 0, 0, 3);
            boolean A1Z = C51967G9n.A1Z(r10, h0f, -2071213384);
            Object ECw = r10.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = new C73921Pm1((Object) h0f, 5);
                r10.FLL(ECw);
            }
            C286565Wx r2 = (C286565Wx) r6;
            C286565Wx.A0L(r2, false);
            h0f2.A05(A002, r6, (C62320sa) ECw, 0, (i2 << 6) & 7168, 1);
            if (jwM.A01 == AnonymousClass05K.A01) {
                z = true;
            }
            boolean A1V = C51966G9m.A1V(r6, z, C51973G9u.A1S(r6, jwM, h0f, -2071205746));
            Object ECw2 = r6.ECw();
            if (A1V || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new GN2(13, h0f, jwM, z);
                r6.FLL(ECw2);
            }
            AnonymousClass6HY.A05(A002, r6, C51965G9l.A0z(r2, ECw2));
            if (0fL.A02()) {
                0fL.A00(-1074129113);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, jwM, h0f, i, 15);
        }
    }

    public static final void A04(C53398GnV gnV, C54136H0f h0f) {
        C53004Ggv A0j = C51968G9o.A0j(h0f);
        Object obj = gnV.A02;
        0qQ.A0B(obj, 0);
        05G r3 = A0j.A03.A07;
        List<C53398GnV> list = (List) ((C61084JwM) r3.getValue()).A02;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C53398GnV gnV2 : list) {
            C254743sy r8 = (C254743sy) gnV2.A02;
            if (0qQ.A0K(r8, obj)) {
                String str = gnV2.A04;
                String str2 = gnV2.A03;
                C69597Nof nof = (C69597Nof) gnV2.A01;
                0qQ.A0B(r8, 0);
                AnonymousClass7TG.A1P(str, nof);
                gnV2 = new C53398GnV(nof, r8, str, str2, !gnV2.A05);
            }
            A0r.add(gnV2);
        }
        C61084JwM jwM = (C61084JwM) r3.getValue();
        r3.Epw(C61084JwM.A03((Integer) jwM.A01, (Integer) jwM.A00, A0r));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-210971665);
        ComposeView A0H = DbV.A0H(this, new C59110J6s(this, 44), 751495226);
        AnonymousClass0fD.A09(-912175092, A02);
        return A0H;
    }

    public final void onDestroy() {
        int A02 = AnonymousClass0fD.A02(945018081);
        super.onDestroy();
        C51968G9o.A0j(this).A02.markerEnd(834879336, 2);
        AnonymousClass0fD.A09(524494108, A02);
    }

    public final void onDestroyView() {
        int A02 = AnonymousClass0fD.A02(-1248951073);
        super.onDestroyView();
        C69067Ne6 ne6 = C51968G9o.A0j(this).A03;
        C74411PuR puR = ne6.A05;
        puR.BNZ().stop();
        puR.C6W().cancel();
        ne6.A02.A01();
        AnonymousClass0fD.A09(2090971474, A02);
    }

    public final void onPause() {
        int A02 = AnonymousClass0fD.A02(-1660604083);
        C54136H0f.super.onPause();
        C74411PuR puR = C51968G9o.A0j(this).A03.A05;
        puR.BNZ().pause();
        puR.C6W().EaU(false);
        AnonymousClass0fD.A09(2057857777, A02);
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(-1857234180);
        super.onResume();
        C74411PuR puR = C51968G9o.A0j(this).A03.A05;
        puR.BNZ().EIx();
        puR.C6W().EaU(true);
        AnonymousClass0fD.A09(1271100090, A02);
    }
}
