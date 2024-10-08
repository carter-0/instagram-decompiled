package X;

/* renamed from: X.7y0  reason: invalid class name and case insensitive filesystem */
public final class C348177y0 implements AnonymousClass2Kv {
    public final /* synthetic */ C347377wi A00;
    public final /* synthetic */ C348157xy A01;

    public C348177y0(C347377wi r1, C348157xy r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.7yS, java.lang.Object] */
    public final void invoke(AnonymousClass3JD r8) {
        Object Bny;
        C348167xz r5;
        this.A01.A00.markerEnd(857806587, 2);
        ? obj = new Object();
        if (!(r8 == null || (Bny = r8.Bny()) == null || (r5 = (C348167xz) Bny) == null || r5.A0E() == null)) {
            C348447yT A0E = r5.A0E();
            if (A0E != null) {
                if (A0E.hasFieldValue("can_user_see_is_upsell(flow:\"CP_UPSELL_IG_STORY_CROSS_POSTING\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)")) {
                    C348447yT A0E2 = r5.A0E();
                    if (A0E2 != null) {
                        obj.A05 = A0E2.getCoercedBooleanField(0, "can_user_see_is_upsell(flow:\"CP_UPSELL_IG_STORY_CROSS_POSTING\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)");
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                C348447yT A0E3 = r5.A0E();
                if (A0E3 != null) {
                    if (A0E3.hasFieldValue("can_user_see_is_upsell(flow:\"IG_PROFILE_PHOTO_CHANGE_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)")) {
                        C348447yT A0E4 = r5.A0E();
                        if (A0E4 != null) {
                            obj.A03 = A0E4.getCoercedBooleanField(1, "can_user_see_is_upsell(flow:\"IG_PROFILE_PHOTO_CHANGE_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)");
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    C348447yT A0E5 = r5.A0E();
                    if (A0E5 != null) {
                        if (A0E5.hasFieldValue("can_user_see_is_upsell(flow:\"IG_PROFILE_PHOTO_CHANGE_IS_COMPLETENESS_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)")) {
                            C348447yT A0E6 = r5.A0E();
                            if (A0E6 != null) {
                                obj.A04 = A0E6.getCoercedBooleanField(2, "can_user_see_is_upsell(flow:\"IG_PROFILE_PHOTO_CHANGE_IS_COMPLETENESS_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)");
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        C348447yT A0E7 = r5.A0E();
                        if (A0E7 != null) {
                            if (A0E7.hasFieldValue("can_user_see_is_upsell(flow:\"IG_FEED_CROSS_POSTING_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)")) {
                                C348447yT A0E8 = r5.A0E();
                                if (A0E8 != null) {
                                    obj.A01 = A0E8.getCoercedBooleanField(3, "can_user_see_is_upsell(flow:\"IG_FEED_CROSS_POSTING_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)");
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                            C348447yT A0E9 = r5.A0E();
                            if (A0E9 != null) {
                                if (A0E9.hasFieldValue("can_user_see_is_upsell(flow:\"IG_DISCOVER_PEOPLE_HOME_UPSELL\")")) {
                                    C348447yT A0E10 = r5.A0E();
                                    if (A0E10 != null) {
                                        obj.A00 = A0E10.getCoercedBooleanField(4, "can_user_see_is_upsell(flow:\"IG_DISCOVER_PEOPLE_HOME_UPSELL\")");
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                                C348447yT A0E11 = r5.A0E();
                                if (A0E11 == null) {
                                    throw new IllegalStateException("Required value was null.");
                                } else if (A0E11.hasFieldValue("can_user_see_is_upsell(flow:\"IG_IMPORT_FROM_FB_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)")) {
                                    C348447yT A0E12 = r5.A0E();
                                    if (A0E12 != null) {
                                        obj.A02 = A0E12.getCoercedBooleanField(5, "can_user_see_is_upsell(flow:\"IG_IMPORT_FROM_FB_UPSELL\",impression_limit_check_enabled:$impression_limit_check_enabled,recently_seen_check_enabled:$recently_seen_check_enabled,use_fx_upsell_eligibility_checker:$use_fx_upsell_eligibility_checker)");
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A00.DFA(obj);
    }
}
