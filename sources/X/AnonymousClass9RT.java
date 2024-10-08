package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.9RT  reason: invalid class name */
public final class AnonymousClass9RT implements C363278jS {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A00(0eO.A02, new Dbl(this, 32));

    public AnonymousClass9RT(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final boolean A00(C295905p6 r5, AnonymousClass9R1 r6) {
        ImmutableList immutableList;
        C250663lr A03;
        if (r6 == null || (A03 = r6.A03(AnonymousClass9R2.class, "xcxp_bpl_auto_crosspost_settings_root(configs_request:$configs_request)", -1047456758)) == null) {
            immutableList = null;
        } else {
            immutableList = A03.A06(AnonymousClass9UQ.class, "auto_xpost_setting", 304935101);
        }
        if (immutableList != null && (!(immutableList instanceof Collection) || !immutableList.isEmpty())) {
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                C250663lr r2 = (C250663lr) it.next();
                if (r2.getOptionalEnumField(0, "source_surface", C295905p6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == r5 && r2.getCoercedBooleanField(1, "is_auto_crosspost_enabled")) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean B56() {
        return ((2D6) this.A01.getValue()).A04.getBoolean("PREFERENCE_CREATOR_FEED_BPL_AUTO_XPOSTING", false);
    }

    public final boolean Bl3() {
        return ((2D6) this.A01.getValue()).A04.getBoolean("PREFERENCE_CREATOR_REELS_BPL_AUTO_XPOSTING", false);
    }

    public final boolean C0A() {
        return ((2D6) this.A01.getValue()).A04.getBoolean("PREFERENCE_CREATOR_STORY_BPL_AUTO_XPOSTING", false);
    }

    public final void EBB(AnonymousClass8k0 r9) {
        2IV r4 = new 2IV();
        ImmutableList.Builder builder = ImmutableList.builder();
        2IV r1 = new 2IV();
        r1.A09("FB", "destination_app");
        r1.A09("STORY", "destination_surface");
        r1.A09("STORY", "source_surface");
        builder.add(r1);
        2IV r12 = new 2IV();
        r12.A09("FB", "destination_app");
        r12.A09("FEED", "destination_surface");
        r12.A09("FEED", "source_surface");
        builder.add(r12);
        2IV r13 = new 2IV();
        r13.A09("FB", "destination_app");
        r13.A09("REELS", "destination_surface");
        r13.A09("REELS", "source_surface");
        builder.add(r13);
        r4.A05("crosspost_app_surface_list", builder.build());
        r4.A09("IG", "source_app");
        C59780JXz.A00(r4, this.A00, new AnonymousClass9T7(this, r9));
    }

    public final String getIdentifier() {
        return "BPLDataProvider";
    }
}
