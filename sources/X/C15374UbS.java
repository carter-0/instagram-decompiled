package X;

import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProduct;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.UbS  reason: case insensitive filesystem */
public final class C15374UbS extends AnonymousClass4DH implements C273494mf, XC8 {
    public static final String __redex_internal_original_name = "UpcomingEventBottomSheetFragment";
    public 2el A00;
    public C17719Vco A01;
    public XCE A02;
    public VU0 A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public CountDownTimer A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final AnonymousClass4DU A0C = C227942kP.A01("upcoming_event_bottom_sheet", true, true);
    public final AnonymousClass0eM A0D = A02(this, 23);
    public final AnonymousClass0eM A0E = A02(this, 24);
    public final AnonymousClass0eM A0F = A02(this, 25);
    public final AnonymousClass0eM A0G = A02(this, 26);
    public final AnonymousClass0eM A0H = A02(this, 27);
    public final AnonymousClass0eM A0I = C227642jf.A02(this);
    public final AnonymousClass0eM A0J = A02(this, 28);
    public final AnonymousClass0eM A0K = A02(this, 29);
    public final AnonymousClass0eM A0L = A02(this, 30);
    public final 1wn A0M = new C19222WQc(this, 3);
    public final 1wn A0N = new C19222WQc(this, 4);

    public final void A05() {
        String str;
        1Xj A002 = A00(this);
        if (A002 != null) {
            AnonymousClass0eM r3 = this.A0I;
            UserSession A0l = AnonymousClass7TE.A0l(r3);
            2EG r9 = 2EG.A47;
            AnonymousClass4DU r8 = this.A0C;
            Q03 q03 = new Q03(this, A0l, new C271794jb(AnonymousClass7TE.A0l(r3), A002), r8, r9);
            q03.A0J = A002;
            int i = -1;
            if (A002.A5D()) {
                i = 0;
            }
            q03.A09 = i;
            new Q02(q03).A02();
            UserSession A0l2 = AnonymousClass7TE.A0l(r3);
            String str2 = this.A05;
            if (str2 == null) {
                str = "priorModule";
            } else {
                C310306am r4 = new C310306am(r8, A0l2, str2);
                VU0 vu0 = this.A03;
                if (vu0 == null) {
                    str = "viewModel";
                } else {
                    UpcomingEvent upcomingEvent = vu0.A01.A00;
                    String id = A002.getId();
                    String str3 = this.A07;
                    if (str3 == null) {
                        str = "sourceOfAction";
                    } else {
                        r4.A04(upcomingEvent, id, C273654mx.A00(858), str3);
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A07() {
        String str;
        1Xj A002 = A00(this);
        String str2 = this.A04;
        if (this.A0B) {
            FragmentActivity requireActivity = requireActivity();
            UserSession A0l = AnonymousClass7TE.A0l(this.A0I);
            VU0 vu0 = this.A03;
            if (vu0 == null) {
                str = "viewModel";
            } else {
                C18382Vqi.A00(requireActivity, this, 28D.A5K, A0l, vu0.A01.A00);
                return;
            }
        } else if (A002 != null) {
            boolean CeS = A002.CeS();
            UserSession A0l2 = AnonymousClass7TE.A0l(this.A0I);
            if (CeS) {
                C243473Yx.A02(requireActivity(), this, 28D.A5K, A0l2, (ClipsCelebrationReshareViewModel) null, A002, (String) null, false);
                return;
            }
            FragmentActivity requireActivity2 = requireActivity();
            RectF rectF = new RectF();
            RectF rectF2 = new RectF();
            String str3 = this.A07;
            if (str3 == null) {
                str = "sourceOfAction";
            } else {
                FFV.A02(requireActivity2, rectF, rectF2, A0l2, (ClipsCelebrationReshareViewModel) null, A002, str3, (String) null, -1, false);
                return;
            }
        } else if (str2 != null && str2.length() > 0) {
            FFV.A03(requireActivity(), new RectF(0.0f, 0.0f, 0.0f, 0.0f), AnonymousClass7TE.A0l(this.A0I), str2, this.A0C.getModuleName());
            return;
        } else {
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D1a(String str, String str2, String str3, int i, int i2) {
    }

    public final void DZY(ULV ulv, Product product) {
    }

    public final /* synthetic */ void DZZ(View view, ULV ulv, ProductFeedItem productFeedItem, int i, int i2) {
    }

    public final void DZa(View view, ULV ulv, ProductFeedItem productFeedItem, int i, int i2) {
        AnonymousClass7TG.A1N(productFeedItem, view);
        ((C18661VwI) this.A0F.getValue()).A02(ulv, productFeedItem, (Long) null, (String) null, (String) null, i, i2);
    }

    public final /* synthetic */ void DZd(Product product, String str, String str2, int i, int i2) {
    }

    public final boolean DZe(ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    public final /* synthetic */ void DZf(String str, int i) {
    }

    public final void DZg(Product product, int i, int i2) {
    }

    public final void DZi(ULV ulv, ProductTile productTile, int i, int i2) {
        0qQ.A0B(productTile, 0);
        String str = null;
        C18591Vui A012 = ((C231142qw) AnonymousClass7TE.A14(this.A0H)).A01((1Xj) null, productTile);
        if (ulv != null) {
            str = ulv.A04;
        }
        A012.A08 = str;
        A012.A00();
    }

    public final boolean DZk(MotionEvent motionEvent, View view, ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    public final void DZl(Product product) {
    }

    public final void DZm(Product product) {
    }

    public final /* synthetic */ void DZn(String str) {
    }

    public final /* synthetic */ void DZo(Product product) {
    }

    public final void DuP(UnavailableProduct unavailableProduct, int i, int i2) {
    }

    public final void DuQ(ProductFeedItem productFeedItem) {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ImageUrl imageUrl;
        Integer num;
        int i;
        String str;
        String string;
        ImageInfo BGO;
        String str2;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        this.A01 = new C17719Vco(view2);
        AnonymousClass0eM r17 = this.A0I;
        UserSession A0l = AnonymousClass7TE.A0l(r17);
        C17719Vco vco = this.A01;
        if (vco == null) {
            str2 = "viewHolder";
        } else {
            VU0 vu0 = this.A03;
            if (vu0 == null) {
                str2 = "viewModel";
            } else {
                C18612Vv5 vv5 = (C18612Vv5) this.A0E.getValue();
                AnonymousClass7TF.A1D(A0l, 0, vv5);
                C17686VcH vcH = vu0.A01;
                C15374UbS ubS = vu0.A00;
                UpcomingEvent upcomingEvent = vcH.A00;
                1Xj r0 = vcH.A01;
                RoundedCornerLinearLayout roundedCornerLinearLayout = vco.A0D;
                IgImageView igImageView = vco.A0C;
                IgFrameLayout igFrameLayout = vco.A09;
                IgSimpleImageView igSimpleImageView = vco.A0A;
                if (r0 == null || (imageUrl = r0.A1Q()) == null) {
                    UpcomingEventMedia BPg = upcomingEvent.BPg();
                    if (BPg == null || (BGO = BPg.BGO()) == null) {
                        imageUrl = null;
                    } else {
                        imageUrl = 1iI.A03(BGO);
                    }
                }
                boolean z = true;
                if (r0 == null || !r0.CeS()) {
                    z = false;
                }
                if (z || imageUrl == null) {
                    roundedCornerLinearLayout.setVisibility(8);
                    igFrameLayout.setVisibility(0);
                    igSimpleImageView.setImageResource(R.drawable.instagram_calendar_pano_outline_24);
                } else {
                    igFrameLayout.setVisibility(8);
                    roundedCornerLinearLayout.setVisibility(0);
                    igImageView.setUrl(A0l, imageUrl, this);
                }
                TextView textView = vco.A07;
                if (C18810W3l.A0B(upcomingEvent)) {
                    num = AnonymousClass05K.A01;
                } else if (!C18810W3l.A0B(upcomingEvent)) {
                    num = AnonymousClass05K.A00;
                } else {
                    num = AnonymousClass05K.A0C;
                }
                if (num.intValue() != 1 || (string = textView.getContext().getString(2131976026)) == null) {
                    i = 8;
                } else {
                    textView.setText(string);
                    i = 0;
                }
                textView.setVisibility(i);
                vco.A06.setText(upcomingEvent.getTitle());
                TextView textView2 = vco.A05;
                textView2.setText(C17116VIm.A00(A0l, C61410nE.A00, upcomingEvent).A00(AnonymousClass7TE.A0S(textView2), Uy1.A04));
                View view3 = vco.A00;
                IgImageView igImageView2 = vco.A0B;
                boolean z2 = vcH.A07;
                C20698WxU wxU = new C20698WxU(ubS, 31);
                if (z2) {
                    igImageView2.setVisibility(0);
                    WB0.A00(view3, 37, wxU);
                } else {
                    igImageView2.setVisibility(8);
                }
                vco.A02.setVisibility(0);
                RecyclerView recyclerView = vco.A08;
                recyclerView.setAdapter(vv5.A00);
                vv5.A01(vu0);
                HC9 hc9 = (HC9) ubS.A0G.getValue();
                recyclerView.A15(hc9);
                hc9.A00 = recyclerView;
                VU0 vu02 = this.A03;
                if (vu02 != null) {
                    UpcomingEvent upcomingEvent2 = vu02.A01.A00;
                    String id = upcomingEvent2.getId();
                    boolean A0B2 = C18810W3l.A0B(upcomingEvent2);
                    0qQ.A0B(r17.getValue(), 1);
                    boolean z3 = !C18810W3l.A0D(upcomingEvent2, System.currentTimeMillis());
                    if (A0B2 && z3) {
                        0lg A0L2 = AnonymousClass7TF.A0L(r17, 0);
                        0qQ.A0B(id, 1);
                        1NY A0b = AnonymousClass7TG.A0b(A0L2);
                        A0b.A0K("upcoming_events/info/%s/", new Object[]{id});
                        1OC A0S = DbU.A0S(A0b, CGC.class, C45693D1s.class);
                        C15619Ufl.A00(A0S, upcomingEvent2, this, 25);
                        1ES.A03(A0S);
                    }
                    2el r02 = this.A00;
                    str = "viewpointManager";
                    if (r02 != null) {
                        Dba.A0z(view2, r02, this);
                        VU0 vu03 = this.A03;
                        if (vu03 != null) {
                            UpcomingEvent upcomingEvent3 = vu03.A01.A00;
                            String str3 = this.A04;
                            UserSession A0l2 = AnonymousClass7TE.A0l(r17);
                            String str4 = this.A05;
                            if (str4 == null) {
                                str = "priorModule";
                            } else {
                                String str5 = this.A07;
                                if (str5 == null) {
                                    str = "sourceOfAction";
                                } else {
                                    C15902UkQ ukQ = new C15902UkQ(this, A0l2, upcomingEvent3, str3, str4, str5);
                                    String id2 = upcomingEvent3.getId();
                                    if (id2 == null) {
                                        id2 = "";
                                    }
                                    AnonymousClass30Y A0a = DbU.A0a(ukQ, AnonymousClass30Y.A00(upcomingEvent3, C60340gF.A00, id2));
                                    2el r03 = this.A00;
                                    if (r03 != null) {
                                        r03.A05(view2, A0a);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                str = "viewModel";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final 1Xj A00(C15374UbS ubS) {
        String str = ubS.A04;
        if (str == null || str.length() <= 0) {
            return null;
        }
        return DbX.A0d(ubS.A0I).A02(ubS.A04);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        if (X.C18810W3l.A0D(r6, java.lang.System.currentTimeMillis()) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.VU0 A01(X.C15374UbS r17, com.instagram.user.model.UpcomingEvent r18) {
        /*
            r2 = r17
            X.0eM r0 = r2.A0I
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.1Xj r9 = A00(r2)
            boolean r4 = r2.A09
            r5 = 1
            X.0qQ.A0B(r3, r5)
            r6 = r18
            X.Cwd r1 = r6.AKf()
            X.6al r0 = new X.6al
            r0.<init>(r3)
            boolean r0 = r0.A01(r6)
            r1.A0E = r0
            com.instagram.user.model.UpcomingEvent r10 = r1.A00()
            java.lang.String r8 = r3.A06
            if (r9 == 0) goto L_0x009b
            com.instagram.user.model.User r0 = r9.A2A(r3)
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = r0.getId()
        L_0x0035:
            boolean r12 = X.0qQ.A0K(r8, r0)
            com.instagram.user.model.User r0 = r6.BZw()
            r7 = 0
            if (r0 == 0) goto L_0x004b
            java.lang.String r1 = r0.getId()
            int r0 = r1.length()
            if (r0 == 0) goto L_0x004b
            r7 = r1
        L_0x004b:
            boolean r13 = X.0qQ.A0K(r8, r7)
            boolean r0 = X.C18810W3l.A08(r6)
            if (r0 == 0) goto L_0x0060
            long r0 = java.lang.System.currentTimeMillis()
            boolean r0 = X.C18810W3l.A0D(r6, r0)
            r14 = 1
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r14 = 0
        L_0x0061:
            boolean r15 = X.C18810W3l.A07(r6)
            long r0 = java.lang.System.currentTimeMillis()
            boolean r16 = X.C18810W3l.A0D(r6, r0)
            boolean r17 = X.C18810W3l.A09(r6)
            if (r9 == 0) goto L_0x0098
            java.util.ArrayList r11 = r9.A3K(r5)
            if (r11 == 0) goto L_0x0098
        L_0x0079:
            r18 = 0
            if (r4 != 0) goto L_0x008d
            if (r9 == 0) goto L_0x008d
            boolean r0 = X.C243213Xw.A04(r3, r9)
            if (r0 == 0) goto L_0x008d
            boolean r0 = X.C243213Xw.A09(r9)
            if (r0 == 0) goto L_0x008d
            r18 = 1
        L_0x008d:
            X.VcH r8 = new X.VcH
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.VU0 r0 = new X.VU0
            r0.<init>(r2, r8)
            return r0
        L_0x0098:
            X.0sn r11 = X.0sn.A00
            goto L_0x0079
        L_0x009b:
            r0 = 0
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15374UbS.A01(X.UbS, com.instagram.user.model.UpcomingEvent):X.VU0");
    }

    public static AnonymousClass0eM A02(C15374UbS ubS, int i) {
        return AnonymousClass1YB.A00(new C20698WxU(ubS, i));
    }

    private final void A03(View view) {
        AnonymousClass0eM r1 = this.A0I;
        C238833Dp.A00(DbT.A0X(r1)).A0A(view, new C246153e7((AnonymousClass4HI) null, AnonymousClass7TE.A0l(r1), A00(this), this.A0C));
    }

    public static final void A04(C15374UbS ubS, UpcomingEvent upcomingEvent) {
        VU0 vu0 = ubS.A03;
        if (vu0 == null) {
            0qQ.A0F("viewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        vu0.A01.A00 = upcomingEvent;
        1Xj A002 = A00(ubS);
        if (A002 != null) {
            A002.AE7(DbT.A0X(ubS.A0I));
        }
        XCE xce = ubS.A02;
        if (xce != null) {
            xce.DdB();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06() {
        /*
            r18 = this;
            r1 = r18
            X.VU0 r0 = r1.A03
            java.lang.String r10 = "viewModel"
            r17 = 0
            if (r0 == 0) goto L_0x016a
            X.VcH r0 = r0.A01
            com.instagram.user.model.UpcomingEvent r4 = r0.A00
            X.0eM r6 = r1.A0I
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r0 = r1.A05
            java.lang.String r9 = "priorModule"
            if (r0 == 0) goto L_0x0166
            X.4DU r15 = r1.A0C
            X.6am r5 = new X.6am
            r5.<init>(r15, r2, r0)
            X.1Xj r0 = A00(r1)
            java.lang.String r3 = X.C51969G9p.A0u(r0)
            boolean r0 = r4.getReminderEnabled()
            if (r0 == 0) goto L_0x0162
            java.lang.String r2 = "upcoming_event_bottom_sheet_cta_reminder_on_tap"
        L_0x0031:
            java.lang.String r0 = r1.A07
            java.lang.String r8 = "sourceOfAction"
            if (r0 == 0) goto L_0x016e
            r5.A04(r4, r3, r2, r0)
            X.0lg r5 = X.DbT.A0X(r6)
            X.0Tu r0 = X.0Tu.A05
            r2 = 36320339399024979(0x81092800002153, double:3.032467113986738E-306)
            boolean r0 = X.182.A06(r0, r5, r2)
            if (r0 == 0) goto L_0x00e6
            android.content.Context r12 = r1.requireContext()
            androidx.fragment.app.FragmentActivity r13 = r1.requireActivity()
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r0 = r1.A07
            if (r0 == 0) goto L_0x016e
            X.0xx r17 = X.AnonymousClass07a.A00(r1)
            X.Vht r11 = new X.Vht
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.WfW r0 = new X.WfW
            r0.<init>(r1, r11)
            X.WfX r7 = new X.WfX
            r7.<init>(r1, r0, r11)
            X.0eM r0 = r1.A0L
            java.lang.Object r6 = r0.getValue()
            com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository r6 = (com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository) r6
            java.lang.Object r0 = r0.getValue()
            com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository r0 = (com.instagram.upcomingevents.common.repository.UpcomingEventReminderRepository) r0
            X.6al r0 = r0.A06
            boolean r0 = r0.A01(r4)
            if (r0 == 0) goto L_0x00e3
            com.instagram.upcomingevents.common.model.UpcomingEventReminderAction r5 = com.instagram.upcomingevents.common.model.UpcomingEventReminderAction.UNSET_REMINDER
        L_0x0088:
            java.lang.String r3 = r1.A07
            if (r3 == 0) goto L_0x016e
            X.1Xj r0 = A00(r1)
            X.L8U r2 = new X.L8U
            r2.<init>(r0, r5, r4, r3)
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            X.0xx r0 = X.AnonymousClass07a.A00(r0)
            r6.A03(r7, r2, r0)
        L_0x00a0:
            X.VU0 r0 = r1.A03
            if (r0 == 0) goto L_0x016a
            X.VcH r3 = r0.A01
            X.Cwd r2 = new X.Cwd
            r2.<init>(r4)
            boolean r0 = r4.getReminderEnabled()
            r0 = r0 ^ 1
            r2.A0E = r0
            com.instagram.user.model.UpcomingEvent r2 = r2.A00()
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r3.A00 = r2
            X.0eM r0 = r1.A0E
            java.lang.Object r2 = r0.getValue()
            X.Vv5 r2 = (X.C18612Vv5) r2
            X.VU0 r0 = r1.A03
            if (r0 == 0) goto L_0x016a
            X.VcH r0 = r0.A01
            com.instagram.user.model.UpcomingEvent r0 = r0.A00
            r2.A02(r0)
            android.os.CountDownTimer r0 = r1.A08
            if (r0 == 0) goto L_0x00d7
            r0.cancel()
        L_0x00d7:
            X.Q7e r0 = new X.Q7e
            r0.<init>((X.C15374UbS) r1)
            android.os.CountDownTimer r0 = r0.start()
            r1.A08 = r0
            return
        L_0x00e3:
            com.instagram.upcomingevents.common.model.UpcomingEventReminderAction r5 = com.instagram.upcomingevents.common.model.UpcomingEventReminderAction.SET_REMINDER
            goto L_0x0088
        L_0x00e6:
            X.0eM r0 = r1.A0K
            java.lang.Object r5 = r0.getValue()
            X.ViT r5 = (X.C17938ViT) r5
            X.Wfa r0 = new X.Wfa
            r0.<init>(r1)
            r5.A00 = r0
            boolean r0 = r4.getReminderEnabled()
            r7 = r0 ^ 1
            java.lang.String r2 = r1.A07
            if (r2 == 0) goto L_0x016e
            X.1Xj r0 = A00(r1)
            X.VYs r3 = new X.VYs
            r3.<init>(r0, r4, r2, r7)
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x0112
            X.UtS r6 = X.C16353UtS.A00
        L_0x010e:
            r5.A00(r6, r3)
            goto L_0x00a0
        L_0x0112:
            java.lang.String r2 = r1.A07
            if (r2 == 0) goto L_0x016e
            r0 = 975(0x3cf, float:1.366E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0153
            boolean r0 = r4.getReminderEnabled()
            if (r0 != 0) goto L_0x0153
            X.C63468KxX.A00()
            androidx.fragment.app.FragmentActivity r13 = r1.requireActivity()
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r0 = r1.A05
            if (r0 == 0) goto L_0x0166
            X.AnonymousClass7TG.A1O(r14, r15)
            X.Vjf r12 = new X.Vjf
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            java.lang.String r0 = r4.getId()
            X.UtM r2 = r12.A01(r0)
            android.content.Context r0 = r1.requireContext()
            X.UtQ r6 = new X.UtQ
            r6.<init>(r0, r2)
            goto L_0x010e
        L_0x0153:
            boolean r0 = r4.getReminderEnabled()
            if (r0 != 0) goto L_0x015f
            X.UtP r6 = new X.UtP
            r6.<init>(r3, r5)
            goto L_0x010e
        L_0x015f:
            X.UtR r6 = X.C16352UtR.A00
            goto L_0x010e
        L_0x0162:
            java.lang.String r2 = "upcoming_event_bottom_sheet_cta_remind_me_tap"
            goto L_0x0031
        L_0x0166:
            X.0qQ.A0F(r9)
            goto L_0x0171
        L_0x016a:
            X.0qQ.A0F(r10)
            goto L_0x0171
        L_0x016e:
            X.0qQ.A0F(r8)
        L_0x0171:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15374UbS.A06():void");
    }

    public final void A09(View view) {
        String str;
        VU0 vu0 = this.A03;
        String str2 = "viewModel";
        if (vu0 != null) {
            UpcomingEvent upcomingEvent = vu0.A01.A00;
            UserSession A0l = AnonymousClass7TE.A0l(this.A0I);
            String str3 = this.A05;
            if (str3 == null) {
                str2 = "priorModule";
            } else {
                C310306am r3 = new C310306am(this.A0C, A0l, str3);
                VU0 vu02 = this.A03;
                if (vu02 != null) {
                    String A0u = C51969G9p.A0u(vu02.A01.A01);
                    if (upcomingEvent.getReminderEnabled()) {
                        str = "upcoming_event_bottom_sheet_cta_reminder_on_impression";
                    } else {
                        str = "upcoming_event_bottom_sheet_cta_remind_me_impression";
                    }
                    String str4 = this.A07;
                    if (str4 == null) {
                        str2 = "sourceOfAction";
                    } else {
                        r3.A04(upcomingEvent, A0u, str, str4);
                        A03(view);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final String getModuleName() {
        return this.A0C.getModuleName();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0I);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final void A08(View view) {
        String str;
        A03(view);
        AnonymousClass0eM r2 = this.A0I;
        C238833Dp.A00(DbT.A0X(r2)).A05(view, C238863Ds.REMINDER_AD_CTA_BUTTON);
        UserSession A0l = AnonymousClass7TE.A0l(r2);
        String str2 = this.A05;
        if (str2 == null) {
            str = "priorModule";
        } else {
            C310306am r4 = new C310306am(this.A0C, A0l, str2);
            VU0 vu0 = this.A03;
            str = "viewModel";
            if (vu0 != null) {
                C17686VcH vcH = vu0.A01;
                UpcomingEvent upcomingEvent = vcH.A00;
                String A0u = C51969G9p.A0u(vcH.A01);
                String str3 = this.A07;
                if (str3 == null) {
                    str = "sourceOfAction";
                } else {
                    r4.A04(upcomingEvent, A0u, "upcoming_event_bottom_sheet_cta_offsite_link_impression", str3);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        1Xj A002;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (A002 = A00(this)) != null) {
            VU0 vu0 = this.A03;
            if (vu0 != null) {
                String id = vu0.A01.A00.getId();
                AnonymousClass0eM r2 = this.A0I;
                A002.A0C.Epf(C310266ai.A00(AnonymousClass7TE.A0l(r2)).A00(id));
                DbX.A0d(r2).A03(A002);
                XCE xce = this.A02;
                if (xce != null) {
                    xce.DdB();
                }
            }
            0qQ.A0F("viewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        VU0 vu02 = this.A03;
        if (vu02 != null) {
            if (!vu02.A01.A02) {
                DbX.A10(getActivity(), AnonymousClass37D.A00);
                return;
            }
            return;
        }
        0qQ.A0F("viewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(190793819);
        C15374UbS.super.onCreate(bundle);
        this.A00 = 2el.A00();
        Bundle requireArguments = requireArguments();
        this.A04 = requireArguments.getString("media_pk");
        String string = requireArguments.getString("prior_module");
        if (string != null) {
            this.A05 = string;
            String string2 = requireArguments.getString("source_of_action");
            if (string2 != null) {
                this.A07 = string2;
                this.A0B = requireArguments.getBoolean("coming_from_sticker");
                this.A0A = requireArguments.getBoolean("disable_snackbar");
                this.A09 = requireArguments.getBoolean("disable_offsite_link");
                this.A06 = C228022kf.A00((Bundle) null);
                UpcomingEvent upcomingEvent = (UpcomingEvent) requireArguments().getParcelable("upcoming_event");
                if (upcomingEvent != null) {
                    this.A03 = A01(this, upcomingEvent);
                    AnonymousClass0eM r3 = this.A0D;
                    ((1Ng) r3.getValue()).A01(this.A0M, AnonymousClass3DT.class);
                    ((1Ng) r3.getValue()).A01(this.A0N, WQA.class);
                    AnonymousClass0fD.A09(-1886402127, A022);
                    return;
                }
                illegalStateException = new IllegalStateException("event required");
                i = 898503260;
            } else {
                illegalStateException = new IllegalStateException("action source required");
                i = -1033080867;
            }
        } else {
            illegalStateException = new IllegalStateException("prior module required");
            i = 427867499;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(510375862);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_upcoming_event_bottom_sheet, false);
        AnonymousClass0fD.A09(792212304, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-339900446);
        super.onDestroy();
        HC9 hc9 = (HC9) this.A0G.getValue();
        RecyclerView recyclerView = (RecyclerView) hc9.A00;
        if (recyclerView != null) {
            recyclerView.A16(hc9);
        }
        CountDownTimer countDownTimer = this.A08;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.A08 = null;
        AnonymousClass0eM r3 = this.A0D;
        ((1Ng) r3.getValue()).A02(this.A0M, AnonymousClass3DT.class);
        ((1Ng) r3.getValue()).A02(this.A0N, WQA.class);
        AnonymousClass0fD.A09(-1274544286, A022);
    }
}
