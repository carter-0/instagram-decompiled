package X;

import java.util.HashSet;

/* renamed from: X.92i  reason: invalid class name and case insensitive filesystem */
public abstract class C3727692i {
    public static final HashSet A00(boolean z, boolean z2) {
        C3727792j r0;
        C3727792j r02;
        HashSet hashSet = new HashSet();
        hashSet.add(C3727792j.STORY_HIGHLIGHTS);
        hashSet.add(C3727792j.USER_STORY);
        if (z) {
            r0 = C3727792j.GRAPHQL_PROFILE_FEED;
        } else {
            r0 = C3727792j.PROFILE_FEED;
        }
        hashSet.add(r0);
        if (z2) {
            r02 = C3727792j.GRAPHQL_USER_INFO;
        } else {
            r02 = C3727792j.USER_INFO;
        }
        hashSet.add(r02);
        return hashSet;
    }
}
