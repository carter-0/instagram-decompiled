package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.listview.StickyHeaderListView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class GMC extends C249383je implements C252243on, AnonymousClass32U {
    public 1Xj A00;
    public C238133Ar A01;
    public DirectShareTarget A02;
    public boolean A03;
    public boolean A04;
    public StickyHeaderListView A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass0iw A08;
    public final UserSession A09;
    public final AnonymousClass2Ep A0A;
    public final C66912Mew A0B;
    public final C231332rR A0C;
    public final GMF A0D;
    public final C52012GBj A0E;

    public GMC(Context context, AnonymousClass0iw r11, UserSession userSession, C231332rR r13, C52012GBj gBj, Integer num, String str, String str2, String str3) {
        0eP r8;
        UserSession userSession2 = userSession;
        String str4 = str;
        C51972G9s.A1C(userSession, str4);
        this.A09 = userSession;
        AnonymousClass0iw r2 = r11;
        this.A08 = r11;
        this.A0C = r13;
        this.A0E = gBj;
        AnonymousClass3U9 A0N = 1bJ.A00(userSession).A0N(str4);
        this.A0A = A0N;
        this.A0B = AnonymousClass1pH.A00().E52(userSession);
        if (A0N != null) {
            AnonymousClass34S A002 = AnonymousClass48N.A00(this.A09, A0N);
            r8 = AnonymousClass7TE.A1L(A002.A00, A002.A01);
        } else {
            r8 = null;
        }
        this.A0D = new GMF(context, r2, userSession2, num, str4, str2, str3, r8);
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final void D6z(View view) {
        1Xj r0;
        C267324bN A042;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        IgTextView igTextView;
        IgTextView igTextView2;
        int i;
        GradientSpinnerAvatarView gradientSpinnerAvatarView;
        0qQ.A0B(view, 0);
        C52012GBj gBj = this.A0E;
        this.A06 = AnonymousClass7TF.A1V(gBj);
        this.A05 = (StickyHeaderListView) view.findViewById(R.id.sticky_header_list);
        if (!this.A06) {
            this.A01 = C238103Ao.A00((ViewGroup) view.findViewById(16908298));
        } else {
            if (gBj == null || (A042 = C52012GBj.A04(gBj)) == null) {
                r0 = null;
            } else {
                r0 = A042.A02;
            }
            this.A00 = r0;
        }
        GMF gmf = this.A0D;
        C56802ICz A002 = C56802ICz.A00(this, 8);
        ViewStub A0F = DbS.A0F(view, R.id.floating_send_stub);
        gmf.A01 = A002;
        0qQ.A0A(A0F);
        View inflate = A0F.inflate();
        gmf.A02 = inflate;
        IgImageView igImageView = null;
        if (inflate != null) {
            viewGroup = (ViewGroup) inflate.findViewById(R.id.button_container);
        } else {
            viewGroup = null;
        }
        gmf.A03 = viewGroup;
        View view2 = gmf.A02;
        if (view2 != null) {
            viewGroup2 = (ViewGroup) view2.findViewById(R.id.pill_container);
        } else {
            viewGroup2 = null;
        }
        gmf.A04 = viewGroup2;
        View view3 = gmf.A02;
        if (view3 != null) {
            igTextView = (IgTextView) view3.findViewById(R.id.send_cta);
        } else {
            igTextView = null;
        }
        gmf.A05 = igTextView;
        View view4 = gmf.A02;
        if (view4 != null) {
            igTextView2 = (IgTextView) view4.findViewById(R.id.sent_label);
        } else {
            igTextView2 = null;
        }
        gmf.A06 = igTextView2;
        int dimensionPixelSize = gmf.A0C.getResources().getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        IgTextView igTextView3 = gmf.A05;
        int i2 = 0;
        if (igTextView3 != null) {
            igTextView3.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, SN3.MAX_SIGNED_POWER_OF_TWO));
        }
        IgTextView igTextView4 = gmf.A06;
        if (igTextView4 != null) {
            igTextView4.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, SN3.MAX_SIGNED_POWER_OF_TWO));
        }
        IgTextView igTextView5 = gmf.A06;
        if (igTextView5 != null) {
            i = igTextView5.getMeasuredWidth();
        } else {
            i = 0;
        }
        IgTextView igTextView6 = gmf.A05;
        if (igTextView6 != null) {
            i2 = igTextView6.getMeasuredWidth();
        }
        gmf.A00 = i - i2;
        View view5 = gmf.A02;
        if (view5 != null) {
            view5.setBackgroundResource(R.drawable.bg_dark_grey_gradient);
        }
        View view6 = gmf.A02;
        if (view6 != null) {
            gradientSpinnerAvatarView = (GradientSpinnerAvatarView) view6.findViewById(R.id.avatar_image_view);
        } else {
            gradientSpinnerAvatarView = null;
        }
        gmf.A08 = gradientSpinnerAvatarView;
        View view7 = gmf.A02;
        if (view7 != null) {
            igImageView = (IgImageView) view7.findViewById(R.id.checkmark);
        }
        gmf.A07 = igImageView;
        0eP r02 = gmf.A0Q;
        if (r02 != null) {
            Object obj = r02.A01;
            GradientSpinnerAvatarView gradientSpinnerAvatarView2 = gmf.A08;
            if (obj == null) {
                if (gradientSpinnerAvatarView2 != null) {
                    gradientSpinnerAvatarView2.A0F((AnonymousClass9IV) null, gmf.A0H, (ImageUrl) r02.A00);
                }
            } else if (gradientSpinnerAvatarView2 != null) {
                gradientSpinnerAvatarView2.A0G((AnonymousClass9IV) null, gmf.A0H, (ImageUrl) r02.A00, (ImageUrl) obj);
            }
        }
        ViewGroup viewGroup3 = gmf.A03;
        if (viewGroup3 != null) {
            AnonymousClass3NG A0m = AnonymousClass7TE.A0m(viewGroup3);
            A0m.A0C = true;
            A0m.A07 = true;
            A0m.A04 = new C54310H7f(gmf, 2);
            A0m.A00();
        }
        1Xj r03 = this.A00;
        if (r03 != null) {
            A00(r03, gmf);
        }
        1Xj A012 = A01();
        if (A012 != null) {
            A00(A012, gmf);
        }
        this.A07 = true;
        A03(this.A04);
    }

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final /* synthetic */ void DhG(float f, float f2) {
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final 1Xj A01() {
        C231332rR r2;
        1Xj BPf;
        C267324bN A042;
        if (this.A06) {
            C52012GBj gBj = this.A0E;
            if (!(gBj == null || (A042 = C52012GBj.A04(gBj)) == null)) {
                return A042.A02;
            }
        } else {
            C238133Ar r0 = this.A01;
            if (r0 != null) {
                int B6L = r0.B6L();
                C238133Ar r02 = this.A01;
                if (r02 != null) {
                    int BLQ = r02.BLQ();
                    if (B6L <= BLQ) {
                        int i = 0;
                        1Xj r8 = null;
                        int i2 = 0;
                        while (true) {
                            C238133Ar r03 = this.A01;
                            if (r03 == null) {
                                break;
                            }
                            View A043 = C253923rd.A04((1Xj) null, r03, B6L);
                            if (!(A043 == null || (r2 = this.A0C) == null)) {
                                C238133Ar r04 = this.A01;
                                if (r04 != null) {
                                    int BCl = B6L - r04.BCl();
                                    if (BCl < r2.getCount()) {
                                        Object item = r2.getItem(BCl);
                                        if ((item instanceof 1Xl) && (BPf = ((1Xl) item).BPf()) != null) {
                                            if (r8 == null) {
                                                r8 = BPf;
                                            }
                                            int height = A043.getHeight();
                                            C238133Ar r05 = this.A01;
                                            if (r05 == null) {
                                                break;
                                            }
                                            ViewGroup CEd = r05.CEd();
                                            0qQ.A07(CEd);
                                            int A012 = C253923rd.A01(CEd, A043, this.A05);
                                            if (height != 0) {
                                                int i3 = A012 / height;
                                                if (A012 > i && i3 > i2) {
                                                    i = A012;
                                                    r8 = BPf;
                                                    i2 = i3;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (B6L == BLQ) {
                                return r8;
                            }
                            B6L++;
                        }
                    }
                }
            }
            0qQ.A0F("scrollingList");
            throw AnonymousClass00P.createAndThrow();
        }
        return null;
    }

    public final void A02(1Xj r2) {
        this.A00 = r2;
        if (r2 != null) {
            A00(r2, this.A0D);
        }
    }

    public final void A03(boolean z) {
        this.A04 = z;
        if (this.A07) {
            GMF gmf = this.A0D;
            View view = gmf.A02;
            if (!z) {
                if (view != null && view.getVisibility() == 0) {
                    AnonymousClass7TH.A0R(gmf.A02);
                    View view2 = gmf.A02;
                    if (view2 != null) {
                        view2.clearAnimation();
                    }
                    View view3 = gmf.A02;
                    if (view3 != null) {
                        view3.startAnimation(gmf.A0F);
                    }
                    ViewGroup viewGroup = gmf.A03;
                    if (viewGroup != null) {
                        viewGroup.startAnimation(gmf.A0G);
                    }
                }
                this.A00 = null;
                return;
            }
            if (view != null && view.getVisibility() == 8) {
                View view4 = gmf.A02;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
                View view5 = gmf.A02;
                if (view5 != null) {
                    view5.clearAnimation();
                }
                View view6 = gmf.A02;
                if (view6 != null) {
                    view6.startAnimation(gmf.A0D);
                }
                ViewGroup viewGroup2 = gmf.A03;
                if (viewGroup2 != null) {
                    viewGroup2.startAnimation(gmf.A0E);
                }
            }
            1Xj A012 = A01();
            this.A00 = A012;
            if (A012 != null) {
                A00(A012, gmf);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r2 <= 0) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DW8(int r2, int r3) {
        /*
            r1 = this;
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x000f
            com.instagram.model.direct.DirectShareTarget r0 = r1.A02
            if (r0 == 0) goto L_0x000b
            r0 = 1
            if (r2 > 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r1.A03(r0)
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GMC.DW8(int, int):void");
    }

    public final void onDestroyView() {
        GMF gmf = this.A0D;
        ViewGroup viewGroup = gmf.A03;
        if (viewGroup != null) {
            viewGroup.setOnClickListener((View.OnClickListener) null);
        }
        gmf.A03 = null;
        gmf.A04 = null;
        gmf.A08 = null;
        gmf.A02 = null;
        gmf.A01 = null;
    }

    public static void A00(1Xj r2, GMF gmf) {
        gmf.A02(r2.BR7(), r2.getId());
    }

    public final void DhU(Integer num) {
        1Xj A012;
        int A032 = AnonymousClass0fD.A03(-1705819912);
        if (this.A04 && (A012 = A01()) != null) {
            A00(A012, this.A0D);
            this.A00 = A012;
        }
        AnonymousClass0fD.A0A(-1409592954, A032);
    }

    public final void onScroll(C238133Ar r4, int i, int i2, int i3, int i4, int i5) {
        1Xj A012;
        int A032 = AnonymousClass0fD.A03(-1878729598);
        if (this.A04 && (A012 = A01()) != null) {
            A00(A012, this.A0D);
            this.A00 = A012;
        }
        AnonymousClass0fD.A0A(1431880248, A032);
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        AnonymousClass0fD.A0A(-933575057, AnonymousClass0fD.A03(-45584028));
    }
}
