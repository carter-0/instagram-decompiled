package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;

/* renamed from: X.8jR  reason: invalid class name and case insensitive filesystem */
public final class C363268jR implements C363278jS {
    public final UserSession A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;

    public C363268jR(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        0eO r2 = 0eO.A02;
        this.A02 = AnonymousClass0eN.A00(r2, new AnonymousClass9L5(this, 40));
        this.A01 = AnonymousClass0eN.A00(r2, new AnonymousClass9L5(this, 39));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.5p7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.5p7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.3lr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.5p7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C295915p7 A00(X.C295905p6 r7, X.C295875p3 r8) {
        /*
            r6 = 0
            if (r8 == 0) goto L_0x0057
            java.lang.Class<X.5p4> r2 = X.C295885p4.class
            r5 = 0
            java.lang.String r1 = "crosspost_settings"
            r0 = -2037360975(0xffffffff869056b1, float:-5.429416E-35)
            com.google.common.collect.ImmutableList r1 = r8.getRequiredCompactedTreeListField(r5, r1, r2, r0)
            if (r1 == 0) goto L_0x0057
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r3 = r1.iterator()
        L_0x0020:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r2 = r3.next()
            X.3lr r2 = (X.C250663lr) r2
            java.lang.Class<X.5p7> r1 = X.C295915p7.class
            r0 = -986182339(0xffffffffc5380d3d, float:-2944.8274)
            X.3lr r0 = r2.reinterpretRequired(r5, r1, r0)
            r4.add(r0)
            goto L_0x0020
        L_0x0039:
            java.util.Iterator r4 = r4.iterator()
        L_0x003d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.3lr r2 = (X.C250663lr) r2
            X.5p6 r1 = X.C295905p6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "source_surface"
            java.lang.Enum r0 = r2.getOptionalEnumField(r5, r0, r1)
            if (r0 != r7) goto L_0x003d
            r6 = r3
        L_0x0055:
            X.5p7 r6 = (X.C295915p7) r6
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363268jR.A00(X.5p6, X.5p3):X.5p7");
    }

    public final boolean B56() {
        return ((1Av) this.A02.getValue()).A01.getBoolean("auto_cross_post_to_facebook_feed", false);
    }

    public final boolean Bl3() {
        return ((2D6) this.A01.getValue()).A04.getBoolean("PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED", false);
    }

    public final boolean C0A() {
        1Av r3 = (1Av) this.A02.getValue();
        return ((Boolean) r3.A1B.CDM(r3, 1Av.A8a[132])).booleanValue();
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
        C363618k4.A00(r4, this.A00, new C363608k2(this, r9));
    }

    public final String getIdentifier() {
        return "UnifiedConfigDataProvider";
    }
}
