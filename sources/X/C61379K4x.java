package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.List;

/* renamed from: X.K4x  reason: case insensitive filesystem */
public final class C61379K4x extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "OnDeviceNudityDefaultOnNuxFragment";
    public Drawable A00;
    public UserSession A01;
    public AnonymousClass630 A02;
    public IgdsBottomButtonLayout A03;
    public IgdsHeadline A04;

    public final String getModuleName() {
        return "on_device_nudity_default_on_nux";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        UserSession userSession = this.A01;
        if (userSession != null) {
            this.A02 = new AnonymousClass630(userSession);
            this.A04 = (IgdsHeadline) view.requireViewById(R.id.on_device_nudity_nux_headline);
            this.A03 = DbT.A0c(view, R.id.on_device_nudity_nux_bottom_ctas);
            JTV.A02(this);
            IgdsHeadline igdsHeadline = this.A04;
            str = "headline";
            if (igdsHeadline != null) {
                igdsHeadline.setImageDrawable(this.A00);
                FGX A022 = FGX.A02(requireContext(), true);
                String A012 = JTV.A01(this, A022);
                Context requireContext = requireContext();
                String A16 = AnonymousClass7TE.A16(requireContext, 2131964884);
                String A0T = 002.A0T(requireContext.getString(2131957633), A16, ' ');
                C62146Kaz kaz = new C62146Kaz(this, DbV.A02(requireContext));
                SpannableStringBuilder A0C = DbS.A0C(A0T);
                AnonymousClass7AV.A04(A0C, kaz, A16);
                A022.A05(A012, A0C, R.drawable.instagram_settings_pano_outline_24);
                List A042 = A022.A04();
                IgdsBulletCell igdsBulletCell = (IgdsBulletCell) 00k.A0L(A042);
                if (igdsBulletCell != null) {
                    igdsBulletCell.setMovementMethod((MovementMethod) null, LinkMovementMethod.getInstance());
                }
                IgdsHeadline igdsHeadline2 = this.A04;
                if (igdsHeadline2 != null) {
                    igdsHeadline2.setBulletList(A042);
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A03;
                    str = "bottomButton";
                    if (igdsBottomButtonLayout != null) {
                        igdsBottomButtonLayout.setPrimaryActionOnClickListener(new LYE((Object) this, 28));
                        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A03;
                        if (igdsBottomButtonLayout2 != null) {
                            igdsBottomButtonLayout2.setSecondaryActionOnClickListener(new LYE((Object) this, 29));
                            UserSession userSession2 = this.A01;
                            if (userSession2 != null) {
                                1Au.A00(userSession2).A1e(false);
                                return;
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        str = "session";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        0qQ.A0F("session");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131968689);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1615416153);
        C61379K4x.super.onCreate(bundle);
        this.A01 = DbX.A0U(this);
        this.A00 = requireContext().getDrawable(R.drawable.ig_illustrations_illo_nudity_detection_refresh);
        AnonymousClass0fD.A09(1915476117, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-202201905);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.on_device_nudity_default_on_nux, false);
        AnonymousClass0fD.A09(16200341, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(2007552915);
        super.onDestroy();
        AnonymousClass630 r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("consentManager");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A00.A01();
        AnonymousClass0fD.A09(1692036860, A022);
    }
}
