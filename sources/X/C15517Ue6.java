package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteEnrollCouponInfo;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.coupon.PromoteCouponCurrencyAmount;
import com.instagram.model.coupon.PromoteCouponType;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.Ue6  reason: case insensitive filesystem */
public final class C15517Ue6 extends C231632rz {
    public final Context A00;
    public final UserSession A01;

    public final int getViewTypeCount() {
        return 4;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        View view2;
        boolean z;
        int ordinal;
        IgdsButton igdsButton;
        int i2;
        PromoteCouponType promoteCouponType;
        TextView textView;
        CharSequence A012;
        TextView textView2;
        String str;
        TextView textView3;
        String str2;
        int i3;
        Integer num;
        String str3;
        String str4;
        String str5;
        IgLinearLayout igLinearLayout;
        String str6;
        TextView textView4;
        int i4;
        Object[] objArr;
        Object obj3 = obj;
        int A03 = AnonymousClass0fD.A03(1372256151);
        View view3 = view;
        int A02 = DbW.A02(1, view3, obj3);
        int i5 = i;
        if (i == 0) {
            UserSession userSession = this.A01;
            Context context = this.A00;
            Object tag = view3.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.binder.CouponModuleWithActionButtonViewBinder.Holder");
            C16739V3w v3w = (C16739V3w) tag;
            C18067Vkt vkt = (C18067Vkt) obj3;
            z = DbW.A1S(1, userSession, context);
            AnonymousClass7TF.A1C(v3w, A02, vkt);
            int intValue = vkt.A01().intValue();
            if (intValue != z) {
                if (intValue == 1 && (promoteCouponType = vkt.A0B) != null) {
                    int ordinal2 = promoteCouponType.ordinal();
                    if (ordinal2 == 1) {
                        v3w.A03.setVisibility(z);
                        TextView textView5 = v3w.A02;
                        String str7 = vkt.A0D;
                        JTR.A18(context, textView5, str7, vkt.A03(), 2131970799);
                        textView = v3w.A01;
                        A012 = 0bC.A01(context.getResources(), new String[]{str7, vkt.A03(), vkt.A0E}, 2131970798);
                    } else if (ordinal2 == z) {
                        v3w.A03.setVisibility(z);
                        TextView textView6 = v3w.A02;
                        String str8 = vkt.A0D;
                        DbX.A13(context, textView6, str8, 2131970558);
                        textView = v3w.A01;
                        A012 = DbW.A0h(context, str8, 2131970557);
                    }
                    textView.setText(A012);
                    igdsButton = v3w.A04;
                    i2 = 2131970300;
                }
                view2 = v3w.A00;
                C66580MXl.A1B(view2, z ? 1 : 0);
                view2.setVisibility(8);
            } else {
                PromoteCouponType promoteCouponType2 = vkt.A0B;
                if (!(promoteCouponType2 == null || (ordinal = promoteCouponType2.ordinal()) == 1 || ordinal != z)) {
                    v3w.A03.setVisibility(z ? 1 : 0);
                    TextView textView7 = v3w.A02;
                    String str9 = vkt.A0D;
                    DbX.A13(context, textView7, str9, 2131970303);
                    DbX.A13(context, v3w.A01, str9, 2131970302);
                    igdsButton = v3w.A04;
                    i2 = 2131970301;
                }
                view2 = v3w.A00;
                C66580MXl.A1B(view2, z ? 1 : 0);
                view2.setVisibility(8);
            }
            igdsButton.setText(i2);
            float A032 = C13989Tnp.A03(context);
            int i6 = (int) ((12.0f * A032) + 0.5f);
            int i7 = (int) ((4.0f * A032) + 0.5f);
            TextView textView8 = v3w.A02;
            textView8.setPadding(i6, i7, i6, i7);
            textView8.setGravity(17);
            textView8.setVisibility(z);
            TextView textView9 = v3w.A01;
            textView9.setPadding(i6, i7, i6, i7);
            textView9.setGravity(17);
            textView9.setVisibility(z);
            IgdsButton igdsButton2 = v3w.A04;
            igdsButton2.setStyle(C273014lo.PRIMARY);
            C18887WAz.A00(igdsButton2, 55, vkt);
            igdsButton2.setVisibility(z);
        } else if (i5 == 1) {
            Context context2 = this.A00;
            Object tag2 = view3.getTag();
            0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteSpendXGetYCouponViewBinder.Holder");
            V47 v47 = (V47) tag2;
            C18067Vkt vkt2 = (C18067Vkt) obj3;
            0qQ.A0B(context2, 1);
            0qQ.A0B(v47, A02);
            0qQ.A0B(vkt2, 3);
            v47.A0A.setVisibility(8);
            v47.A09.setVisibility(8);
            v47.A00.setVisibility(8);
            float A033 = C13989Tnp.A03(context2);
            int i8 = (int) ((0.0f * A033) + 0.5f);
            int i9 = (int) ((4.0f * A033) + 0.5f);
            TextView textView10 = v47.A07;
            textView10.setPadding(i8, i9, i8, i9);
            textView10.setGravity(8388611);
            textView10.setVisibility(0);
            TextView textView11 = v47.A06;
            textView11.setPadding(i8, i9, i8, i9);
            textView11.setGravity(8388611);
            textView11.setVisibility(0);
            int intValue2 = vkt2.A01().intValue();
            if (intValue2 != A02) {
                if (intValue2 != 3) {
                    if (intValue2 == 4) {
                        v47.A0A.setVisibility(0);
                        DbX.A13(context2, v47.A07, vkt2.A0D, 2131970801);
                        textView3 = v47.A06;
                        str2 = context2.getString(2131970800);
                    } else if (intValue2 != 5) {
                        view2 = v47.A01;
                        C66580MXl.A1B(view2, 0);
                    } else {
                        v47.A09.setVisibility(0);
                        TextView textView12 = v47.A07;
                        String str10 = vkt2.A0D;
                        DbX.A13(context2, textView12, str10, 2131970803);
                        textView3 = v47.A06;
                        str2 = DbV.A0u(context2, str10, vkt2.A0E, 2131970802);
                    }
                    textView3.setText(str2);
                    float A034 = C13989Tnp.A03(context2);
                    int i10 = (int) ((12.0f * A034) + 0.5f);
                    int i11 = (int) ((4.0f * A034) + 0.5f);
                    TextView textView13 = v47.A07;
                    textView13.setPadding(i10, i11, i10, i11);
                    textView13.setGravity(17);
                    textView13.setVisibility(0);
                    TextView textView14 = v47.A06;
                    textView14.setPadding(i10, i11, i10, i11);
                    textView14.setGravity(17);
                    textView2 = textView14;
                } else {
                    double A002 = vkt2.A00();
                    TextView textView15 = v47.A07;
                    String str11 = vkt2.A0D;
                    JTR.A18(context2, textView15, str11, vkt2.A03(), 2131970809);
                    textView15.setVisibility(0);
                    TextView textView16 = v47.A06;
                    textView16.setText(context2.getString(2131970808, new Object[]{str11, vkt2.A03(), vkt2.A0E}));
                    textView16.setVisibility(0);
                    DbT.A18(context2, v47.A04, 2131970806);
                    DbT.A18(context2, v47.A02, 2131970804);
                    TextView textView17 = v47.A05;
                    PromoteCouponCurrencyAmount promoteCouponCurrencyAmount = vkt2.A0A;
                    if (promoteCouponCurrencyAmount != null) {
                        str = promoteCouponCurrencyAmount.A00();
                    } else {
                        str = "";
                    }
                    textView17.setText(str);
                    DbX.A13(context2, v47.A03, str11, 2131970805);
                    v47.A08.setProgress((int) A002);
                    textView2 = v47.A00;
                }
                textView2.setVisibility(0);
            } else {
                TextView textView18 = v47.A07;
                String str12 = vkt2.A0D;
                JTR.A18(context2, textView18, str12, vkt2.A03(), 2131970809);
                textView18.setVisibility(0);
                TextView textView19 = v47.A06;
                textView19.setText(context2.getString(2131970807, new Object[]{str12, vkt2.A03(), vkt2.A0E}));
                textView19.setVisibility(0);
                view2 = v47.A00;
            }
            view2.setVisibility(8);
        } else if (i5 == A02) {
            UserSession userSession2 = this.A01;
            Context context3 = this.A00;
            Object tag3 = view3.getTag();
            0qQ.A0C(tag3, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteSpendXGetYCouponChecklistStyledViewBinder.Holder");
            V3Q v3q = (V3Q) tag3;
            C18067Vkt vkt3 = (C18067Vkt) obj3;
            z = DbW.A1S(1, userSession2, context3);
            0qQ.A0B(v3q, A02);
            0qQ.A0B(vkt3, 3);
            IgTextView igTextView = new IgTextView(context3);
            igTextView.setTextAppearance(R.style.igds_emphasized_label);
            float A035 = C13989Tnp.A03(context3);
            int i12 = (int) ((0.0f * A035) + 0.5f);
            int i13 = (int) ((8.0f * A035) + 0.5f);
            igTextView.setPadding(i12, i13, i12, i13);
            String str13 = vkt3.A0D;
            JTR.A18(context3, igTextView, str13, vkt3.A03(), 2131970809);
            IgLinearLayout igLinearLayout2 = v3q.A01;
            igLinearLayout2.removeAllViews();
            igLinearLayout2.addView(igTextView);
            int intValue3 = vkt3.A01().intValue();
            if (intValue3 != A02) {
                if (intValue3 == 3) {
                    int A003 = (int) vkt3.A00();
                    igLinearLayout = v3q.A01;
                    i3 = -1;
                    str3 = null;
                    igLinearLayout.addView(new C15831UjG(context3, RealtimeSubscription.GRAPHQL_MQTT_VERSION, context3.getString(2131970290), (CharSequence) null, AnonymousClass05K.A0C, -1));
                    Integer num2 = AnonymousClass05K.A01;
                    String A0h = DbW.A0h(context3, vkt3.A03(), 2131970293);
                    PromoteCouponCurrencyAmount promoteCouponCurrencyAmount2 = vkt3.A0A;
                    if (promoteCouponCurrencyAmount2 != null) {
                        str6 = promoteCouponCurrencyAmount2.A00();
                    } else {
                        str6 = "";
                    }
                    igLinearLayout.addView(new C15831UjG(context3, "2", A0h, DbV.A0u(context3, str6, vkt3.A03(), 2131970292), num2, A003));
                    num = AnonymousClass05K.A00;
                    str5 = "3";
                    str4 = DbW.A0h(context3, str13, 2131970295);
                } else if (intValue3 != 4) {
                    view2 = v3q.A00;
                    C66580MXl.A1B(view2, z ? 1 : 0);
                    view2.setVisibility(8);
                } else {
                    igLinearLayout = v3q.A01;
                    Integer num3 = AnonymousClass05K.A0C;
                    i3 = -1;
                    igLinearLayout.addView(new C15831UjG(context3, RealtimeSubscription.GRAPHQL_MQTT_VERSION, context3.getString(2131970290), (CharSequence) null, num3, -1));
                    igLinearLayout.addView(new C15831UjG(context3, "2", DbW.A0h(context3, vkt3.A03(), 2131970293), (CharSequence) null, num3, -1));
                    num = AnonymousClass05K.A01;
                    str5 = "3";
                    str4 = DbW.A0h(context3, str13, 2131970295);
                    str3 = context3.getString(2131970294);
                }
            } else if (vkt3.A01 || vkt3.A00) {
                igLinearLayout = v3q.A01;
                i3 = -1;
                igLinearLayout.addView(new C15831UjG(context3, RealtimeSubscription.GRAPHQL_MQTT_VERSION, context3.getString(2131970290), (CharSequence) null, AnonymousClass05K.A0C, -1));
                igLinearLayout.addView(new C15831UjG(context3, "2", DbW.A0h(context3, vkt3.A03(), 2131970293), DbW.A0h(context3, str13, 2131970291), AnonymousClass05K.A01, -1));
                num = AnonymousClass05K.A00;
                str5 = "3";
                str4 = DbW.A0h(context3, str13, 2131970295);
                str3 = null;
            } else {
                igLinearLayout = v3q.A01;
                i3 = -1;
                igLinearLayout.addView(new C15831UjG(context3, RealtimeSubscription.GRAPHQL_MQTT_VERSION, context3.getString(2131970290), DbW.A0h(context3, vkt3.A03(), 2131970289), AnonymousClass05K.A01, -1));
                num = AnonymousClass05K.A00;
                str3 = null;
                igLinearLayout.addView(new C15831UjG(context3, "2", DbW.A0h(context3, vkt3.A03(), 2131970293), (CharSequence) null, num, -1));
                str5 = "3";
                str4 = DbW.A0h(context3, str13, 2131970295);
            }
            igLinearLayout.addView(new C15831UjG(context3, str5, str4, str3, num, i3));
        } else if (i5 == 3) {
            Context context4 = this.A00;
            Object tag4 = view3.getTag();
            0qQ.A0C(tag4, "null cannot be cast to non-null type com.instagram.business.promote.binder.CouponModuleCouponReminderViewBinder.Holder");
            C16734V3r v3r = (C16734V3r) tag4;
            C18067Vkt vkt4 = (C18067Vkt) obj3;
            0qQ.A0B(context4, 1);
            0qQ.A0B(v3r, A02);
            0qQ.A0B(vkt4, 3);
            if (vkt4.A01().intValue() == 6) {
                v3r.A03.setVisibility(0);
                if (!vkt4.A01 || vkt4.A05 != PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.HAS_CLAIMED) {
                    DbX.A13(context4, v3r.A02, vkt4.A02(), 2131970297);
                    textView4 = v3r.A01;
                    i4 = 2131970296;
                    objArr = new Object[]{vkt4.A02(), vkt4.A0E};
                } else {
                    DbX.A13(context4, v3r.A02, vkt4.A02(), 2131970299);
                    textView4 = v3r.A01;
                    i4 = 2131970298;
                    objArr = new Object[]{vkt4.A0E};
                }
                textView4.setText(context4.getString(i4, objArr));
                float A036 = C13989Tnp.A03(context4);
                int i14 = (int) ((0.0f * A036) + 0.5f);
                int i15 = (int) ((4.0f * A036) + 0.5f);
                TextView textView20 = v3r.A02;
                textView20.setPadding(i14, i15, i14, i15);
                textView20.setGravity(8388611);
                textView20.setVisibility(0);
                TextView textView21 = v3r.A01;
                textView21.setPadding(i14, i15, i14, i15);
                textView21.setGravity(8388611);
                textView21.setVisibility(0);
                IgSimpleImageView igSimpleImageView = v3r.A03;
                igSimpleImageView.setPadding(0, i15, (int) ((16.0f * A036) + 0.5f), i15);
                igSimpleImageView.setVisibility(0);
            } else {
                view2 = v3r.A00;
                view2.getLayoutParams().height = 0;
                view2.setVisibility(8);
            }
        }
        AnonymousClass0fD.A0A(-105679485, A03);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r4, Object obj, Object obj2) {
        int i;
        C18067Vkt vkt = (C18067Vkt) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, r4, vkt);
        switch (vkt.A01().intValue()) {
            case 0:
            case 1:
                r4.A7U(0);
                return;
            case 2:
            case 3:
            case 4:
                if (vkt.A0B == PromoteCouponType.RECREATE_MIN_SPEND_X_TO_GET_Y) {
                    i = 2;
                    break;
                } else {
                    return;
                }
            case 5:
                if (vkt.A0B == PromoteCouponType.RECREATE_MIN_SPEND_X_TO_GET_Y) {
                    r4.A7U(A1U ? 1 : 0);
                    return;
                }
                return;
            case 6:
                i = 3;
                break;
            case 7:
                return;
            default:
                throw new RuntimeException();
        }
        r4.A7U(i);
    }

    public C15517Ue6(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, X.V3w] */
    /* JADX WARNING: type inference failed for: r0v25, types: [java.lang.Object, X.V47] */
    /* JADX WARNING: type inference failed for: r0v30, types: [X.V3Q, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v38, types: [X.V3r, java.lang.Object] */
    public final View createView(int i, ViewGroup viewGroup) {
        View view;
        int i2;
        int A03 = AnonymousClass0fD.A03(-515604898);
        0qQ.A0B(viewGroup, 1);
        if (i == 0) {
            View A09 = DbW.A09(DbT.A0B(this.A00), viewGroup, R.layout.promote_coupon_module_row_with_action_button, false);
            TextView A08 = C13991Tnr.A08(A09, R.id.title);
            TextView A082 = C13991Tnr.A08(A09, R.id.subtitle);
            IgSimpleImageView igSimpleImageView = (IgSimpleImageView) AnonymousClass7TF.A0G(A09, R.id.image_gift_card);
            IgdsButton igdsButton = (IgdsButton) AnonymousClass7TF.A0G(A09, R.id.coupon_module_action_button);
            C51974G9v.A1M(A08, A082, igSimpleImageView);
            0qQ.A0B(igdsButton, 5);
            ? obj = new Object();
            obj.A00 = A09;
            obj.A02 = A08;
            obj.A01 = A082;
            obj.A03 = igSimpleImageView;
            obj.A04 = igdsButton;
            A09.setTag(obj);
            view = obj.A00;
            i2 = 2086837351;
        } else if (i == 1) {
            View A092 = DbW.A09(DbT.A0B(this.A00), viewGroup, R.layout.promote_coupon_module_row, false);
            TextView A083 = C13991Tnr.A08(A092, R.id.title);
            TextView A084 = C13991Tnr.A08(A092, R.id.subtitle);
            View A0G = AnonymousClass7TF.A0G(A092, R.id.progress_bar_container);
            IgProgressBar igProgressBar = (IgProgressBar) AnonymousClass7TF.A0G(A092, R.id.progress_bar);
            TextView A085 = C13991Tnr.A08(A092, R.id.coupon_spent_label);
            TextView A086 = C13991Tnr.A08(A092, R.id.coupon_spent_value);
            TextView A087 = C13991Tnr.A08(A092, R.id.coupon_reward_label);
            TextView A088 = C13991Tnr.A08(A092, R.id.coupon_reward_value);
            IgSimpleImageView igSimpleImageView2 = (IgSimpleImageView) AnonymousClass7TF.A0G(A092, R.id.image_survey_confirm);
            IgSimpleImageView igSimpleImageView3 = (IgSimpleImageView) AnonymousClass7TF.A0G(A092, R.id.image_gift_card);
            AnonymousClass7TG.A1Q(A083, A084);
            AnonymousClass7TG.A1S(igProgressBar, A085);
            C51974G9v.A1Q(A086, A087, A088, igSimpleImageView2);
            0qQ.A0B(igSimpleImageView3, 11);
            ? obj2 = new Object();
            obj2.A01 = A092;
            obj2.A07 = A083;
            obj2.A06 = A084;
            obj2.A00 = A0G;
            obj2.A08 = igProgressBar;
            obj2.A04 = A085;
            obj2.A05 = A086;
            obj2.A02 = A087;
            obj2.A03 = A088;
            obj2.A0A = igSimpleImageView2;
            obj2.A09 = igSimpleImageView3;
            A092.setTag(obj2);
            view = obj2.A01;
            i2 = -14874498;
        } else if (i == 2) {
            View A093 = DbW.A09(DbT.A0B(this.A00), viewGroup, R.layout.promote_coupon_module_row, false);
            IgLinearLayout igLinearLayout = (IgLinearLayout) AnonymousClass7TF.A0F(A093, R.id.coupon_module_content_container);
            igLinearLayout.removeAllViews();
            ? obj3 = new Object();
            obj3.A00 = A093;
            obj3.A01 = igLinearLayout;
            A093.setTag(obj3);
            view = obj3.A00;
            i2 = 1515153511;
        } else if (i == 3) {
            View A094 = DbW.A09(DbT.A0B(this.A00), viewGroup, R.layout.promote_coupon_module_row_coupon_reminder, false);
            TextView A0F = C66582MXn.A0F(A094);
            TextView A0R = AnonymousClass7TG.A0R(A094, R.id.subtitle);
            IgSimpleImageView A0Y = DbX.A0Y(A094, R.id.image_gift_card);
            0qQ.A0B(A0F, 2);
            AnonymousClass7TF.A1D(A0R, 3, A0Y);
            ? obj4 = new Object();
            obj4.A00 = A094;
            obj4.A02 = A0F;
            obj4.A01 = A0R;
            obj4.A03 = A0Y;
            A094.setTag(obj4);
            view = obj4.A00;
            i2 = -528621692;
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("viewType is not valid in PromoteCouponModuleBinderGroup.createView");
            AnonymousClass0fD.A0A(-471562038, A03);
            throw illegalStateException;
        }
        AnonymousClass0fD.A0A(i2, A03);
        return view;
    }
}
