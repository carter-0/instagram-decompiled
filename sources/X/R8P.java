package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.smartcapture.logging.AuthenticityUploadMedium;
import com.instagram.android.R;
import com.instagram.challenge.activity.ChallengeActivity;
import com.instagram.common.session.UserSession;

public final class R8P extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "IdVerificationDocumentTypeFragment";
    public Context A00;
    public Bundle A01;
    public FragmentActivity A02;
    public 0hq A03;
    public T6A A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public UserSession A0B;
    public boolean A0C;

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eu4(true);
        if (this.A0C) {
            AnonymousClass3JR r2 = new AnonymousClass3JR();
            r2.A02(AnonymousClass05K.A09);
            r2.A0G = new C11495SbI(this, 26);
            Context context = this.A00;
            if (context == null) {
                0qQ.A0F("context");
                throw AnonymousClass00P.createAndThrow();
            }
            r2.A02 = context.getColor(2Yu.A0B(context));
            r4.AA3(new AnonymousClass3Jb(r2));
        }
    }

    public final String getModuleName() {
        return "id_verification";
    }

    public final boolean onBackPressed() {
        if (this.A0A) {
            STD.A03(this, getSession(), this.A05, "av_idv", "select_id_type", this.A08);
            Pxi.A1F(AnonymousClass1Nd.A00(getSession()), C9757RgF.A00(this.A09), "idv", false);
        }
        if (!this.A0C) {
            return true;
        }
        FragmentActivity fragmentActivity = this.A02;
        if (fragmentActivity == null) {
            0qQ.A0F("fragmentActivity");
            throw AnonymousClass00P.createAndThrow();
        } else if (!(fragmentActivity instanceof ChallengeActivity)) {
            return true;
        } else {
            fragmentActivity.finish();
            return true;
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A0A) {
            STD.A06(this, getSession(), this.A05, "av_idv", "select_id_type", this.A08);
        }
    }

    /* renamed from: A00 */
    public final UserSession getSession() {
        UserSession userSession = this.A0B;
        if (userSession != null) {
            return userSession;
        }
        0qQ.A0F("session");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void afterOnCreate(Bundle bundle) {
        super.afterOnCreate(bundle);
        T6A t6a = this.A04;
        if (t6a == null) {
            0qQ.A0F("idVerificationLogger");
            throw AnonymousClass00P.createAndThrow();
        } else {
            t6a.A00(RDG.A04, RDI.A01, this.A07);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1 && intent != null) {
            0hq r0 = this.A03;
            if (r0 == null) {
                0qQ.A0F("fragmentManager");
                throw AnonymousClass00P.createAndThrow();
            }
            SQH.A02(r0);
            Uri data = intent.getData();
            AuthenticityUploadMedium authenticityUploadMedium = (AuthenticityUploadMedium) intent.getSerializableExtra("front_authenticity_upload_medium");
            if (data != null && data.getPath() != null) {
                UserSession A002 = getSession();
                String path = data.getPath();
                0qQ.A0A(path);
                new C63930LDn(authenticityUploadMedium, A002, new T8Z(this), path, this.A07).A00();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        int A022 = AnonymousClass0fD.A02(-1411191524);
        R8P.super.onCreate(bundle);
        this.A00 = requireContext();
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments;
        this.A0B = 09i.A0A.A06(requireArguments);
        Bundle bundle2 = this.A01;
        if (bundle2 != null) {
            this.A07 = bundle2.getString("challenge_use_case");
            Bundle bundle3 = this.A01;
            if (bundle3 != null) {
                this.A06 = bundle3.getString("challenge_id");
                Bundle bundle4 = this.A01;
                if (bundle4 != null) {
                    this.A05 = bundle4.getString("av_session_id");
                    Bundle bundle5 = this.A01;
                    if (bundle5 != null) {
                        this.A08 = bundle5.getString("flow_id");
                        Bundle bundle6 = this.A01;
                        if (bundle6 != null) {
                            this.A09 = bundle6.getString("product_surface");
                            FragmentActivity requireActivity = requireActivity();
                            this.A02 = requireActivity;
                            this.A03 = requireActivity.getSupportFragmentManager();
                            this.A04 = new T6A(getSession());
                            String str = this.A07;
                            if (str == null || (!str.equals("idv_reactive") && !str.equals("ig_scraping"))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.A0C = z;
                            this.A0A = "ig_age_verification_idv".equals(str);
                            AnonymousClass0fD.A09(-1134147838, A022);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F("args");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1939094927);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.id_verification_document_type_layout, viewGroup, false);
        C11495SbI.A00(AnonymousClass7TF.A0G(inflate, R.id.document_type_group_2_option), 27, this);
        C3021461u r3 = (C3021461u) AnonymousClass7TF.A0F(inflate, R.id.document_type_next_button);
        r3.setPrimaryButtonEnabled(false);
        r3.setPrimaryActionOnClickListener(new C11495SbI(this, 28));
        ((RadioGroup) AnonymousClass7TF.A0F(inflate, R.id.document_type_radio_group)).setOnCheckedChangeListener(new C71473OlH(6, this, r3));
        AnonymousClass0fD.A09(1366254340, A022);
        return inflate;
    }
}
