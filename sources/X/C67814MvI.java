package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.Shape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.MvI  reason: case insensitive filesystem */
public final class C67814MvI extends 2Rw {
    public int A00;
    public int A01 = 0;
    public N8K A02;
    public AnonymousClass0eM A03;
    public AnonymousClass0eM A04;
    public final LayoutInflater A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final C332847Wp A08;
    public final AnonymousClass9HC A09;
    public final C331037Pg A0A;
    public final boolean A0B;

    public static void A00(View view, AnonymousClass7FE r10) {
        float f;
        float f2;
        Drawable A0D = JTO.A0D(r10.A05);
        if (A0D != null) {
            C329977Ky r5 = r10.A03.A03;
            Context context = view.getContext();
            if (0mk.A02(context)) {
                f = r5.A02;
                f2 = r5.A01;
            } else {
                f = r5.A01;
                f2 = r5.A02;
            }
            C331277Qg A0F = C66581MXm.A0F(A0D);
            if (A0F != null) {
                float f3 = r5.A00;
                if (f3 == 0.0f) {
                    A0F.A01(r5.A04);
                } else {
                    int i = r5.A04;
                    if (i == 0) {
                        i = AnonymousClass7TF.A03(context, R.attr.igds_color_primary_background);
                    }
                    A0F.A03(i, r5.A03, f3);
                }
                Shape shape = A0F.A03;
                if (shape instanceof C308496Um) {
                    0qQ.A0C(shape, C273654mx.A00(350));
                    C329977Ky.A01((C308496Um) shape, C328637Fo.NONE, r5, f, f2);
                }
            }
            view.setBackground(A0D);
        }
    }

    public final void onBindViewHolder(C249703kE r21, int i) {
        String str;
        float f;
        String str2;
        String str3;
        float f2;
        if (this.A02 != null) {
            0lp A002 = 0lq.A00("GenericHscrollAdapter.onBindViewHolder");
            try {
                int i2 = i;
                AnonymousClass7FW r4 = (AnonymousClass7FW) this.A02.A02.get(i2);
                C249703kE r3 = r21;
                if ((r3 instanceof C3257073v) && (r4 instanceof C328667Fr)) {
                    C3257073v r7 = (C3257073v) r3;
                    C328667Fr r42 = (C328667Fr) r4;
                    ((AnonymousClass74R) this.A03.getValue()).ADp(r7, r42);
                    int i3 = r42.A00;
                    if (!r42.CU2()) {
                        A00(r7.BJd(), r42.A0C);
                    }
                    if (this.A00 > 0) {
                        C71662eb r1 = r7.A0B;
                        if (r1.A01().getLayoutParams() != null) {
                            r1.A01().getLayoutParams().height = this.A00;
                        }
                    }
                    if (r42.A0J == C254883tD.CIRCULAR) {
                        int i4 = this.A01;
                        if (i4 <= 0) {
                            f2 = -1.0f;
                        } else {
                            f2 = 0.640625f * ((float) i4);
                        }
                        int round = Math.round(f2);
                        if (round > 0) {
                            0nA.A0f(r7.BJd(), round);
                        }
                    }
                    AnonymousClass0fU.A00(new C71354Oj9(i3, 2, r7, r42, this), r7.BJd());
                } else if ((r3 instanceof C3263876o) && (r4 instanceof AnonymousClass752)) {
                    C3263876o r6 = (C3263876o) r3;
                    AnonymousClass752 r43 = (AnonymousClass752) r4;
                    ((AnonymousClass78H) this.A04.getValue()).ADp(r43, r6);
                    if (!r43.CU2()) {
                        A00(r6.A03, r43.A02);
                    }
                    C328667Fr r72 = r43.A03;
                    int i5 = r72.A00;
                    if (this.A01 > 0) {
                        float f3 = 0.640625f;
                        IgProgressImageView igProgressImageView = r6.A0V;
                        if ((igProgressImageView.getLayoutParams() instanceof C71492dQ) && (str2 = ((C71492dQ) igProgressImageView.getLayoutParams()).A0z) != null) {
                            String[] split = str2.split(",");
                            int length = split.length;
                            if (length >= 2) {
                                str3 = split[1];
                            } else {
                                if (length == 1) {
                                    str3 = split[0];
                                }
                                f3 = 0.640625f;
                            }
                            String[] split2 = str3.split(":");
                            if (split2 != null && split2.length == 2) {
                                try {
                                    f3 = Float.parseFloat(split2[0]) / Float.parseFloat(split2[1]);
                                } catch (NumberFormatException unused) {
                                }
                            }
                            f3 = 0.640625f;
                        }
                        int i6 = this.A01;
                        if (i6 <= 0) {
                            f = -1.0f;
                        } else {
                            f = f3 * ((float) i6);
                        }
                        int round2 = Math.round(f);
                        0nA.A0f(igProgressImageView, round2);
                        0nA.A0f(r6.A0W, round2);
                    }
                    AnonymousClass752 r17 = r43;
                    AnonymousClass0fU.A00(new C71354Oj9(i5, 3, r17, r6, this), r6.A03);
                    if (!182.A06(0Tu.A05, this.A07, 36327288656378182L) && (str = r72.A0V) != null) {
                        AnonymousClass9J6 r0 = r72.A08;
                        ((AnonymousClass7XD) this.A08).Ch7(r72.A0M, r0.A00, str, r0.A01, i2);
                    }
                }
                if (this.A01 > 0 && r3.itemView.getLayoutParams() != null) {
                    r3.itemView.getLayoutParams().height = this.A01;
                }
                AnonymousClass3MX r44 = (AnonymousClass3MX) r3.itemView.getLayoutParams();
                if (i2 == C51966G9m.A06(this.A02.A02)) {
                    r44.rightMargin = 2Yu.A0G(DbS.A07(r3), R.attr.avatarStartSpacing) + 2Yu.A0G(DbS.A07(r3), R.attr.containerMarginEnd);
                    r3.itemView.setLayoutParams(r44);
                } else {
                    r44.rightMargin = 0;
                    r3.itemView.setLayoutParams(r44);
                }
                A002.close();
            } catch (Throwable th) {
                C9153RRe.A00(th, th);
                throw th;
            }
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        C249703kE r0;
        0lp A002 = 0lq.A00("GenericHscrollAdapter.onCreateViewHolder");
        if (i == 1) {
            try {
                r0 = ((AnonymousClass78H) this.A04.getValue()).ANK(this.A05, viewGroup);
            } catch (Throwable th) {
                C9153RRe.A00(th, th);
                throw th;
            }
        } else {
            r0 = ((AnonymousClass74R) this.A03.getValue()).ANK(this.A05, viewGroup);
        }
        A002.close();
        return r0;
    }

    public C67814MvI(LayoutInflater layoutInflater, AnonymousClass0iw r4, UserSession userSession, C332847Wp r6, AnonymousClass9HC r7, C331037Pg r8, boolean z) {
        this.A05 = layoutInflater;
        this.A0A = r8;
        this.A06 = r4;
        this.A08 = r6;
        this.A09 = r7;
        this.A07 = userSession;
        this.A0B = z;
        this.A03 = AnonymousClass0eN.A01(new C73467Pd9(this, 6));
        this.A04 = AnonymousClass0eN.A01(new C73467Pd9(this, 7));
    }

    public final int getItemCount() {
        int i;
        int A032 = AnonymousClass0fD.A03(-446183318);
        N8K n8k = this.A02;
        if (n8k != null) {
            i = n8k.A02.size();
        } else {
            i = 0;
        }
        AnonymousClass0fD.A0A(85747363, A032);
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r2 == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getItemViewType(int r5) {
        /*
            r4 = this;
            r0 = 2104464376(0x7d6f93f8, float:1.9903362E37)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.N8K r0 = r4.A02
            if (r0 == 0) goto L_0x0019
            java.util.List r0 = r0.A02
            java.lang.Object r0 = r0.get(r5)
            boolean r2 = r0 instanceof X.AnonymousClass752
            r1 = 1
            r0 = 1581351729(0x5e418331, float:3.48601069E18)
            if (r2 != 0) goto L_0x001d
        L_0x0019:
            r1 = 0
            r0 = 1646106365(0x621d96fd, float:7.267547E20)
        L_0x001d:
            X.AnonymousClass0fD.A0A(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67814MvI.getItemViewType(int):int");
    }
}
