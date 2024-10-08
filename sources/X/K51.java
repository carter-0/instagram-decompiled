package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.ArrayList;
import java.util.List;

public final class K51 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "FeedDefaultPrivacyBottomSheetFragment";
    public Context A00;
    public MSF A01;
    public C295085nY A02 = C295085nY.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
    public Boolean A03;
    public String A04;
    public String A05;
    public Boolean A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final String getModuleName() {
        return "feed_default_privacy_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        C295065nW r0;
        Boolean bool;
        int i;
        String string;
        String str;
        SpannableStringBuilder A012;
        CharSequence A002;
        CharSequence A08;
        C295085nY r02;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        AnonymousClass5w9 r03 = AnonymousClass5w8.A05;
        AnonymousClass0eM r25 = this.A07;
        C295095nZ A042 = JTT.A0R(r25).A04();
        boolean z2 = false;
        if (A042 != null) {
            z = A042.A00;
        } else {
            z = false;
        }
        this.A06 = Boolean.valueOf(z);
        if (A042 != null) {
            r0 = A042.A02;
        } else {
            r0 = null;
        }
        this.A04 = String.valueOf(r0);
        if (A042 != null) {
            bool = Boolean.valueOf(A042.A05);
        } else {
            bool = null;
        }
        this.A03 = bool;
        if (!(A042 == null || (r02 = A042.A01) == null)) {
            this.A02 = r02;
        }
        if (A00(this)) {
            long currentTimeMillis = System.currentTimeMillis();
            int i2 = DbX.A0h(r25).A01.getInt("fb_feed_crossposting_default_privacy_consent_times_shown", 0);
            0xY A0p = AnonymousClass7TE.A0p(DbX.A0h(r25));
            A0p.E5c("fb_feed_crossposting_default_privacy_consent_time_stamp_ms", currentTimeMillis);
            A0p.apply();
            AnonymousClass7TG.A1M(DbX.A0h(r25).A01, "fb_feed_crossposting_default_privacy_consent_times_shown", i2 + 1);
        }
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(requireView(), R.id.bottomsheet_header);
        igdsHeadline.setImageDrawable(requireActivity().getDrawable(R.drawable.ig_illustrations_illo_ig_fb_connection_refresh));
        int[] iArr = {R.drawable.instagram_facebook_circle_pano_outline_24, R.drawable.instagram_users_pano_outline_24, R.drawable.instagram_settings_pano_outline_24};
        FGX A022 = FGX.A02(requireContext(), true);
        Context context = this.A00;
        if (context != null) {
            int A023 = DbU.A02(this.A02, 1);
            if (A023 != 2) {
                i = 2131962306;
                if (A023 != 3) {
                    i = 2131962304;
                }
            } else {
                i = 2131962305;
            }
            String A16 = AnonymousClass7TE.A16(context, i);
            C295085nY r1 = this.A02;
            if (r1 == C295085nY.SHRINKING || r1 == C295085nY.MATCHED) {
                Context context2 = this.A00;
                if (context2 != null) {
                    string = context2.getString(2131962301);
                    str = null;
                }
            } else {
                Context context3 = this.A00;
                if (context3 != null) {
                    string = context3.getString(2131962302);
                    Context context4 = this.A00;
                    if (context4 != null) {
                        str = context4.getString(2131962303);
                    }
                }
            }
            C295085nY r11 = this.A02;
            if (this.A00 != null) {
                FragmentActivity requireActivity = requireActivity();
                UserSession A0l = AnonymousClass7TE.A0l(r25);
                C295085nY r04 = C295085nY.MATCHED;
                Context context5 = this.A00;
                if (r11 == r04) {
                    if (context5 != null) {
                        A012 = DbW.A08(context5, 2131962309);
                    }
                } else if (context5 != null) {
                    0qQ.A0B(A0l, 2);
                    String A162 = AnonymousClass7TE.A16(context5, 2131973566);
                    A012 = C59912Jbb.A01(JTR.A0T(context5.getResources(), A162, 2131962310), requireActivity, A0l, A162, C273654mx.A00(692), C273654mx.A00(158));
                }
                A022.A05((CharSequence) null, A012, iArr[0]);
                C295085nY r8 = this.A02;
                FragmentActivity requireActivity2 = requireActivity();
                UserSession A0l2 = AnonymousClass7TE.A0l(r25);
                if (r8 == r04) {
                    Context context6 = this.A00;
                    if (context6 != null) {
                        0qQ.A0B(A0l2, 2);
                        String A163 = AnonymousClass7TE.A16(context6, 2131973566);
                        A002 = C59912Jbb.A01(JTR.A0T(context6.getResources(), A163, 2131962310), requireActivity2, A0l2, A163, C273654mx.A00(692), C273654mx.A00(158));
                    }
                } else {
                    Context context7 = this.A00;
                    if (context7 != null) {
                        A002 = C59912Jbb.A00(context7, A042);
                    }
                }
                A022.A05((CharSequence) null, A002, iArr[1]);
                if (this.A02 == r04) {
                    Context context8 = this.A00;
                    if (context8 != null) {
                        A08 = C59912Jbb.A00(context8, A042);
                    }
                } else {
                    Context context9 = this.A00;
                    if (context9 != null) {
                        A08 = DbW.A08(context9, 2131962309);
                    }
                }
                A022.A05((CharSequence) null, A08, iArr[2]);
                igdsHeadline.setHeadline((CharSequence) A16);
                List<IgdsBulletCell> A043 = A022.A04();
                ArrayList A0r = AnonymousClass7TG.A0r(A043);
                for (IgdsBulletCell igdsBulletCell : A043) {
                    igdsBulletCell.setMovementMethod((MovementMethod) null, LinkMovementMethod.getInstance());
                    A0r.add(igdsBulletCell);
                }
                igdsHeadline.setBulletList(A0r);
                C3021461u r3 = (C3021461u) AnonymousClass7TF.A0F(requireView(), R.id.bottomsheet_buttons);
                if (string != null) {
                    r3.setPrimaryActionText(string);
                    r3.setPrimaryActionOnClickListener(LYD.A01(this, 60));
                }
                if (str != null) {
                    r3.setSecondaryActionText(str);
                    r3.setSecondaryActionOnClickListener(LYD.A01(this, 61));
                }
                r3.setDividerVisible(true);
                TextView A0R = AnonymousClass7TG.A0R(requireView(), R.id.bottomsheet_footer);
                Context context10 = this.A00;
                if (context10 != null) {
                    DbT.A18(context10, A0R, 2131962311);
                    AnonymousClass5w9.A00(AnonymousClass7TE.A0l(r25));
                    requireContext();
                    UserSession A0l3 = AnonymousClass7TE.A0l(r25);
                    boolean A1Z = C51972G9s.A1Z(this.A06);
                    String str2 = this.A04;
                    String str3 = this.A05;
                    boolean A003 = C363558jv.A00(AnonymousClass7TE.A0l(r25));
                    Boolean bool2 = this.A03;
                    if (bool2 != null) {
                        z2 = bool2.booleanValue();
                    }
                    C295105na.A02(A0l3, "default_privay_consent_bottomsheet_impression", str2, (String) null, str3, this.A02.name(), A1Z, A003, z2);
                    return;
                }
            }
        }
        0qQ.A0F("viewContext");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final boolean A00(K51 k51) {
        String str = k51.A05;
        if ((str == null || !str.equals("video_feed_share_button")) && ((str == null || !str.equals("share_later_share_button")) && (str == null || !str.equals("share_sheet_share_button")))) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public K51() {
        Boolean A0u = AnonymousClass7TE.A0u();
        this.A06 = A0u;
        this.A03 = A0u;
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.setTitle(getString(2131975416));
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(33750612);
        K51.super.onCreate(bundle);
        this.A00 = requireContext();
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        } else {
            str = null;
        }
        this.A05 = str;
        AnonymousClass0fD.A09(-1920904574, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(159642505);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.default_privacy_education_sheet, viewGroup, false);
        AnonymousClass0fD.A09(1205638720, A022);
        return inflate;
    }
}
