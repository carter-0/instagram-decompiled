package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.3K2  reason: invalid class name */
public final class AnonymousClass3K2 extends AnonymousClass3K3 implements C252203oj, AnonymousClass3K4, AnonymousClass3K5 {
    public static final Map A13;
    public int A00;
    public RectF A01;
    public RectF A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public AnonymousClass34Y A0C;
    public Reel A0D;
    public Reel A0E;
    public C255773uh A0F;
    public ReelViewerConfig A0G = ReelViewerConfig.A00();
    public AnonymousClass3BQ A0H;
    public C51914G7i A0I;
    public C51914G7i A0J;
    public AnonymousClass6WJ A0K;
    public AnonymousClass3N2 A0L;
    public C305736Ji A0M;
    public C316006kx A0N;
    public C316006kx A0O;
    public C69061Ndy A0P;
    public C67602Mqa A0Q;
    public C309406Yd A0R;
    public Integer A0S = AnonymousClass05K.A0j;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public float A0W;
    public float A0X;
    public float A0Y;
    public float A0Z = 1.0f;
    public int A0a = -1;
    public int A0b;
    public RectF A0c;
    public RectF A0d;
    public View A0e;
    public C305736Ji A0f;
    public C305836Jt A0g;
    public C67602Mqa A0h;
    public C309406Yd A0i;
    public boolean A0j;
    public final int A0k;
    public final Activity A0l;
    public final Context A0m;
    public final View A0n;
    public final ViewGroup A0o;
    public final ViewGroup A0p;
    public final ViewGroup A0q;
    public final C14090Tph A0r;
    public final 2cs A0s;
    public final C229392nJ A0t;
    public final UserSession A0u;
    public final ReelAvatarWithBadgeView A0v;
    public final User A0w;
    public final String A0x;
    public final int A0y;
    public final int A0z;
    public final int A10;
    public final Resources A11;
    public final C2366434n A12;

    public final void A0T(RectF rectF, RectF rectF2, AnonymousClass0iw r16, Reel reel, AnonymousClass3BQ r18, AnonymousClass6WJ r19, int i) {
        A0V(rectF, rectF2, r16, reel, r18, r19, (String) null, (List) null, Collections.emptySet(), 0.0f, i, false);
    }

    public final void DmD(2cs r1) {
    }

    static {
        17j r1 = new 17j();
        r1.A03(64);
        r1.A01();
        A13 = r1.A00();
    }

    private View A00() {
        if (this.A0e == null) {
            ViewGroup A002 = C71102Occ.A00(this.A0q, (C247833gz) null, this.A0u, (C226642hc) null, C309646Zb.A01);
            this.A0e = A002;
            Context context = this.A0m;
            A002.setBackgroundColor(context.getColor(2Yu.A0H(context, R.attr.igds_color_text_on_white)));
        }
        return this.A0e;
    }

    private View A01() {
        Reel reel = this.A0E;
        if (reel != null) {
            if (reel.A0c()) {
                return A00();
            }
            if (reel.CcK()) {
                View view = this.A0A;
                if (view != null) {
                    return view;
                }
                ViewGroup A002 = C307066Or.A00(this.A0q, (C247833gz) null, this.A0u, (C226642hc) null, this.A0H);
                this.A0A = A002;
                return A002;
            } else if (reel.A0m()) {
                View view2 = this.A07;
                if (view2 != null) {
                    return view2;
                }
                ViewGroup A003 = C306586Ms.A00(this.A0q, (C247833gz) null, this.A0u, (C226642hc) null);
                this.A07 = A003;
                return A003;
            }
        }
        View view3 = this.A08;
        if (view3 != null) {
            return view3;
        }
        ViewGroup A004 = C315686kL.A00(this.A0l, this.A0q, (C247833gz) null, this.A0u, (C226642hc) null, this.A0H, AnonymousClass05K.A00);
        this.A08 = A004;
        return A004;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View A02() {
        /*
            r3 = this;
            com.instagram.model.reels.Reel r2 = r3.A0E
            r1 = 0
            if (r2 == 0) goto L_0x005a
            boolean r0 = r2.A0d()
            if (r0 == 0) goto L_0x0029
            X.4gL r0 = r2.A0H
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r0.A0Y
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = ""
        L_0x0015:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            return r1
        L_0x001c:
            X.6Jt r0 = r3.A08()
            if (r0 == 0) goto L_0x001b
            X.6Jt r0 = r3.A08()
            android.view.View r1 = r0.A0S
            return r1
        L_0x0029:
            boolean r0 = r2.A0c()
            if (r0 == 0) goto L_0x0045
            X.6Ji r0 = r3.A06()
            if (r0 == 0) goto L_0x001b
            X.6Ji r0 = r3.A06()
            X.0eM r0 = r0.A0D
            java.lang.Object r1 = r0.getValue()
            X.0qQ.A07(r1)
            android.view.View r1 = (android.view.View) r1
            return r1
        L_0x0045:
            boolean r0 = r2.CcK()
            if (r0 == 0) goto L_0x005a
            X.6Yd r0 = r3.A0C()
            if (r0 == 0) goto L_0x001b
            X.6Yd r0 = r3.A0C()
            X.6PB r0 = r0.A0X
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r0.A0F
            return r1
        L_0x005a:
            X.6kx r0 = r3.A0N
            if (r0 == 0) goto L_0x001b
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r1 = r0.A1V
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3K2.A02():android.view.View");
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object, X.6ZZ] */
    public static View A03(AnonymousClass3K2 r7) {
        Reel reel = r7.A0E;
        if (reel != null) {
            if (reel.A0d()) {
                r7.A0J();
                if (r7.A04 == null) {
                    ViewGroup A002 = JZP.A00(r7.A0q, (C247833gz) null, r7.A0u, (C226642hc) null, new Object());
                    r7.A04 = A002;
                    A002.setBackgroundColor(-16777216);
                }
                return r7.A04;
            } else if (reel.A0c()) {
                if (r7.A03 == null) {
                    ViewGroup A003 = C71102Occ.A00(r7.A0q, (C247833gz) null, r7.A0u, (C226642hc) null, C309646Zb.A01);
                    r7.A03 = A003;
                    A003.setBackgroundColor(-16777216);
                }
                return r7.A03;
            } else if (reel.CcK()) {
                if (r7.A09 == null) {
                    ViewGroup A004 = C307066Or.A00(r7.A0q, (C247833gz) null, r7.A0u, (C226642hc) null, r7.A0H);
                    r7.A09 = A004;
                    A004.setBackgroundColor(-16777216);
                }
                return r7.A09;
            } else if (reel.A0m()) {
                if (r7.A06 == null) {
                    ViewGroup A005 = C306586Ms.A00(r7.A0q, (C247833gz) null, r7.A0u, (C226642hc) null);
                    r7.A06 = A005;
                    A005.setBackgroundColor(-16777216);
                }
                return r7.A06;
            } else if (reel.A1W || AnonymousClass6WN.A00(r7.A0u, reel)) {
                View view = r7.A0B;
                if (view != null) {
                    return view;
                }
                ViewGroup A006 = C70900OQs.A00(r7.A0q, r7.A0u);
                r7.A0B = A006;
                return A006;
            }
        }
        if (r7.A05 == null) {
            ViewGroup A007 = C315686kL.A00(r7.A0l, r7.A0q, (C247833gz) null, r7.A0u, (C226642hc) null, r7.A0H, AnonymousClass05K.A00);
            r7.A05 = A007;
            r7.A0N = (C316006kx) A007.getTag();
        }
        return r7.A05;
    }

    private C305736Ji A06() {
        C305736Ji r0 = this.A0f;
        if (r0 != null) {
            return r0;
        }
        if (this.A03 == null) {
            ViewGroup A002 = C71102Occ.A00(this.A0q, (C247833gz) null, this.A0u, (C226642hc) null, C309646Zb.A01);
            this.A03 = A002;
            A002.setBackgroundColor(-16777216);
        }
        C305736Ji r02 = (C305736Ji) this.A03.getTag();
        this.A0f = r02;
        return r02;
    }

    private C305736Ji A07() {
        C305736Ji r0 = this.A0M;
        if (r0 != null) {
            return r0;
        }
        C305736Ji r02 = (C305736Ji) A00().getTag();
        this.A0M = r02;
        return r02;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.6ZZ] */
    private C305836Jt A08() {
        C305836Jt r0 = this.A0g;
        if (r0 != null) {
            return r0;
        }
        A0J();
        if (this.A04 == null) {
            ViewGroup A002 = JZP.A00(this.A0q, (C247833gz) null, this.A0u, (C226642hc) null, new Object());
            this.A04 = A002;
            A002.setBackgroundColor(-16777216);
        }
        C305836Jt r02 = (C305836Jt) this.A04.getTag();
        this.A0g = r02;
        return r02;
    }

    private C316006kx A09() {
        C316006kx r0 = this.A0O;
        if (r0 != null) {
            return r0;
        }
        View view = this.A08;
        if (view == null) {
            view = C315686kL.A00(this.A0l, this.A0q, (C247833gz) null, this.A0u, (C226642hc) null, this.A0H, AnonymousClass05K.A00);
            this.A08 = view;
        }
        C316006kx r02 = (C316006kx) view.getTag();
        this.A0O = r02;
        return r02;
    }

    private C67602Mqa A0A() {
        C67602Mqa mqa = this.A0h;
        if (mqa != null) {
            return mqa;
        }
        if (this.A06 == null) {
            ViewGroup A002 = C306586Ms.A00(this.A0q, (C247833gz) null, this.A0u, (C226642hc) null);
            this.A06 = A002;
            A002.setBackgroundColor(-16777216);
        }
        C67602Mqa mqa2 = (C67602Mqa) this.A06.getTag();
        this.A0h = mqa2;
        return mqa2;
    }

    private C67602Mqa A0B() {
        C67602Mqa mqa = this.A0Q;
        if (mqa != null) {
            return mqa;
        }
        View view = this.A07;
        if (view == null) {
            view = C306586Ms.A00(this.A0q, (C247833gz) null, this.A0u, (C226642hc) null);
            this.A07 = view;
        }
        C67602Mqa mqa2 = (C67602Mqa) view.getTag();
        this.A0Q = mqa2;
        return mqa2;
    }

    private C309406Yd A0C() {
        C309406Yd r0 = this.A0i;
        if (r0 != null) {
            return r0;
        }
        if (this.A09 == null) {
            ViewGroup A002 = C307066Or.A00(this.A0q, (C247833gz) null, this.A0u, (C226642hc) null, this.A0H);
            this.A09 = A002;
            A002.setBackgroundColor(-16777216);
        }
        C309406Yd r02 = (C309406Yd) this.A09.getTag();
        this.A0i = r02;
        return r02;
    }

    private C309406Yd A0D() {
        C309406Yd r0 = this.A0R;
        if (r0 != null) {
            return r0;
        }
        View view = this.A0A;
        if (view == null) {
            view = C307066Or.A00(this.A0q, (C247833gz) null, this.A0u, (C226642hc) null, this.A0H);
            this.A0A = view;
        }
        C309406Yd r02 = (C309406Yd) view.getTag();
        this.A0R = r02;
        return r02;
    }

    private void A0E() {
        View view = this.A0e;
        if (view != null) {
            view.setVisibility(8);
            view.setLayerType(0, (Paint) null);
        }
        View view2 = this.A08;
        if (view2 != null) {
            view2.setVisibility(8);
            view2.setLayerType(0, (Paint) null);
        }
        View view3 = this.A0A;
        if (view3 != null) {
            view3.setVisibility(8);
            view3.setLayerType(0, (Paint) null);
        }
        View view4 = this.A07;
        if (view4 != null) {
            view4.setVisibility(8);
            view4.setLayerType(0, (Paint) null);
        }
    }

    private void A0F() {
        View view;
        if (182.A06(0Tu.A05, this.A0u, 36327361671149951L)) {
            View findViewById = A03(this).findViewById(R.id.reel_view_group);
            if (findViewById != null) {
                findViewById.setBackgroundColor(0);
            }
            C316006kx r0 = this.A0N;
            if (r0 != null) {
                C252063oV r1 = r0.A10;
                if (r1.CVM() && (view = r1.getView()) != null) {
                    view.setBackgroundColor(0);
                }
            }
        }
    }

    private void A0G() {
        String str;
        AnonymousClass3BQ r1;
        View view;
        if (this.A0S == AnonymousClass05K.A00) {
            this.A0S = AnonymousClass05K.A01;
            String str2 = null;
            A03(this).setLayerType(0, (Paint) null);
            this.A0v.setLayerType(0, (Paint) null);
            this.A0o.setLayerType(0, (Paint) null);
            this.A0n.setLayerType(0, (Paint) null);
            if (182.A06(0Tu.A05, this.A0u, 36327361670953341L)) {
                C14090Tph tph = this.A0r;
                ArrayList arrayList = tph.A0A;
                int indexOf = arrayList.indexOf(this);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, (Object) null);
                }
                ArrayList arrayList2 = tph.A0B;
                int indexOf2 = arrayList2.indexOf(this);
                if (indexOf2 >= 0) {
                    arrayList2.set(indexOf2, (Object) null);
                }
                this.A00 = 0.0f;
            } else {
                2cs r3 = this.A0s;
                r3.A0B(this);
                r3.A08(0.0d, true);
            }
            AnonymousClass6WJ r12 = this.A0K;
            if (r12 != null) {
                Reel reel = this.A0E;
                if (reel != null) {
                    str2 = reel.getId();
                }
                r12.Dfo(str2);
            }
            C316006kx r0 = this.A0N;
            if (!(r0 == null || (view = r0.A1e.A11) == null)) {
                view.setVisibility(0);
            }
        }
        if (this.A0S == AnonymousClass05K.A0Y) {
            boolean z = false;
            A03(this).setLayerType(0, (Paint) null);
            this.A0v.setLayerType(0, (Paint) null);
            this.A0o.setLayerType(0, (Paint) null);
            this.A0n.setLayerType(0, (Paint) null);
            C51914G7i g7i = this.A0J;
            if (g7i != null) {
                if (this.A0T && (r1 = this.A0H) != null && r1 == AnonymousClass3BQ.MAIN_FEED_TRAY) {
                    z = true;
                }
                C255773uh r02 = this.A0F;
                if (r02 != null) {
                    str = r02.A0k;
                } else {
                    str = null;
                }
                g7i.DJ6(z, str);
                this.A0J = null;
            }
            A0I();
            A0E();
            C305736Ji r03 = this.A0M;
            if (r03 != null) {
                r03.A01();
            }
            C316006kx r04 = this.A0O;
            if (r04 != null) {
                r04.A00();
            }
            C309406Yd r05 = this.A0R;
            if (r05 != null) {
                r05.A05();
            }
            C67602Mqa mqa = this.A0Q;
            if (mqa != null) {
                mqa.A06 = null;
                mqa.A08 = null;
                mqa.A0a.setProgress(0.0f);
                mqa.A07 = null;
            }
            ViewGroup viewGroup = this.A0q;
            viewGroup.setVisibility(8);
            this.A0p.removeView(viewGroup);
            this.A0S = AnonymousClass05K.A0j;
        }
    }

    private void A0I() {
        Reel reel = this.A0E;
        if (reel == null || !reel.A0d() || A08() == null) {
            Reel reel2 = this.A0E;
            if (reel2 == null || !reel2.A0c() || A06() == null) {
                Reel reel3 = this.A0E;
                if (reel3 == null || !reel3.CcK() || A0C() == null) {
                    Reel reel4 = this.A0E;
                    if (reel4 == null || !reel4.A0m() || A0A() == null) {
                        C316006kx r0 = this.A0N;
                        if (r0 != null) {
                            r0.A00();
                            return;
                        }
                        return;
                    }
                    C67602Mqa A0A2 = A0A();
                    A0A2.A06 = null;
                    A0A2.A08 = null;
                    A0A2.A0a.setProgress(0.0f);
                    A0A2.A07 = null;
                    return;
                }
                A0C().A05();
                return;
            }
            A06().A01();
            return;
        }
        C305836Jt A082 = A08();
        A082.A02 = null;
        A082.A04 = null;
        A082.A03 = null;
        A082.A0b.getIgImageView().A09();
        A082.A0X.A09();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (r0.size() <= 0) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0J() {
        /*
            r5 = this;
            android.content.res.Resources r2 = r5.A11
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
            int r1 = r2.getDimensionPixelSize(r0)
            int r0 = r5.A0y
            int r1 = r1 - r0
            int r1 = r1 / 2
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r0 = r2.getDimensionPixelSize(r0)
            int r1 = r1 + r0
            r5.A00 = r1
            com.instagram.model.reels.Reel r1 = r5.A0E
            if (r1 == 0) goto L_0x0031
            boolean r0 = r1.A0d()
            if (r0 == 0) goto L_0x0031
            X.4gL r0 = r1.A0H
            if (r0 == 0) goto L_0x0031
            java.util.Set r0 = r0.A0n
            if (r0 == 0) goto L_0x0031
            int r0 = r0.size()
            r1 = 1
            if (r0 > 0) goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            int r4 = r5.A00
            android.content.Context r3 = r5.A0m
            r0 = 0
            X.0qQ.A0B(r3, r0)
            if (r1 == 0) goto L_0x0061
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r1 = r0 * 2
        L_0x0049:
            int r2 = X.0nA.A08(r3)
            int r0 = X.0nA.A09(r3)
            int r0 = r0 - r1
            float r1 = (float) r0
            r0 = 1058013184(0x3f100000, float:0.5625)
            float r1 = r1 / r0
            int r0 = (int) r1
            if (r0 <= r2) goto L_0x005a
            r0 = r2
        L_0x005a:
            int r2 = r2 - r0
            int r0 = r2 / 2
            int r4 = r4 + r0
            r5.A00 = r4
            return
        L_0x0061:
            r1 = 0
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3K2.A0J():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01af, code lost:
        if (r0 != null) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0K(float r22) {
        /*
            r21 = this;
            r3 = r21
            android.graphics.RectF r1 = r3.A02
            if (r1 == 0) goto L_0x0185
            boolean r0 = r3.A0j
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x01f3
            float r1 = r1.height()
            float r1 = r1 * r4
            int r0 = r3.A0b
        L_0x0013:
            float r0 = (float) r0
            float r1 = r1 / r0
            r2 = r22
            double r11 = (double) r2
            r13 = 0
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = (double) r1
            float r0 = r3.A0W
            double r0 = (double) r0
            r19 = r0
            r17 = r5
            double r0 = X.AnonymousClass37Q.A04(r11, r13, r15, r17, r19)
            float r5 = (float) r0
            boolean r0 = java.lang.Float.isNaN(r5)
            if (r0 == 0) goto L_0x01e5
            r5 = 0
        L_0x0030:
            android.view.ViewGroup r0 = r3.A0p
            int r0 = r0.getWidth()
            float r8 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r1
            int r0 = r3.A0b
            float r6 = (float) r0
            float r6 = r6 / r1
            android.graphics.RectF r0 = r3.A02
            float r1 = r0.centerX()
            android.graphics.RectF r0 = r3.A02
            float r7 = r0.centerY()
            float r1 = r1 - r8
            float r7 = r7 - r6
            android.view.ViewGroup r10 = r3.A0q
            float r0 = r10.getTranslationY()
            float r7 = r7 - r0
            double r8 = (double) r1
            float r0 = r3.A0X
            double r0 = (double) r0
            r19 = r0
            r17 = r8
            double r0 = X.AnonymousClass37Q.A04(r11, r13, r15, r17, r19)
            float r6 = (float) r0
            double r7 = (double) r7
            float r0 = r3.A0Y
            double r0 = (double) r0
            r19 = r0
            r17 = r7
            double r0 = X.AnonymousClass37Q.A04(r11, r13, r15, r17, r19)
            float r7 = (float) r0
            float r9 = r3.A0Z
            float r0 = r4 - r9
            float r0 = r0 * r22
            float r9 = r9 + r0
            java.lang.Integer r0 = r3.A0S
            java.lang.Integer r8 = X.AnonymousClass05K.A0Y
            if (r0 != r8) goto L_0x00bf
            X.3BQ r1 = r3.A0H
            com.instagram.model.reels.Reel r0 = r3.A0E
            boolean r0 = r3.A0Q(r0, r1)
            if (r0 == 0) goto L_0x00bf
            com.instagram.model.reels.Reel r0 = r3.A0E
            if (r0 == 0) goto L_0x0193
            boolean r0 = r0.A0c()
            if (r0 == 0) goto L_0x0193
            X.6Ji r0 = r3.A07()
            if (r0 == 0) goto L_0x0193
            X.6Ji r0 = r3.A07()
            X.6Yf r0 = r0.A02
            if (r0 == 0) goto L_0x0193
            X.6Ji r0 = r3.A07()
            X.6Yf r0 = r0.A02
        L_0x00a2:
            boolean r0 = r0.A0l
            if (r0 == 0) goto L_0x00bf
            float r1 = r4 - r22
            float r0 = r3.A0Z
            float r1 = r1 * r0
            android.view.View r0 = r3.A01()
            r0.setScaleX(r5)
            r0.setScaleY(r5)
            r0.setTranslationX(r6)
            r0.setTranslationY(r7)
            r0.setAlpha(r1)
            r9 = r2
        L_0x00bf:
            r3.A0L(r5, r6, r7, r9)
            X.6kx r0 = r3.A0N
            if (r0 == 0) goto L_0x00de
            com.instagram.common.session.UserSession r6 = r3.A0u
            X.0Tu r5 = X.0Tu.A05
            r0 = 36327361671149951(0x810f8b0009397f, double:3.0369080271549904E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x00de
            X.6kx r0 = r3.A0N
            X.6lA r0 = r0.A1e
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.A1M
            r0.setAlpha(r2)
        L_0x00de:
            r1 = 0
            int r0 = r3.A0a
            int r0 = X.0nH.A02(r2, r1, r0)
            r10.setBackgroundColor(r0)
            X.3N2 r0 = r3.A0L
            if (r0 == 0) goto L_0x00ef
            r0.CI9(r2)
        L_0x00ef:
            android.graphics.RectF r0 = r3.A01
            if (r0 == 0) goto L_0x0171
            android.graphics.RectF r0 = r3.A0c
            if (r0 == 0) goto L_0x0171
            float r0 = r0.width()
            int r1 = (int) r0
            android.graphics.RectF r0 = r3.A01
            float r0 = r0.width()
            double r5 = (double) r0
            float r1 = (float) r1
            float r0 = r3.A0W
            float r1 = r1 * r0
            double r0 = (double) r1
            r19 = r0
            r17 = r5
            double r0 = X.AnonymousClass37Q.A04(r11, r13, r15, r17, r19)
            float r6 = (float) r0
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r5 = r3.A0v
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            int r0 = r0.width
            float r0 = (float) r0
            float r6 = r6 / r0
            boolean r0 = java.lang.Float.isNaN(r6)
            if (r0 == 0) goto L_0x0122
            r6 = 0
        L_0x0122:
            boolean r0 = java.lang.Float.isInfinite(r6)
            if (r0 == 0) goto L_0x0129
            r6 = 0
        L_0x0129:
            r5.setScaleX(r6)
            r5.setScaleY(r6)
            r0 = 0
            r5.setPivotX(r0)
            r5.setPivotY(r0)
            android.graphics.RectF r0 = r3.A01
            float r0 = r0.left
            double r6 = (double) r0
            android.graphics.RectF r0 = r3.A0c
            float r0 = r0.left
            double r0 = (double) r0
            r19 = r0
            r17 = r6
            double r0 = X.AnonymousClass37Q.A04(r11, r13, r15, r17, r19)
            float r6 = (float) r0
            r5.setTranslationX(r6)
            android.graphics.RectF r0 = r3.A01
            float r1 = r0.top
            float r0 = r10.getTranslationY()
            float r1 = r1 - r0
            double r6 = (double) r1
            android.graphics.RectF r0 = r3.A0c
            float r1 = r0.top
            java.lang.Integer r0 = r3.A0S
            if (r0 == r8) goto L_0x018e
            java.lang.Integer r8 = X.AnonymousClass05K.A0N
            if (r0 == r8) goto L_0x018e
            r0 = 0
        L_0x0163:
            float r1 = r1 - r0
            double r0 = (double) r1
            r19 = r0
            r17 = r6
            double r6 = X.AnonymousClass37Q.A04(r11, r13, r15, r17, r19)
            float r0 = (float) r6
            r5.setTranslationY(r0)
        L_0x0171:
            X.G7i r0 = r3.A0J
            if (r0 == 0) goto L_0x0186
            r0.DaE(r2)
        L_0x0178:
            android.view.View r1 = r3.A0n
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0185
            float r4 = r4 - r22
            r1.setAlpha(r4)
        L_0x0185:
            return
        L_0x0186:
            X.6WJ r0 = r3.A0K
            if (r0 == 0) goto L_0x0178
            r0.DaE(r2)
            goto L_0x0178
        L_0x018e:
            float r0 = r10.getTranslationY()
            goto L_0x0163
        L_0x0193:
            com.instagram.model.reels.Reel r0 = r3.A0E
            if (r0 == 0) goto L_0x01cf
            boolean r1 = r0.A0d()
            if (r1 != 0) goto L_0x00bf
            boolean r1 = r0.CcK()
            if (r1 == 0) goto L_0x01b3
            X.6Yd r0 = r3.A0D()
            if (r0 == 0) goto L_0x00bf
            X.6Yd r0 = r3.A0D()
            X.6Yf r0 = r0.A04
            if (r0 == 0) goto L_0x00bf
            goto L_0x00a2
        L_0x01b3:
            boolean r0 = r0.A0m()
            if (r0 == 0) goto L_0x01cf
            X.Mqa r0 = r3.A0B()
            if (r0 == 0) goto L_0x00bf
            X.Mqa r0 = r3.A0B()
            X.6Yf r0 = r0.A08
            if (r0 == 0) goto L_0x00bf
            X.Mqa r0 = r3.A0B()
            X.6Yf r0 = r0.A08
            goto L_0x00a2
        L_0x01cf:
            X.6kx r0 = r3.A09()
            if (r0 == 0) goto L_0x00bf
            X.6kx r0 = r3.A09()
            X.6Yf r0 = r0.A0C
            if (r0 == 0) goto L_0x00bf
            X.6kx r0 = r3.A09()
            X.6Yf r0 = r0.A0C
            goto L_0x00a2
        L_0x01e5:
            double r0 = (double) r5
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.max(r0, r13)
            double r0 = java.lang.Math.min(r0, r5)
            float r5 = (float) r0
            goto L_0x0030
        L_0x01f3:
            float r1 = r1.width()
            float r1 = r1 * r4
            android.view.ViewGroup r0 = r3.A0p
            int r0 = r0.getWidth()
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3K2.A0K(float):void");
    }

    private void A0M(RectF rectF, RectF rectF2, AnonymousClass0iw r10, C51914G7i g7i) {
        int A022 = AnonymousClass4EQ.A02(this.A0m);
        this.A0b = A022;
        this.A01 = rectF;
        float f = (float) A022;
        float width = (float) this.A0p.getWidth();
        if (rectF2 == null) {
            rectF2 = new RectF(0.0f, f, width, 2.0f * f);
        }
        this.A02 = rectF2;
        this.A0J = g7i;
        if (rectF != null) {
            rectF.height();
        }
        A0N(r10, (C255773uh) null);
        this.A0S = AnonymousClass05K.A0Y;
        this.A0q.setVisibility(0);
        A03(this).setVisibility(0);
        A03(this).setAlpha(1.0f);
        if (A0Q(this.A0E, this.A0H)) {
            A01().setVisibility(0);
            A01().setLayerType(2, (Paint) null);
            A01().setAlpha(0.0f);
        }
        View view = this.A0n;
        view.setVisibility(8);
        view.setAlpha(1.0f);
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = this.A0v;
        int i = 4;
        if (rectF != null) {
            i = 0;
        }
        reelAvatarWithBadgeView.setVisibility(i);
        this.A0o.setVisibility(4);
        if (182.A06(0Tu.A05, this.A0u, 36327361670953341L)) {
            A0K(1.0f);
            this.A00 = 1.0f;
            A0H();
            C14090Tph tph = this.A0r;
            tph.A05(this);
            tph.A06(this);
            tph.A09(0.0f);
            return;
        }
        2cs r2 = this.A0s;
        r2.A0B(this);
        A0K(1.0f);
        r2.A06 = true;
        r2.A08(1.0d, true);
        r2.A0A(this);
        r2.A07(0.0d);
        r2.A06(0.0d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0101, code lost:
        if (r53 != false) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0O(X.AnonymousClass0iw r48, X.C255773uh r49, X.C250973mM r50, float r51, int r52, boolean r53) {
        /*
            r47 = this;
            r2 = r47
            com.instagram.model.reels.Reel r5 = r2.A0E
            if (r5 == 0) goto L_0x004e
            boolean r3 = r5.A0d()
            r0 = r49
            r1 = r50
            if (r3 == 0) goto L_0x004f
            X.3BQ r3 = r2.A0H
            if (r3 == 0) goto L_0x004e
            X.6Jt r3 = r2.A08()
            if (r3 == 0) goto L_0x004e
            com.instagram.common.session.UserSession r8 = r2.A0u
            X.6Jt r7 = r2.A08()
            X.3BQ r6 = r2.A0H
            r3 = 1
            X.0qQ.A0B(r7, r3)
            r2 = 3
            X.0qQ.A0B(r0, r2)
            r2 = 4
            X.0qQ.A0B(r6, r2)
            r1.A0C = r3
            com.instagram.model.reels.Reel r2 = r1.A0H
            X.4gL r5 = r2.A0H
            X.6Yf r4 = new X.6Yf
            r4.<init>(r3)
            X.6mk r17 = X.C317116mk.A01
            java.lang.String r3 = "reel_animator"
            X.0xG r2 = new X.0xG
            r2.<init>(r3)
            r9 = r2
            r10 = r8
            r11 = r5
            r12 = r0
            r13 = r1
            r14 = r6
            r15 = r4
            r16 = r7
            X.JZP.A01(r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x004e:
            return
        L_0x004f:
            boolean r3 = r5.A0c()
            r21 = r52
            if (r3 == 0) goto L_0x0076
            X.6Ji r3 = r2.A06()
            if (r3 == 0) goto L_0x004e
            X.3BQ r3 = r2.A0H
            if (r3 == 0) goto L_0x004e
            com.instagram.common.session.UserSession r3 = r2.A0u
            X.6Ji r7 = r2.A06()
            int r8 = r1.A02(r3)
            X.3BQ r2 = r2.A0H
            r4 = r0
            r5 = r1
            r6 = r2
            r9 = r21
            X.C71102Occ.A02(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0076:
            boolean r3 = r5.CcK()
            if (r3 == 0) goto L_0x00a0
            X.6Yd r3 = r2.A0C()
            if (r3 == 0) goto L_0x004e
            X.3BQ r3 = r2.A0H
            if (r3 == 0) goto L_0x004e
            X.6Yd r10 = r2.A0C()
            com.instagram.common.session.UserSession r5 = r2.A0u
            X.2nJ r4 = r2.A0t
            com.instagram.model.reels.ReelViewerConfig r3 = r2.A0G
            X.3BQ r2 = r2.A0H
            int r11 = r1.A02(r5)
            r6 = r0
            r7 = r1
            r8 = r3
            r9 = r2
            r12 = r21
            X.C307066Or.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x00a0:
            boolean r3 = r5.A0m()
            r8 = r48
            if (r3 == 0) goto L_0x00d7
            X.Mqa r3 = r2.A0A()
            if (r3 == 0) goto L_0x004e
            com.instagram.common.session.UserSession r5 = r2.A0u
            X.Mqa r4 = r2.A0A()
            int r16 = r1.A02(r5)
            r3 = 1
            X.0qQ.A0B(r4, r3)
            r2 = 3
            X.0qQ.A0B(r0, r2)
            r2 = 6
            X.0qQ.A0B(r8, r2)
            X.6Yf r2 = new X.6Yf
            r2.<init>(r3)
            X.6n1 r15 = X.C317286n1.A01
            r9 = 0
            r10 = r5
            r11 = r0
            r12 = r1
            r13 = r2
            r14 = r4
            r17 = r21
            X.C306586Ms.A01(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x00d7:
            boolean r3 = r5.A1W
            if (r3 != 0) goto L_0x0186
            com.instagram.common.session.UserSession r4 = r2.A0u
            boolean r3 = X.AnonymousClass6WN.A00(r4, r5)
            if (r3 != 0) goto L_0x0186
            X.3BQ r10 = r2.A0H
            if (r10 == 0) goto L_0x004e
            X.6kx r9 = r2.A0N
            if (r9 == 0) goto L_0x004e
            com.instagram.model.reels.ReelViewerConfig r8 = r2.A0G
            int r20 = r1.A02(r4)
            com.instagram.model.reels.Reel r5 = r1.A0H
            boolean r7 = r5.A1a
            boolean r3 = r2.A0V
            if (r3 != 0) goto L_0x00ff
            com.instagram.model.reels.Reel r3 = r2.A0E
            boolean r3 = r3.A1O
            if (r3 == 0) goto L_0x0103
        L_0x00ff:
            r23 = 1
            if (r53 == 0) goto L_0x0105
        L_0x0103:
            r23 = 0
        L_0x0105:
            X.34Y r6 = r2.A0C
            X.2nJ r3 = r2.A0t
            r19 = r51
            r11 = r3
            r12 = r4
            r13 = r6
            r14 = r0
            r15 = r1
            r16 = r8
            r17 = r10
            r18 = r9
            r22 = r7
            X.C315686kL.A04(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.0Tu r1 = X.0Tu.A05
            r6 = 36322847659928100(0x810b7000002a24, double:3.0340533482818275E-306)
            boolean r1 = X.182.A06(r1, r4, r6)
            if (r1 == 0) goto L_0x004e
            X.3BQ r7 = r2.A0H
            r3 = 0
            X.0qQ.A0B(r7, r3)
            r8 = 0
            X.0sn r1 = X.0sn.A00
            java.lang.String r21 = ""
            X.0qQ.A0B(r1, r3)
            X.6d8 r6 = new X.6d8
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r19 = r8
            r20 = r8
            r22 = r8
            r23 = r8
            r24 = r8
            r25 = r8
            r26 = r8
            r27 = r8
            r28 = r8
            r29 = r8
            r30 = r8
            r31 = r8
            r32 = r8
            r33 = r8
            r34 = r8
            r35 = r8
            r36 = r8
            r37 = r8
            r38 = r1
            r39 = r1
            r40 = r8
            r41 = r8
            r42 = r8
            r43 = r3
            r44 = r3
            r45 = r3
            r46 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            X.6kx r1 = r2.A0N
            android.view.View r1 = r1.itemView
            X.C70340O2s.A00(r1, r4, r5, r0, r6)
            return
        L_0x0186:
            X.Ndy r6 = r2.A0P
            if (r6 != 0) goto L_0x01a2
            android.view.View r3 = r2.A0B
            if (r3 != 0) goto L_0x0198
            android.view.ViewGroup r4 = r2.A0q
            com.instagram.common.session.UserSession r3 = r2.A0u
            android.view.ViewGroup r3 = X.C70900OQs.A00(r4, r3)
            r2.A0B = r3
        L_0x0198:
            java.lang.Object r6 = r3.getTag()
            X.Ndy r6 = (X.C69061Ndy) r6
            r2.A0P = r6
            if (r6 == 0) goto L_0x004e
        L_0x01a2:
            X.3BQ r3 = r2.A0H
            if (r3 == 0) goto L_0x004e
            if (r6 != 0) goto L_0x01be
            android.view.View r3 = r2.A0B
            if (r3 != 0) goto L_0x01b6
            android.view.ViewGroup r4 = r2.A0q
            com.instagram.common.session.UserSession r3 = r2.A0u
            android.view.ViewGroup r3 = X.C70900OQs.A00(r4, r3)
            r2.A0B = r3
        L_0x01b6:
            java.lang.Object r6 = r3.getTag()
            X.Ndy r6 = (X.C69061Ndy) r6
            r2.A0P = r6
        L_0x01be:
            com.instagram.common.session.UserSession r5 = r2.A0u
            X.6a4 r4 = X.C309916a4.A01
            X.6mk r3 = X.C317116mk.A01
            X.PJU r14 = new X.PJU
            r14.<init>()
            X.3BQ r7 = r2.A0H
            r2 = 0
            X.0qQ.A0B(r6, r2)
            r2 = 2
            X.0qQ.A0B(r0, r2)
            r2 = 3
            X.0qQ.A0B(r4, r2)
            r2 = 4
            X.0qQ.A0B(r3, r2)
            r2 = 7
            X.0qQ.A0B(r7, r2)
            r2 = 8
            X.0qQ.A0B(r8, r2)
            r13 = 0
            r9 = r5
            r10 = r0
            r11 = r1
            r12 = r7
            r15 = r3
            r16 = r6
            r17 = r4
            X.C70900OQs.A01(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3K2.A0O(X.0iw, X.3uh, X.3mM, float, int, boolean):void");
    }

    public static void A0P(AnonymousClass0iw r5, C51914G7i g7i, AnonymousClass3K2 r7, AnonymousClass3N2 r8) {
        C51914G7i g7i2;
        RectF rectF;
        r7.A0L = r8;
        RectF rectF2 = null;
        if (r8 != null) {
            rectF2 = r8.AeG();
            rectF = new RectF(rectF2);
            rectF.inset(rectF.width() / 2.0f, rectF.height() / 2.0f);
            r7.A0L.CLE();
            g7i2 = new C50894FkQ(r5, g7i, r7);
        } else {
            g7i2 = g7i;
            rectF = null;
        }
        r7.A0M(rectF2, rectF, r5, g7i2);
    }

    private boolean A0Q(Reel reel, AnonymousClass3BQ r4) {
        if (reel == null || reel.A15(this.A0u) || reel.A0d() || r4 != AnonymousClass3BQ.IN_FEED_STORIES_TRAY) {
            return false;
        }
        return true;
    }

    public final void A0R() {
        Reel reel;
        Integer num = this.A0S;
        Integer num2 = AnonymousClass05K.A0C;
        if (num != num2) {
            A0I();
            A03(this).setAlpha(0.0f);
            this.A0n.setAlpha(0.0f);
            this.A0p.removeView(this.A0q);
            if (this.A0K != null) {
                this.A0K = null;
            }
            this.A0S = num2;
            AnonymousClass3BQ r0 = this.A0H;
            if (r0 != null) {
                UserSession userSession = this.A0u;
                if ((C315676kK.A01(userSession, r0) || ((reel = this.A0E) != null && reel.A0g())) && this.A0G.A0F) {
                    C317756nm.A04(this.A0l, userSession, !C61290mR.A07());
                }
            }
            C2366534o r2 = this.A12.A01;
            r2.A01.A05();
            C2366634p r1 = r2.A05;
            r1.A08((String) null);
            if (r2.A00) {
                r1.A05();
            }
        }
    }

    public final void A0S() {
        Integer num = this.A0S;
        Integer num2 = AnonymousClass05K.A00;
        if (num == num2 || A0Z()) {
            A03(this).setLayerType(0, (Paint) null);
            this.A0v.setLayerType(0, (Paint) null);
            this.A0o.setLayerType(0, (Paint) null);
            this.A0n.setLayerType(0, (Paint) null);
            UserSession userSession = this.A0u;
            if (182.A06(0Tu.A05, userSession, 36327361670953341L)) {
                C14090Tph tph = this.A0r;
                ArrayList arrayList = tph.A0B;
                int indexOf = arrayList.indexOf(this);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, (Object) null);
                }
                ArrayList arrayList2 = tph.A0A;
                int indexOf2 = arrayList2.indexOf(this);
                if (indexOf2 >= 0) {
                    arrayList2.set(indexOf2, (Object) null);
                }
                this.A00 = 0.0f;
            } else {
                2cs r3 = this.A0s;
                r3.A0B(this);
                r3.A08(0.0d, true);
            }
            A03(this).setAlpha(0.0f);
            A0E();
            this.A0p.removeView(this.A0q);
            AnonymousClass6WJ r1 = this.A0K;
            if (r1 != null && this.A0S == num2) {
                r1.onCancel();
            }
            this.A0K = null;
            C317756nm.A04(this.A0l, userSession, !C61290mR.A07());
        }
    }

    public final void A0W(RectF rectF, RectF rectF2, AnonymousClass0iw r3, C51914G7i g7i) {
        this.A0I = g7i;
        A0M(rectF, rectF2, r3, g7i);
    }

    public final void A0X(AnonymousClass0iw r4) {
        A0W(this.A01, this.A02, r4, new C19486WaY(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (A0Q(r9, r7) == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0254, code lost:
        if (X.2PP.A00(r5.A0w, r9.CCd()) == false) goto L_0x0256;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Y(X.AnonymousClass0iw r30, com.instagram.model.reels.Reel r31, X.C255773uh r32, X.C250973mM r33, X.AnonymousClass3BQ r34, float r35, float r36, float r37, int r38, boolean r39, boolean r40) {
        /*
            r29 = this;
            r5 = r29
            java.lang.Integer r1 = r5.A0S
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x01a3
            r4 = r33
            com.instagram.model.reels.Reel r9 = r4.A0H
            com.instagram.common.session.UserSession r3 = r5.A0u
            boolean r0 = r9.A16(r3)
            r7 = r34
            if (r0 == 0) goto L_0x001f
            boolean r1 = r5.A0Q(r9, r7)
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            if (r1 != 0) goto L_0x0021
        L_0x001f:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0021:
            r5.A0Z = r0
            r5.A0H = r7
            r5.A0E = r9
            r0 = r31
            r5.A0D = r0
            r13 = r32
            r5.A0F = r13
            r0 = r35
            r5.A0X = r0
            r0 = r36
            r5.A0Y = r0
            r0 = r37
            r5.A0W = r0
            r0 = r38
            r5.A0a = r0
            r0 = r39
            r5.A0T = r0
            r0 = r40
            r5.A0U = r0
            android.content.Context r6 = r5.A0m
            boolean r0 = X.C316216lI.A0D(r6, r4)
            r2 = 0
            if (r0 == 0) goto L_0x028d
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.A0a = r0
            android.view.View r1 = A03(r5)
            r0 = 2131439628(0x7f0b300c, float:1.8501217E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x0064
            r0.setBackgroundColor(r2)
        L_0x0064:
            r5.A0F()
            android.view.ViewGroup r0 = r5.A0q
            android.view.View r8 = r0.getChildAt(r2)
            android.view.View r1 = A03(r5)
            if (r8 == r1) goto L_0x007d
            r0.removeViewAt(r2)
            android.view.View r1 = A03(r5)
            r0.addView(r1, r2)
        L_0x007d:
            int r19 = r4.A03(r3, r13)
            r8 = 0
            r11 = 1
            r15 = r30
            r14 = r5
            r16 = r13
            r17 = r4
            r18 = r8
            r20 = r11
            r14.A0O(r15, r16, r17, r18, r19, r20)
            int r1 = r5.A0a
            r0.setBackgroundColor(r1)
            com.instagram.model.reels.Reel r1 = r5.A0E
            boolean r1 = r5.A0Q(r1, r7)
            if (r1 == 0) goto L_0x0288
            X.3uh r7 = r9.A09(r3)
            android.view.View r10 = r0.getChildAt(r11)
            android.view.View r1 = r5.A01()
            if (r10 == r1) goto L_0x00be
            android.view.View r10 = r0.getChildAt(r11)
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r1 = r5.A0v
            if (r10 == r1) goto L_0x00b7
            r0.removeViewAt(r11)
        L_0x00b7:
            android.view.View r1 = r5.A01()
            r0.addView(r1, r11)
        L_0x00be:
            if (r7 == 0) goto L_0x0119
            int r26 = r4.A03(r3, r7)
            com.instagram.model.reels.Reel r1 = r5.A0E
            if (r1 == 0) goto L_0x0119
            boolean r10 = r1.A0c()
            r1 = 4
            if (r10 == 0) goto L_0x01ab
            X.6Ji r10 = r5.A07()
            if (r10 == 0) goto L_0x01ab
            X.6Ji r9 = r5.A07()
            X.3BQ r10 = r5.A0H
            if (r10 == 0) goto L_0x00f2
            int r21 = r4.A02(r3)
            X.3BQ r10 = r5.A0H
            r16 = r3
            r17 = r7
            r18 = r4
            r19 = r10
            r20 = r9
            r22 = r26
            X.C71102Occ.A02(r16, r17, r18, r19, r20, r21, r22)
        L_0x00f2:
            X.0eM r3 = r9.A0F
            java.lang.Object r3 = r3.getValue()
            android.view.View r3 = (android.view.View) r3
            r3.setVisibility(r1)
            X.0eM r3 = r9.A0D
            java.lang.Object r3 = r3.getValue()
            X.0qQ.A07(r3)
            android.view.View r3 = (android.view.View) r3
            r3.setVisibility(r1)
            X.0eM r3 = r9.A0M
            java.lang.Object r3 = r3.getValue()
            X.0qQ.A07(r3)
            android.view.View r3 = (android.view.View) r3
        L_0x0116:
            r3.setVisibility(r1)
        L_0x0119:
            android.graphics.RectF r1 = r5.A01
            if (r1 == 0) goto L_0x0120
            r1.height()
        L_0x0120:
            r5.A0N(r15, r13)
            X.6kx r1 = r5.A0N
            if (r1 == 0) goto L_0x01a6
            X.6lA r1 = r1.A1e
            android.view.View r1 = r1.A11
            if (r1 == 0) goto L_0x01a6
            android.view.ViewGroup r3 = r5.A0o
            r1 = 4
        L_0x0130:
            r3.setVisibility(r1)
            r0.setVisibility(r2)
            android.view.View r1 = A03(r5)
            r1.setVisibility(r2)
            android.view.View r1 = A03(r5)
            r7 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r7)
            android.view.View r1 = r5.A0n
            r1.setAlpha(r8)
            android.view.ViewGroup r9 = r5.A0p
            r9.addView(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r5.A0S = r0
            float r2 = r5.A0W
            float r1 = r5.A0X
            float r0 = r5.A0Y
            r5.A0L(r2, r1, r0, r7)
            android.view.View r1 = r5.A02()
            r0 = 0
            if (r1 == 0) goto L_0x01a4
            android.view.View r1 = r5.A02()
            android.graphics.RectF r1 = X.0nA.A0F(r1)
        L_0x016c:
            r5.A0c = r1
            X.6kx r1 = r5.A0N
            if (r1 == 0) goto L_0x0182
            X.6lA r1 = r1.A1e
            android.view.View r1 = r1.A11
            if (r1 == 0) goto L_0x0182
            android.graphics.RectF r0 = X.0nA.A01
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            X.0nA.A0L(r0, r1)
        L_0x0182:
            r5.A0d = r0
            android.graphics.RectF r3 = r5.A02
            int r0 = r5.A0b
            float r2 = (float) r0
            int r0 = r9.getWidth()
            float r1 = (float) r0
            if (r3 != 0) goto L_0x0198
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r2
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r8, r2, r1, r0)
        L_0x0198:
            r5.A02 = r3
            boolean r0 = X.C316216lI.A0D(r6, r4)
            r5.A0j = r0
            r5.A0K(r7)
        L_0x01a3:
            return
        L_0x01a4:
            r1 = r0
            goto L_0x016c
        L_0x01a6:
            android.view.ViewGroup r3 = r5.A0o
            r1 = 8
            goto L_0x0130
        L_0x01ab:
            com.instagram.model.reels.Reel r12 = r5.A0E
            boolean r10 = r12.CcK()
            if (r10 == 0) goto L_0x01f1
            X.6Yd r12 = r5.A0D()
            if (r12 == 0) goto L_0x0119
            X.3BQ r11 = r5.A0H
            if (r11 == 0) goto L_0x0119
            X.2nJ r10 = r5.A0t
            com.instagram.model.reels.ReelViewerConfig r9 = r5.A0G
            int r23 = r4.A02(r3)
            r16 = r10
            r17 = r3
            r18 = r7
            r19 = r4
            r20 = r9
            r21 = r11
            r22 = r12
            r24 = r26
            X.C307066Or.A03(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.6PA r3 = r12.A0Y
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r3 = r3.A00
            r3.setVisibility(r1)
            X.6PB r7 = r12.A0X
            android.view.View r3 = r7.A06
            r3.setVisibility(r1)
            android.view.View r3 = r7.A07
            r3.setVisibility(r1)
            X.6Os r3 = r12.A06
            android.widget.LinearLayout r3 = r3.A01
            goto L_0x0116
        L_0x01f1:
            boolean r10 = r12.A0m()
            if (r10 == 0) goto L_0x022a
            X.Mqa r10 = r5.A0B()
            X.Mqa r9 = r5.A0A()
            if (r9 == 0) goto L_0x0224
            X.Mqa r12 = r5.A0A()
            int r23 = r4.A02(r3)
            X.0qQ.A0B(r12, r11)
            X.6Yf r9 = new X.6Yf
            r9.<init>(r11)
            X.6n1 r22 = X.C317286n1.A01
            r16 = 0
            r17 = r3
            r18 = r7
            r19 = r4
            r20 = r9
            r21 = r12
            r24 = r26
            X.C306586Ms.A01(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x0224:
            if (r10 == 0) goto L_0x0119
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r3 = r10.A0a
            goto L_0x0116
        L_0x022a:
            X.6kx r10 = r5.A09()
            X.6kx r11 = r5.A09()
            if (r11 == 0) goto L_0x0271
            X.3BQ r11 = r5.A0H
            if (r11 == 0) goto L_0x0271
            X.6kx r23 = r5.A09()
            com.instagram.model.reels.ReelViewerConfig r14 = r5.A0G
            X.3BQ r12 = r5.A0H
            int r25 = r4.A02(r3)
            X.1Ns r9 = r9.A0W
            if (r9 == 0) goto L_0x0256
            com.instagram.user.model.User r11 = r5.A0w
            com.instagram.user.model.User r9 = r9.CCd()
            boolean r9 = X.2PP.A00(r11, r9)
            r27 = 1
            if (r9 != 0) goto L_0x0258
        L_0x0256:
            r27 = 0
        L_0x0258:
            X.34Y r11 = r5.A0C
            X.2nJ r9 = r5.A0t
            r28 = r2
            r21 = r14
            r22 = r12
            r24 = r8
            r19 = r7
            r20 = r4
            r17 = r3
            r18 = r11
            r16 = r9
            X.C315686kL.A04(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x0271:
            if (r10 == 0) goto L_0x0119
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r3 = r10.A1r
            r3.setVisibility(r1)
            android.view.View r3 = r10.A0R
            r3.setVisibility(r1)
            android.view.View r3 = r10.A0T
            r3.setVisibility(r1)
            X.6lA r3 = r10.A1e
            androidx.constraintlayout.widget.ConstraintLayout r3 = r3.A1M
            goto L_0x0116
        L_0x0288:
            r5.A0E()
            goto L_0x0119
        L_0x028d:
            X.0Tu r8 = X.0Tu.A05
            r0 = 36327361671018878(0x810f8b0007397e, double:3.036908027072099E-306)
            boolean r0 = X.182.A06(r8, r3, r0)
            if (r0 == 0) goto L_0x0064
            r0 = 2131100378(0x7f0602da, float:1.7813136E38)
            int r0 = r6.getColor(r0)
            r5.A0a = r0
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3K2.A0Y(X.0iw, com.instagram.model.reels.Reel, X.3uh, X.3mM, X.3BQ, float, float, float, int, boolean, boolean):void");
    }

    public final boolean A0Z() {
        if (this.A0S == AnonymousClass05K.A0N) {
            return true;
        }
        return false;
    }

    public final boolean A0a() {
        Integer num = this.A0S;
        if (num == AnonymousClass05K.A0C || num == AnonymousClass05K.A0j) {
            return false;
        }
        return true;
    }

    public final void DmE(2cs r5) {
        0lp A002 = 0lq.A00("ReelViewerAnimator.onSpringUpdate");
        try {
            A0K((float) r5.A09.A00);
            A002.close();
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r0v24, types: [X.2nJ, java.lang.Object, X.Xzx] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.Tph, X.To3] */
    public AnonymousClass3K2(Activity activity, ViewGroup viewGroup, UserSession userSession, String str) {
        this.A0l = activity;
        this.A0x = str;
        Context context = viewGroup.getContext();
        this.A0m = context;
        this.A0u = userSession;
        this.A0w = AnonymousClass0t1.A01.A01(userSession);
        AnonymousClass0eM r0 = 2Su.A0B;
        ViewGroup viewGroup2 = (ViewGroup) 2Su.A01(LayoutInflater.from(context), (ViewGroup.LayoutParams) null, viewGroup, R.layout.layout_reel_viewer_animator, false, false);
        this.A0q = viewGroup2;
        Resources resources = context.getResources();
        this.A11 = resources;
        this.A0z = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A10 = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A0k = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(2132017214, new int[]{16842997});
        this.A0y = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.A12 = C2366334m.A00(userSession);
        obtainStyledAttributes.recycle();
        A0J();
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_reel_shadow_gradient, viewGroup, false);
        this.A0n = inflate;
        viewGroup2.addView(inflate);
        viewGroup2.bringChildToFront(inflate);
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = (ReelAvatarWithBadgeView) viewGroup2.requireViewById(R.id.animated_profile_picture);
        this.A0v = reelAvatarWithBadgeView;
        reelAvatarWithBadgeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.A0o = (ViewGroup) viewGroup2.requireViewById(R.id.animated_comment_bar);
        ? obj = new Object();
        obj.A00 = userSession;
        this.A0t = obj;
        this.A0C = new AnonymousClass34Y();
        this.A0p = viewGroup;
        2cs A022 = C61340me.A00().A02();
        A022.A09(C59681JTn.A00);
        this.A0s = A022;
        0Tu r6 = 0Tu.A05;
        float floatValue = Double.valueOf(182.A00(r6, userSession, 37171786601202220L)).floatValue();
        floatValue = floatValue <= 0.0f ? 1500.0f : floatValue;
        C14002To4 to4 = new C14002To4();
        to4.A01(Double.valueOf(182.A00(r6, userSession, 37171786601005611L)).floatValue());
        to4.A02(floatValue);
        ? to3 = new C14001To3(this);
        to3.A01 = null;
        to3.A00 = Float.MAX_VALUE;
        to3.A02 = false;
        to3.A01 = to4;
        to3.A01 = 0.0f;
        to3.A00 = 1.0f;
        to3.A02 = 0.01f;
        to3.A03(0.01f * 0.75f);
        this.A0r = to3;
    }

    public static AnonymousClass3K2 A04(Activity activity) {
        while (activity.getParent() != null) {
            activity = activity.getParent();
        }
        View findViewById = activity.findViewById(16908290);
        if (findViewById != null) {
            return (AnonymousClass3K2) findViewById.getTag(R.id.reel_viewer_animator);
        }
        return null;
    }

    public static AnonymousClass3K2 A05(Activity activity, ViewGroup viewGroup, UserSession userSession) {
        AnonymousClass3K2 r2 = (AnonymousClass3K2) viewGroup.getTag(R.id.reel_viewer_animator);
        if (r2 != null) {
            return r2;
        }
        String obj = UUID.randomUUID().toString();
        AnonymousClass3K2 r22 = new AnonymousClass3K2(activity, viewGroup, userSession, obj);
        viewGroup.setTag(R.id.reel_viewer_animator, r22);
        A13.put(obj, r22);
        return r22;
    }

    private void A0H() {
        View view;
        if (A02() != null) {
            View A022 = A02();
            int i = 0;
            if (this.A01 != null) {
                i = 4;
            }
            A022.setVisibility(i);
        }
        C316006kx r0 = this.A0N;
        if (r0 != null && (view = r0.A1e.A11) != null) {
            view.setVisibility(0);
        }
    }

    private void A0L(float f, float f2, float f3, float f4) {
        View A032 = A03(this);
        A032.setScaleX(f);
        A032.setScaleY(f);
        A032.setTranslationX(f2);
        A032.setTranslationY(f3);
        A032.setAlpha(f4);
        View view = this.A0n;
        if (view.getVisibility() == 0) {
            view.setScaleX(f);
            view.setScaleY(f);
            view.setTranslationX(f2);
            view.setTranslationY(f3);
            view.setAlpha(1.0f);
        }
    }

    private void A0N(AnonymousClass0iw r6, C255773uh r7) {
        ImageUrl A072;
        1Ns r1;
        User CCd;
        if (A02() == null || (r7 != null && r7.A1B())) {
            this.A0v.setVisibility(8);
            return;
        }
        RectF rectF = this.A01;
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = this.A0v;
        if (rectF != null) {
            reelAvatarWithBadgeView.setLayoutParams(new FrameLayout.LayoutParams(Math.round(rectF.width()), Math.round(this.A01.height())));
            if (r7 != null) {
                Reel reel = this.A0E;
                if (reel != null && reel.A0g()) {
                    User user = r7.A0i;
                    if (user != null) {
                        A072 = user.Bh3();
                        reelAvatarWithBadgeView.A04(A072, r6);
                        reelAvatarWithBadgeView.setVisibility(0);
                        return;
                    }
                } else if (r7.A0B() == AnonymousClass3QO.OPAL) {
                    A072 = new SimpleImageUrl("");
                    Reel reel2 = this.A0E;
                    if (!(reel2 == null || (r1 = reel2.A0W) == null || (CCd = r1.CCd()) == null || CCd.A03.BYD() == null || this.A0E.A0W.CCd().A03.BYD().Bh8() == null)) {
                        Uri A032 = 0cp.A03(this.A0E.A0W.CCd().A03.BYD().Bh8());
                        0qQ.A0B(A032, 0);
                        A072 = C253833rU.A00(A032, -1, -1);
                    }
                    reelAvatarWithBadgeView.A04(A072, r6);
                    reelAvatarWithBadgeView.setVisibility(0);
                    return;
                }
            }
            Reel reel3 = this.A0E;
            if (!(reel3 == null || AnonymousClass6WN.A00(this.A0u, reel3) || this.A0E.A07() == null)) {
                A072 = this.A0E.A07();
                reelAvatarWithBadgeView.A04(A072, r6);
                reelAvatarWithBadgeView.setVisibility(0);
                return;
            }
        }
        reelAvatarWithBadgeView.setVisibility(4);
    }

    public final void A0U(RectF rectF, RectF rectF2, AnonymousClass0iw r16, Reel reel, AnonymousClass3BQ r18, AnonymousClass6WJ r19, String str, List list, int i, boolean z) {
        A0V(rectF, rectF2, r16, reel, r18, r19, str, list, Collections.emptySet(), 0.0f, i, z);
    }

    public final void CvG(C14001To3 to3, float f, float f2, boolean z) {
        A0G();
    }

    public final void DmB(2cs r1) {
        A0H();
    }

    public final void DmC(2cs r1) {
        A0G();
    }

    public final void CvP(C14001To3 to3, float f, float f2) {
        A0K(f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        if (A0Q(r3, r2) == false) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01bb A[Catch:{ all -> 0x0204, all -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01d3 A[Catch:{ all -> 0x0204, all -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01d4 A[Catch:{ all -> 0x0204, all -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ee A[Catch:{ all -> 0x0204, all -> 0x0209 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0V(android.graphics.RectF r26, android.graphics.RectF r27, X.AnonymousClass0iw r28, com.instagram.model.reels.Reel r29, X.AnonymousClass3BQ r30, X.AnonymousClass6WJ r31, java.lang.String r32, java.util.List r33, java.util.Set r34, float r35, int r36, boolean r37) {
        /*
            r25 = this;
            java.lang.String r0 = "ReelViewerAnimator.animateReveal"
            X.0lp r17 = X.0lq.A00(r0)
            r6 = r25
            boolean r0 = r6.A0a()     // Catch:{ all -> 0x0204 }
            if (r0 != 0) goto L_0x0200
            r3 = r29
            if (r29 != 0) goto L_0x001b
            java.lang.String r1 = "ReelViewerAnimator#animateReveal called with null Reel"
            java.lang.String r0 = "reel must be non-null"
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x0204 }
            goto L_0x0200
        L_0x001b:
            X.34n r0 = r6.A12     // Catch:{ all -> 0x0204 }
            X.34o r0 = r0.A01     // Catch:{ all -> 0x0204 }
            X.34p r0 = r0.A01     // Catch:{ all -> 0x0204 }
            r4 = 0
            r0.A08(r4)     // Catch:{ all -> 0x0204 }
            X.2MD r0 = X.2MD.A01()     // Catch:{ all -> 0x0204 }
            r0.A07()     // Catch:{ all -> 0x0204 }
            android.content.Context r13 = r6.A0m     // Catch:{ all -> 0x0204 }
            int r0 = X.AnonymousClass4EQ.A02(r13)     // Catch:{ all -> 0x0204 }
            r6.A0b = r0     // Catch:{ all -> 0x0204 }
            r8 = 0
            r6.A0X = r8     // Catch:{ all -> 0x0204 }
            r6.A0Y = r8     // Catch:{ all -> 0x0204 }
            r7 = 1065353216(0x3f800000, float:1.0)
            r6.A0W = r7     // Catch:{ all -> 0x0204 }
            com.instagram.common.session.UserSession r5 = r6.A0u     // Catch:{ all -> 0x0204 }
            boolean r0 = r3.A16(r5)     // Catch:{ all -> 0x0204 }
            r2 = r30
            if (r0 == 0) goto L_0x0050
            boolean r1 = r6.A0Q(r3, r2)     // Catch:{ all -> 0x0204 }
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            if (r1 != 0) goto L_0x0052
        L_0x0050:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0052:
            r6.A0Z = r0     // Catch:{ all -> 0x0204 }
            r6.A0H = r2     // Catch:{ all -> 0x0204 }
            r6.A0E = r3     // Catch:{ all -> 0x0204 }
            r2 = -1
            r10 = 0
            X.3mM r11 = new X.3mM     // Catch:{ all -> 0x0204 }
            r0 = r34
            r11.<init>((com.instagram.common.session.UserSession) r5, (com.instagram.model.reels.Reel) r3, (java.util.Set) r0)     // Catch:{ all -> 0x0204 }
            com.instagram.model.reels.Reel r0 = r6.A0E     // Catch:{ all -> 0x0204 }
            r6.A0D = r0     // Catch:{ all -> 0x0204 }
            X.6VC r1 = X.AnonymousClass6VB.A00(r5)     // Catch:{ all -> 0x0204 }
            X.3BQ r0 = r6.A0H     // Catch:{ all -> 0x0204 }
            r16 = 0
            r3 = 1
            X.0qQ.A0B(r0, r3)     // Catch:{ all -> 0x0204 }
            java.lang.Integer r14 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0204 }
            X.AnonymousClass6VC.A05(r11, r0, r1, r14, r10)     // Catch:{ all -> 0x0204 }
            r0 = -2
            r1 = r36
            if (r1 != r0) goto L_0x0087
            r0 = r32
            if (r32 == 0) goto L_0x008c
            int r0 = r11.A04(r5, r0)     // Catch:{ all -> 0x0204 }
            r11.A0C(r5, r0)     // Catch:{ all -> 0x0204 }
            goto L_0x008c
        L_0x0087:
            if (r1 == r2) goto L_0x008c
            r11.A0C(r5, r1)     // Catch:{ all -> 0x0204 }
        L_0x008c:
            r0 = r33
            r11.A05 = r0     // Catch:{ all -> 0x0204 }
            android.view.ViewGroup r12 = r6.A0q     // Catch:{ all -> 0x0204 }
            android.view.View r1 = r12.getChildAt(r10)     // Catch:{ all -> 0x0204 }
            android.view.View r0 = A03(r6)     // Catch:{ all -> 0x0204 }
            if (r1 == r0) goto L_0x00a6
            r12.removeViewAt(r10)     // Catch:{ all -> 0x0204 }
            android.view.View r0 = A03(r6)     // Catch:{ all -> 0x0204 }
            r12.addView(r0, r10)     // Catch:{ all -> 0x0204 }
        L_0x00a6:
            android.view.View r0 = A03(r6)     // Catch:{ all -> 0x0204 }
            r2 = 2
            r0.setLayerType(r2, r4)     // Catch:{ all -> 0x0204 }
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r0 = r6.A0v     // Catch:{ all -> 0x0204 }
            r0.setLayerType(r2, r4)     // Catch:{ all -> 0x0204 }
            android.view.ViewGroup r9 = r6.A0o     // Catch:{ all -> 0x0204 }
            r9.setLayerType(r2, r4)     // Catch:{ all -> 0x0204 }
            android.view.View r1 = r6.A0n     // Catch:{ all -> 0x0204 }
            r0 = 8
            if (r37 == 0) goto L_0x00bf
            r0 = 0
        L_0x00bf:
            r1.setVisibility(r0)     // Catch:{ all -> 0x0204 }
            r1.setLayerType(r2, r4)     // Catch:{ all -> 0x0204 }
            r6.A0S = r14     // Catch:{ all -> 0x0204 }
            r12.setVisibility(r10)     // Catch:{ all -> 0x0204 }
            android.view.View r0 = A03(r6)     // Catch:{ all -> 0x0204 }
            r2 = 4
            r0.setVisibility(r2)     // Catch:{ all -> 0x0204 }
            r18 = r26
            r0 = r18
            r6.A01 = r0     // Catch:{ all -> 0x0204 }
            r0 = r27
            r6.A02 = r0     // Catch:{ all -> 0x0204 }
            r0 = r31
            r6.A0K = r0     // Catch:{ all -> 0x0204 }
            boolean r0 = X.C316216lI.A0D(r13, r11)     // Catch:{ all -> 0x0204 }
            r6.A0j = r0     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x00fd
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6.A0a = r0     // Catch:{ all -> 0x0204 }
            android.view.View r1 = A03(r6)     // Catch:{ all -> 0x0204 }
            r0 = 2131439628(0x7f0b300c, float:1.8501217E38)
            android.view.View r0 = r1.findViewById(r0)     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x0113
            r0.setBackgroundColor(r10)     // Catch:{ all -> 0x0204 }
            goto L_0x0113
        L_0x00fd:
            X.0Tu r14 = X.0Tu.A05     // Catch:{ all -> 0x0204 }
            r0 = 36327361671018878(0x810f8b0007397e, double:3.036908027072099E-306)
            boolean r0 = X.182.A06(r14, r5, r0)     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x0113
            r0 = 2131100378(0x7f0602da, float:1.7813136E38)
            int r0 = r13.getColor(r0)     // Catch:{ all -> 0x0204 }
            r6.A0a = r0     // Catch:{ all -> 0x0204 }
        L_0x0113:
            r6.A0F()     // Catch:{ all -> 0x0204 }
            com.instagram.model.reels.Reel r0 = r6.A0E     // Catch:{ all -> 0x0204 }
            boolean r0 = r0.A0d()     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x0189
            int r14 = r6.A10     // Catch:{ all -> 0x0204 }
        L_0x0120:
            boolean r0 = r6.A0j     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x0129
            int r0 = X.C316216lI.A01(r13)     // Catch:{ all -> 0x0204 }
            int r14 = r14 + r0
        L_0x0129:
            com.instagram.model.reels.Reel r0 = r6.A0E     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x0181
            boolean r0 = r0.A0d()     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x0181
            int r0 = r6.A00     // Catch:{ all -> 0x0204 }
        L_0x0135:
            int r15 = r6.A0y     // Catch:{ all -> 0x0204 }
            int r13 = r14 + r15
            int r15 = r15 + r0
            android.view.View r1 = r6.A02()     // Catch:{ all -> 0x0204 }
            if (r1 == 0) goto L_0x017f
            float r1 = (float) r14     // Catch:{ all -> 0x0204 }
            float r14 = (float) r0     // Catch:{ all -> 0x0204 }
            float r13 = (float) r13     // Catch:{ all -> 0x0204 }
            float r15 = (float) r15     // Catch:{ all -> 0x0204 }
            android.graphics.RectF r0 = new android.graphics.RectF     // Catch:{ all -> 0x0204 }
            r0.<init>(r1, r14, r13, r15)     // Catch:{ all -> 0x0204 }
        L_0x0149:
            r6.A0c = r0     // Catch:{ all -> 0x0204 }
            r6.A0d = r4     // Catch:{ all -> 0x0204 }
            X.3uh r1 = r11.A08(r5)     // Catch:{ all -> 0x0204 }
            if (r26 == 0) goto L_0x0156
            r18.height()     // Catch:{ all -> 0x0204 }
        L_0x0156:
            r13 = r28
            r6.A0N(r13, r1)     // Catch:{ all -> 0x0204 }
            android.view.ViewParent r0 = r12.getParent()     // Catch:{ all -> 0x0204 }
            if (r0 != 0) goto L_0x0174
            android.view.ViewGroup r15 = r6.A0p     // Catch:{ all -> 0x0204 }
            int r14 = r15.getWidth()     // Catch:{ all -> 0x0204 }
            int r0 = r6.A0b     // Catch:{ all -> 0x0204 }
            r15.addView(r12, r14, r0)     // Catch:{ all -> 0x0204 }
            int r0 = X.AnonymousClass4EQ.A01()     // Catch:{ all -> 0x0204 }
            float r0 = (float) r0     // Catch:{ all -> 0x0204 }
            r12.setTranslationY(r0)     // Catch:{ all -> 0x0204 }
        L_0x0174:
            X.6kx r0 = r6.A0N     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x018c
            X.6lA r0 = r0.A1e     // Catch:{ all -> 0x0204 }
            android.view.View r0 = r0.A11     // Catch:{ all -> 0x0204 }
            if (r0 != 0) goto L_0x018e
            goto L_0x018c
        L_0x017f:
            r0 = r4
            goto L_0x0149
        L_0x0181:
            int r1 = r6.A0k     // Catch:{ all -> 0x0204 }
            int r0 = X.C316216lI.A04(r13, r11)     // Catch:{ all -> 0x0204 }
            int r0 = r0 + r1
            goto L_0x0135
        L_0x0189:
            int r14 = r6.A0z     // Catch:{ all -> 0x0204 }
            goto L_0x0120
        L_0x018c:
            r2 = 8
        L_0x018e:
            r9.setVisibility(r2)     // Catch:{ all -> 0x0204 }
            int r0 = r11.A01     // Catch:{ all -> 0x0204 }
            r22 = r35
            r19 = r13
            r20 = r1
            r21 = r11
            r23 = r0
            r24 = r10
            r18 = r6
            r18.A0O(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0204 }
            r6.A0K(r8)     // Catch:{ all -> 0x0204 }
            android.view.View r0 = A03(r6)     // Catch:{ all -> 0x0204 }
            r0.setVisibility(r10)     // Catch:{ all -> 0x0204 }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x0204 }
            r0 = 36327361670953341(0x810f8b0006397d, double:3.0369080270306534E-306)
            boolean r0 = X.182.A06(r2, r5, r0)     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x01d4
            r6.A0H()     // Catch:{ all -> 0x0204 }
            r6.A00 = r8     // Catch:{ all -> 0x0204 }
            X.Tph r0 = r6.A0r     // Catch:{ all -> 0x0204 }
            r0.A05(r6)     // Catch:{ all -> 0x0204 }
            r0.A06(r6)     // Catch:{ all -> 0x0204 }
            r0.A09(r7)     // Catch:{ all -> 0x0204 }
        L_0x01cb:
            android.app.Activity r2 = r6.A0l     // Catch:{ all -> 0x0204 }
            boolean r0 = X.C61290mR.A07()     // Catch:{ all -> 0x0204 }
            if (r0 != 0) goto L_0x01e3
            goto L_0x01e1
        L_0x01d4:
            X.2cs r2 = r6.A0s     // Catch:{ all -> 0x0204 }
            r2.A06 = r3     // Catch:{ all -> 0x0204 }
            r2.A0A(r6)     // Catch:{ all -> 0x0204 }
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.A06(r0)     // Catch:{ all -> 0x0204 }
            goto L_0x01cb
        L_0x01e1:
            r16 = 1
        L_0x01e3:
            r0 = r16
            X.C317756nm.A05(r2, r5, r0)     // Catch:{ all -> 0x0204 }
            boolean r0 = X.2db.A09()     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x0200
            android.content.Context r1 = X.2Yn.A01(r2)     // Catch:{ all -> 0x0204 }
            r0 = 2130971271(0x7f040a87, float:1.7551276E38)
            int r0 = X.2Yu.A0H(r1, r0)     // Catch:{ all -> 0x0204 }
            int r0 = r1.getColor(r0)     // Catch:{ all -> 0x0204 }
            X.2db.A04(r2, r4, r0, r3)     // Catch:{ all -> 0x0204 }
        L_0x0200:
            r17.close()
            return
        L_0x0204:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0209 }
            throw r1
        L_0x0209:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3K2.A0V(android.graphics.RectF, android.graphics.RectF, X.0iw, com.instagram.model.reels.Reel, X.3BQ, X.6WJ, java.lang.String, java.util.List, java.util.Set, float, int, boolean):void");
    }
}
