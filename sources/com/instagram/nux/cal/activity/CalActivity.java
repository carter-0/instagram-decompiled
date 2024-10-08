package com.instagram.nux.cal.activity;

import X.08y;
import X.09i;
import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.C47466E3o;
import X.C49778F6l;
import X.DbS;
import X.DbU;
import X.DbW;
import X.Dba;
import X.EVV;
import X.Eo6;
import X.F1R;
import X.FFL;
import X.G65;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;

public final class CalActivity extends BaseFragmentActivity implements AnonymousClass0iw, G65 {
    public int A00;
    public Bundle A01;
    public AnonymousClass0wW A02;
    public String A03;
    public String A04;
    public String A05;
    public F1R A06;

    /* JADX WARNING: type inference failed for: r13v0, types: [com.instagram.nux.cal.activity.CalActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void A0j(Bundle bundle) {
        Fragment e3o;
        String str;
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("argument_flow");
            if (stringExtra != null) {
                Integer A002 = Eo6.A00(stringExtra);
                Parcelable parcelableExtra = getIntent().getParcelableExtra("argument_content");
                if (parcelableExtra == null) {
                    parcelableExtra = null;
                }
                EVV evv = (EVV) getIntent().getSerializableExtra("argument_entry_point");
                if (parcelableExtra != null && evv != null) {
                    C309516Yo A0B = Dba.A0B(this, getSession());
                    F1R f1r = this.A06;
                    if (f1r == null) {
                        str = "fragmentFactory";
                    } else {
                        AnonymousClass0wW r8 = this.A02;
                        if (r8 == null) {
                            str = "_session";
                        } else {
                            if (A002 == AnonymousClass05K.A00) {
                                e3o = f1r.A00(parcelableExtra, r8, evv, A002, (String) null, (String) null);
                            } else if (A002 == AnonymousClass05K.A01) {
                                Bundle A0a = AnonymousClass7TE.A0a();
                                DbW.A0w(A0a, r8);
                                A0a.putParcelable("argument_content", parcelableExtra);
                                A0a.putString("argument_flow", C49778F6l.A00(A002));
                                A0a.putSerializable("argument_entry_point", evv);
                                e3o = new C47466E3o();
                                e3o.setArguments(A0a);
                            } else {
                                throw AnonymousClass7TE.A0z("Flow not supported!");
                            }
                            A0B.A0B((Bundle) null, e3o);
                            A0B.A04();
                            return;
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.nux.cal.activity.CalActivity, android.app.Activity] */
    public final void DTh() {
        String str;
        AnonymousClass0wW r4 = this.A02;
        if (r4 == null) {
            str = "_session";
        } else {
            Bundle bundle = this.A01;
            str = "clientBundle";
            if (bundle != null) {
                String string = bundle.getString("extra_cal_registration_source");
                Bundle bundle2 = this.A01;
                if (bundle2 != null) {
                    FFL.A03(r4, DbU.A0g(bundle2, "extra_cal_force_signup_with_fb_after_cp_claiming"), AnonymousClass000.A00(389), string);
                    Intent A09 = DbS.A09();
                    A09.putExtra("result_action_positive", false);
                    A09.putExtra("argument_requested_code", this.A00);
                    String str2 = this.A03;
                    if (str2 == null) {
                        str = "accessToken";
                    } else {
                        A09.putExtra("argument_access_token", str2);
                        Bundle bundle3 = this.A01;
                        if (bundle3 != null) {
                            A09.putExtra("argument_client_extras_bundle", bundle3);
                            Dba.A0k(this, A09);
                            overridePendingTransition(R.anim.signup_content_fade_in, R.anim.signup_content_slide_out);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "cal_tos";
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.nux.cal.activity.CalActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A062 = DbU.A06(this);
        if (A062 != null) {
            return r1.A04(A062);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.nux.cal.activity.CalActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.signup_content_fade_in, R.anim.signup_content_slide_out);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.F1R] */
    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        String str;
        int A002 = AnonymousClass0fD.A00(-1272781869);
        this.A06 = new Object();
        08y r1 = 09i.A0A;
        Bundle A062 = DbU.A06(this);
        if (A062 != null) {
            this.A02 = r1.A04(A062);
            this.A00 = getIntent().getIntExtra("argument_requested_code", -1);
            String stringExtra = getIntent().getStringExtra("argument_access_token");
            if (stringExtra != null) {
                this.A03 = stringExtra;
                Bundle bundleExtra = getIntent().getBundleExtra("argument_client_extras_bundle");
                if (bundleExtra != null) {
                    this.A01 = bundleExtra;
                    super.onCreate(bundle);
                    AnonymousClass0wW r4 = this.A02;
                    if (r4 == null) {
                        str = "_session";
                    } else {
                        Bundle bundle2 = this.A01;
                        str = "clientBundle";
                        if (bundle2 != null) {
                            String string = bundle2.getString("extra_cal_registration_source");
                            Bundle bundle3 = this.A01;
                            if (bundle3 != null) {
                                FFL.A03(r4, DbU.A0g(bundle3, "extra_cal_force_signup_with_fb_after_cp_claiming"), "upsell_impressions", string);
                                AnonymousClass0fD.A07(-1802316524, A002);
                                return;
                            }
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = -2064843568;
            } else {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = -1024674055;
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 459384137;
        }
        AnonymousClass0fD.A07(i, A002);
        throw illegalStateException;
    }

    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
