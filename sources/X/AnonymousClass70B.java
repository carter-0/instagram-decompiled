package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.text.LinkTextView;
import com.instagram.ui.dynamiclayout.DynamicConstraintLayout;

/* renamed from: X.70B  reason: invalid class name */
public final class AnonymousClass70B implements AnonymousClass70C {
    public AnonymousClass70G A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final UserSession A05;
    public final C71662eb A06;
    public final C71662eb A07;
    public final C71662eb A08;
    public final C71662eb A09;
    public final C71662eb A0A;
    public final C71662eb A0B;
    public final C71662eb A0C;
    public final C71662eb A0D;
    public final C71662eb A0E;
    public final C71662eb A0F;
    public final C71662eb A0G;
    public final C71662eb A0H;
    public final C71662eb A0I;
    public final C71662eb A0J;
    public final C71662eb A0K;
    public final C71662eb A0L;
    public final C71662eb A0M;
    public final C71662eb A0N;
    public final C71662eb A0O;
    public final C252063oV A0P;
    public final LinkTextView A0Q;
    public final DynamicConstraintLayout A0R;
    public final AnonymousClass0eM A0S;
    public final AnonymousClass0eM A0T;
    public final AnonymousClass0eM A0U;
    public final AnonymousClass0eM A0V;
    public final AnonymousClass0eM A0W;
    public final AnonymousClass0eM A0X;
    public final AnonymousClass0eM A0Y;
    public final AnonymousClass0eM A0Z;
    public final AnonymousClass0eM A0a;
    public final AnonymousClass0eM A0b;
    public final AnonymousClass0eM A0c;
    public final AnonymousClass0eM A0d;
    public final AnonymousClass0eM A0e;
    public final AnonymousClass0eM A0f;
    public final AnonymousClass0eM A0g;
    public final AnonymousClass0eM A0h;
    public final AnonymousClass0eM A0i;
    public final AnonymousClass0eM A0j;
    public final AnonymousClass0eM A0k;
    public final AnonymousClass0eM A0l;
    public final AnonymousClass0eM A0m;
    public final AnonymousClass0eM A0n;
    public final AnonymousClass0eM A0o;
    public final AnonymousClass0eM A0p;
    public final AnonymousClass0eM A0q;
    public final AnonymousClass0eM A0r;
    public final AnonymousClass0eM A0s;
    public final AnonymousClass0eM A0t;
    public final AnonymousClass0eM A0u;
    public final AnonymousClass0eM A0v;
    public final AnonymousClass0eM A0w;
    public final AnonymousClass0eM A0x;
    public final AnonymousClass0eM A0y;
    public final C71662eb A0z;
    public final AnonymousClass0eM A10;

    public AnonymousClass70B(View view, UserSession userSession) {
        View view2;
        int i;
        View view3;
        int i2;
        View view4;
        int i3;
        0qQ.A0B(view, 1);
        this.A02 = view;
        this.A05 = userSession;
        this.A0B = new C71662eb((ViewStub) view.findViewById(R.id.profile_header_metrics_clean));
        this.A0R = (DynamicConstraintLayout) view;
        int ordinal = AnonymousClass70D.A01(userSession).ordinal();
        if (ordinal == 2 || ordinal == 0) {
            view2 = this.A0B.A01();
            i = R.id.profile_header_full_name_clean;
        } else if (ordinal == 1 || ordinal == 3) {
            view2 = this.A02;
            i = R.id.profile_header_full_name;
        } else {
            throw new RuntimeException();
        }
        View requireViewById = view2.requireViewById(i);
        0qQ.A07(requireViewById);
        this.A04 = (TextView) requireViewById;
        int ordinal2 = AnonymousClass70D.A01(userSession).ordinal();
        if (ordinal2 == 2 || ordinal2 == 0) {
            view3 = this.A0B.A01();
            i2 = R.id.profile_header_pronouns_clean;
        } else if (ordinal2 == 1 || ordinal2 == 3) {
            view3 = this.A02;
            i2 = R.id.profile_header_pronouns;
        } else {
            throw new RuntimeException();
        }
        this.A0L = new C71662eb((ViewStub) view3.findViewById(i2));
        0Tu r2 = 0Tu.A06;
        C71662eb r3 = new C71662eb((ViewStub) view.findViewById(182.A06(r2, userSession, 36327795462257350L) ? R.id.profile_header_barcelona_badge_below_bio : R.id.profile_header_barcelona_badge));
        this.A06 = r3;
        this.A0E = new C71662eb((ViewStub) view.findViewById(R.id.internal_badge));
        this.A0F = new C71662eb((ViewStub) view.findViewById(R.id.internal_only_hip_badge));
        this.A0O = new C71662eb((ViewStub) view.findViewById(R.id.profile_header_verified_label));
        if (182.A06(0Tu.A05, userSession, 36327795463043789L)) {
            view4 = this.A0B.A01();
            i3 = R.id.profile_header_business_category_clean;
        } else {
            view4 = this.A02;
            i3 = R.id.profile_header_business_category;
        }
        this.A09 = new C71662eb((ViewStub) view4.findViewById(i3));
        View requireViewById2 = view.requireViewById(R.id.profile_header_bio_text);
        0qQ.A07(requireViewById2);
        this.A0Q = (LinkTextView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.profile_header_bio_translation_link);
        0qQ.A07(requireViewById3);
        this.A03 = (TextView) requireViewById3;
        this.A0G = new C71662eb((ViewStub) view.findViewById(R.id.profile_memorialized_tag));
        View requireViewById4 = view.requireViewById(R.id.profile_header_bio_translation_spinner);
        0qQ.A07(requireViewById4);
        this.A01 = requireViewById4;
        this.A0A = new C71662eb((ViewStub) view.findViewById(R.id.profile_chats_links_view));
        this.A08 = new C71662eb((ViewStub) view.findViewById(R.id.profile_header_business_address));
        this.A0z = new C71662eb((ViewStub) view.findViewById(R.id.profile_header_channel));
        this.A0N = new C71662eb((ViewStub) view.findViewById(R.id.profile_header_restrict_indicator));
        this.A0H = new C71662eb((ViewStub) view.findViewById(R.id.profile_header_metrics));
        this.A0D = new C71662eb((ViewStub) view.findViewById(R.id.profile_header_interest));
        this.A0M = new C71662eb((ViewStub) view.findViewById(182.A06(r2, userSession, 36327795462257350L) ? R.id.quiet_mode_profile_indicator_below_bio : R.id.quiet_mode_profile_indicator));
        this.A0J = new C71662eb((ViewStub) view.findViewById(R.id.profile_header_name_and_bio_upsell));
        this.A0I = new C71662eb((ViewStub) view.findViewById(R.id.profile_header_name_and_bio_banner));
        this.A0K = new C71662eb((ViewStub) view.findViewById(R.id.profile_header_profile_card_nux_banner));
        this.A0P = 2b1.A01(view.findViewById(R.id.banner_row), false, false);
        this.A07 = new C71662eb((ViewStub) r3.A01().findViewById(R.id.blue_dot_stub));
        this.A0C = new C71662eb((ViewStub) view.findViewById(R.id.profile_header_follow_context));
        this.A0p = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 41));
        this.A0o = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 40));
        this.A0s = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 44));
        0eO r32 = 0eO.A02;
        this.A0q = AnonymousClass0eN.A00(r32, new AnonymousClass9LK(this, 42));
        this.A0t = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 45));
        this.A0r = AnonymousClass0eN.A00(r32, new AnonymousClass9LK(this, 43));
        this.A0k = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 36));
        this.A0n = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 39));
        this.A0m = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 38));
        this.A0j = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 35));
        this.A0v = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 47));
        this.A0u = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 46));
        this.A0V = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 21));
        this.A0W = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 22));
        this.A0Y = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 24));
        this.A0a = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 26));
        this.A0Z = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 25));
        this.A0b = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 27));
        this.A0e = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 30));
        this.A0c = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 28));
        this.A0f = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 31));
        this.A0i = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 34));
        this.A0h = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 33));
        this.A0g = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 32));
        this.A0X = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 23));
        this.A0d = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 29));
        this.A0S = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 18));
        this.A0T = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 19));
        this.A10 = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 17));
        this.A0x = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 49));
        this.A0y = AnonymousClass0eN.A01(new AnonymousClass9LD(this, 0));
        this.A0U = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 20));
        this.A0w = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 48));
        this.A0l = AnonymousClass0eN.A01(new AnonymousClass9LK(this, 37));
    }

    public final AnonymousClass70G AeZ() {
        AnonymousClass70G r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
