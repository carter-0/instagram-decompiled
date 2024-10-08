package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.android.maps.StaticMapView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.maps.ui.IgStaticMapView;
import java.util.List;

public final class E3A extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LoginNotificationApproveFragment";
    public double A00;
    public double A01;
    public TextView A02;
    public TextView A03;
    public UserSession A04;
    public Integer A05;
    public Integer A06 = AnonymousClass05K.A0C;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public View A0C;
    public View A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public IgSimpleImageView A0I;
    public String A0J;

    public final String getModuleName() {
        return "login_notification";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A06 == AnonymousClass05K.A0C) {
            UserSession userSession = this.A04;
            String str = "userSession";
            if (userSession != null) {
                String username = AnonymousClass7TF.A0Q(userSession).getUsername();
                String str2 = this.A09;
                if (str2 == null) {
                    str = "requestDeviceId";
                } else {
                    String str3 = this.A0B;
                    if (str3 == null) {
                        str = "twoFacIdentifier";
                    } else {
                        C48001EQk.A00(getParentFragmentManager(), this, C49235Ere.A00(userSession, username, str2, str3, (List) null), 10);
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    private final void A00() {
        TextView textView;
        int i;
        TextView textView2 = this.A0G;
        if (textView2 != null) {
            FragmentActivity requireActivity = requireActivity();
            UserSession userSession = this.A04;
            if (userSession != null) {
                AnonymousClass7AV.A07(new C48053ESw(requireActivity, userSession, requireActivity.getColor(2Yu.A0D(requireActivity)), 18), textView2, AnonymousClass7TE.A16(requireActivity, 2131965603), requireActivity.getString(2131965587));
                Integer num = this.A06;
                if (num == AnonymousClass05K.A0C) {
                    View view = this.A0D;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    View view2 = this.A0C;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    TextView textView3 = this.A0F;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                    TextView textView4 = this.A0E;
                    if (textView4 != null) {
                        DbU.A1G(textView4, this, 2131965586);
                    }
                    IgSimpleImageView igSimpleImageView = this.A0I;
                    if (igSimpleImageView != null) {
                        DbU.A13(requireContext(), igSimpleImageView, R.drawable.instagram_device_phone_pano_outline_24);
                        return;
                    }
                    return;
                }
                if (num == AnonymousClass05K.A0N) {
                    View view3 = this.A0C;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    TextView textView5 = this.A0H;
                    if (textView5 != null) {
                        textView5.setText(2131965588);
                    }
                    TextView textView6 = this.A0F;
                    if (textView6 != null) {
                        textView6.setVisibility(0);
                        DbX.A1F(textView6, this, this.A0J, 2131965578);
                    }
                    IgSimpleImageView igSimpleImageView2 = this.A0I;
                    if (igSimpleImageView2 != null) {
                        DbU.A13(requireContext(), igSimpleImageView2, R.drawable.instagram_circle_check_pano_filled_24);
                    }
                    textView = this.A0E;
                    if (textView != null) {
                        i = 2131965584;
                    } else {
                        return;
                    }
                } else if (num == AnonymousClass05K.A0Y) {
                    View view4 = this.A0C;
                    if (view4 != null) {
                        view4.setVisibility(8);
                    }
                    TextView textView7 = this.A0H;
                    if (textView7 != null) {
                        DbU.A1G(textView7, this, 2131965589);
                    }
                    TextView textView8 = this.A0F;
                    if (textView8 != null) {
                        textView8.setVisibility(0);
                        DbX.A1F(textView8, this, this.A0J, 2131965593);
                    }
                    IgSimpleImageView igSimpleImageView3 = this.A0I;
                    if (igSimpleImageView3 != null) {
                        DbU.A13(requireContext(), igSimpleImageView3, R.drawable.instagram_circle_x_pano_filled_24);
                    }
                    textView = this.A0E;
                    if (textView != null) {
                        i = 2131965585;
                    } else {
                        return;
                    }
                } else {
                    Integer num2 = AnonymousClass05K.A00;
                    View view5 = this.A0D;
                    if (num == num2) {
                        if (view5 != null) {
                            view5.setVisibility(8);
                        }
                        C59689JTv.A06(requireContext(), 2131965598);
                        return;
                    }
                    if (view5 != null) {
                        view5.setVisibility(8);
                    }
                    C59689JTv.A0B(requireContext(), "something_went_wrong");
                    0wb.A03("login_notification", "Unknown login notification state!");
                    return;
                }
                FragmentActivity requireActivity2 = requireActivity();
                UserSession userSession2 = this.A04;
                if (userSession2 != null) {
                    AnonymousClass7AV.A07(new C48053ESw(requireActivity2, userSession2, requireActivity2.getColor(2Yu.A0D(requireActivity2)), 17), textView, AnonymousClass7TE.A16(requireActivity2, 2131965599), requireActivity2.getString(i));
                    return;
                }
            }
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A03(E3A e3a, Integer num) {
        if (e3a.A0J == null) {
            e3a.A0J = 1G0.A06(e3a.requireContext(), System.currentTimeMillis());
        }
        e3a.A06 = num;
        e3a.A00();
    }

    public final AnonymousClass0wW getSession() {
        UserSession userSession = this.A04;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(Context context, E3A e3a) {
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131965583);
        A0Y.A08(2131965582);
        C50021FJg.A01(A0Y, e3a, 52, 2131965581);
        DbY.A1M(A0Y, 2131965592);
    }

    public static final void A02(Context context, E3A e3a) {
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131965597);
        A0Y.A08(2131965596);
        C50021FJg.A01(A0Y, e3a, 53, 2131965595);
        DbY.A1M(A0Y, 2131965592);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131965580);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 168 && i2 == -1) {
            C59689JTv.A07(requireContext(), 2131965591);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(557677236);
        E3A.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = DbX.A0U(this);
        this.A00 = requireArguments.getDouble("ARG_LOCATION_LATITUDE", 0.0d);
        this.A01 = requireArguments.getDouble("ARG_LOCATION_LONGITUDE", 0.0d);
        this.A07 = requireArguments.getString("ARG_DEVICE_NAME", "");
        this.A08 = requireArguments.getString("ARG_LOCATION_NAME", "");
        this.A0A = requireArguments.getString("ARG_TIMESTAMP", "");
        this.A09 = requireArguments.getString("ARG_REQUEST_DEVICE_ID", "");
        this.A0B = requireArguments.getString("ARG_TWO_FAC_IDENTIFIER", "");
        this.A05 = C49236Erf.A00(requireArguments.getInt("ARG_USER_ACTION", 3));
        AnonymousClass0fD.A09(-1049868317, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        String str;
        int A022 = AnonymousClass0fD.A02(-1420501245);
        0qQ.A0B(layoutInflater, 0);
        E3A.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.login_notification_approve, viewGroup, false);
        this.A0D = inflate;
        if (inflate != null) {
            this.A0H = Dba.A06(inflate);
            View view = this.A0D;
            if (view != null) {
                this.A0E = DbU.A0G(view, R.id.description);
                View view2 = this.A0D;
                if (view2 != null) {
                    View requireViewById = view2.requireViewById(R.id.map_item);
                    0qQ.A07(requireViewById);
                    this.A02 = DbU.A0G(requireViewById, R.id.left_button);
                    this.A03 = DbU.A0G(requireViewById, R.id.right_button);
                    this.A0I = (IgSimpleImageView) requireViewById.requireViewById(R.id.status_icon);
                    this.A0F = DbU.A0G(requireViewById, R.id.confirm_text);
                    this.A0C = requireViewById.requireViewById(R.id.button_container);
                    View view3 = this.A0D;
                    if (view3 != null) {
                        this.A0G = DbU.A0G(view3, R.id.footer);
                        Context requireContext = requireContext();
                        TextView A0R = AnonymousClass7TG.A0R(requireViewById, R.id.title_message);
                        TextView A0R2 = AnonymousClass7TG.A0R(requireViewById, R.id.body_message_timestamp);
                        TextView A0R3 = AnonymousClass7TG.A0R(requireViewById, R.id.body_message_device);
                        IgStaticMapView igStaticMapView = (IgStaticMapView) AnonymousClass7TF.A0F(requireViewById, R.id.login_activity_map_view);
                        TextView textView = this.A02;
                        if (textView != null) {
                            textView.setText(2131965579);
                            FP7.A00(textView, 34, requireContext, this);
                        }
                        TextView textView2 = this.A03;
                        if (textView2 != null) {
                            textView2.setText(2131965594);
                            FP7.A00(textView2, 35, requireContext, this);
                        }
                        igStaticMapView.A07 = C69419Nl1.TOP_RIGHT;
                        StaticMapView.StaticMapOptions staticMapOptions = new StaticMapView.StaticMapOptions("review_suspicious_login_map");
                        staticMapOptions.A02(this.A00, this.A01);
                        String str2 = this.A08;
                        if (str2 == null) {
                            str = "locationName";
                        } else {
                            A0R.setText(str2);
                            try {
                                String str3 = this.A0A;
                                if (str3 == null) {
                                    0qQ.A0F("timestamp");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                                A0R2.setText(1G0.A03(requireContext, Double.parseDouble(str3)));
                                String str4 = this.A07;
                                if (str4 == null) {
                                    str = "deviceName";
                                } else {
                                    A0R3.setText(str4);
                                    staticMapOptions.A03(11);
                                    igStaticMapView.setMapOptions(staticMapOptions);
                                    A00();
                                    View view4 = this.A0D;
                                    0qQ.A0C(view4, AnonymousClass000.A00(0));
                                    AnonymousClass0fD.A09(1704480117, A022);
                                    return view4;
                                }
                            } catch (NumberFormatException unused) {
                                A0R2.setVisibility(8);
                            }
                        }
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                    i = -2035057396;
                } else {
                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                    i = -1616287599;
                }
            } else {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = 1816131311;
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 856983724;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1974474473);
        super.onDestroyView();
        this.A0D = null;
        this.A0H = null;
        this.A0E = null;
        this.A0I = null;
        this.A02 = null;
        this.A03 = null;
        this.A0F = null;
        this.A0C = null;
        this.A0G = null;
        AnonymousClass0fD.A09(-1298607254, A022);
    }
}
