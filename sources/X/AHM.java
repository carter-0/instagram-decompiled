package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class AHM {
    public static final C347017w8 A01(Context context, UserSession userSession, Venue venue, Integer num) {
        C347017w8 r3;
        Integer num2;
        Context context2 = context;
        0qQ.A0B(context2, 1);
        UserSession userSession2 = userSession;
        Venue venue2 = venue;
        if (num != null) {
            int intValue = num.intValue();
            Resources resources = context2.getResources();
            int A01 = AnonymousClass8XF.A01(context2);
            int A0I = AnonymousClass7TE.A0I(resources);
            int A0G = AnonymousClass7TE.A0G(resources);
            List list = C369488uq.A0T;
            C306576Mr r5 = C306576Mr.DEFAULT;
            int i = intValue;
            if (r5.ordinal() == 2) {
                i = 0nH.A04(intValue);
            }
            C369488uq r7 = new C369488uq(context2, userSession2, (C391239sZ) null, new int[]{i, i}, A01, A0I, A0G, A00(r5, intValue));
            r7.A02(venue2);
            r7.A02 = "location_sticker_text_tool_attached_subtle";
            C306576Mr r6 = C306576Mr.INVERTED;
            int i2 = intValue;
            if (r6.ordinal() == 2) {
                i2 = 0nH.A04(intValue);
            }
            Context context3 = context2;
            UserSession userSession3 = userSession2;
            C369488uq r15 = new C369488uq(context3, userSession3, (C391239sZ) null, new int[]{i2, i2}, A01, A0I, A0G, A00(r6, intValue));
            r15.A02(venue2);
            r15.A02 = "location_sticker_text_tool_attached_subtle";
            C306576Mr r62 = C306576Mr.DISABLED;
            int i3 = intValue;
            if (r62.ordinal() == 2) {
                i3 = 0nH.A04(intValue);
            }
            Context context4 = context2;
            UserSession userSession4 = userSession2;
            C369488uq r16 = new C369488uq(context4, userSession4, (C391239sZ) null, new int[]{i3, i3}, A01, A0I, A0G, A00(r62, intValue));
            r16.A02(venue2);
            r16.A02 = "location_sticker_text_tool_attached_subtle";
            r3 = new C347017w8(context2, userSession2, Arrays.asList(new Drawable[]{r7, r15, r16}));
            num2 = Integer.valueOf(intValue);
        } else {
            boolean A012 = C346897vw.A01(userSession2);
            Resources resources2 = context2.getResources();
            int A013 = AnonymousClass8XF.A01(context2);
            int A0I2 = AnonymousClass7TE.A0I(resources2);
            int A0G2 = AnonymousClass7TE.A0G(resources2);
            ArrayList A1C = AnonymousClass7TE.A1C();
            if (A012) {
                Iterator A0s = AnonymousClass7TF.A0s(0Yt.A07(new 0eP[]{AnonymousClass7TE.A1L(C391239sZ.DEFAULT, "location_sticker_redesign_default"), AnonymousClass7TE.A1L(C391239sZ.SUBTLE_REDESIGN, "location_sticker_redesign_subtle"), AnonymousClass7TE.A1L(C391239sZ.RAINBOW_REDESIGN, "location_sticker_redesign_rainbow"), AnonymousClass7TE.A1L(C391239sZ.HERO_REDESIGN, "location_sticker_redesign_hero"), AnonymousClass7TE.A1L(C391239sZ.VIBRANT_REDESIGN, "location_sticker_redesign_vibrant"), AnonymousClass7TE.A1L(C391239sZ.MONOTONE, "location_sticker_redesign_monotone")}));
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    C369488uq r72 = new C369488uq(context2, userSession2, (C391239sZ) A1J.getKey(), A013, A0I2, A0G2);
                    r72.A02(venue2);
                    r72.A02 = (String) A1J.getValue();
                    A1C.add(r72);
                }
            } else {
                List list2 = C369488uq.A0T;
                C369488uq r73 = new C369488uq(context2, userSession2, C391239sZ.VIBRANT, A013, A0I2, A0G2);
                r73.A02(venue2);
                r73.A02 = "location_sticker_vibrant";
                A1C.add(r73);
                C369488uq r74 = new C369488uq(context2, userSession2, C391239sZ.SUBTLE, A013, A0I2, A0G2);
                r74.A02(venue2);
                r74.A02 = "location_sticker_subtle";
                A1C.add(r74);
                C369488uq r75 = new C369488uq(context2, userSession2, C391239sZ.RAINBOW, A013, A0I2, A0G2);
                r75.A02(venue2);
                r75.A02 = "location_sticker_rainbow";
                A1C.add(r75);
                C369488uq r76 = new C369488uq(context2, userSession2, C391239sZ.HERO, A013, A0I2, A0G2);
                r76.A02(venue2);
                r76.A02 = "location_sticker_hero";
                A1C.add(r76);
            }
            r3 = new C347017w8(context2, userSession2, A1C);
            num2 = null;
        }
        r3.A03 = new C387349m4(venue2, num2);
        return r3;
    }

    public static final void A02(C347017w8 r6, int i) {
        ArrayList A06 = r6.A06(C369488uq.class);
        C369488uq r3 = (C369488uq) A06.get(0);
        C306576Mr r2 = C306576Mr.DEFAULT;
        int i2 = i;
        if (r2.ordinal() == 2) {
            i2 = 0nH.A04(i);
        }
        r3.A04 = new int[]{i2, i2};
        C369488uq.A01(r3);
        r3.invalidateSelf();
        C369488uq r1 = (C369488uq) A06.get(0);
        r1.A00 = A00(r2, i);
        r1.invalidateSelf();
        C369488uq r32 = (C369488uq) A06.get(1);
        C306576Mr r22 = C306576Mr.INVERTED;
        int i3 = i;
        if (r22.ordinal() == 2) {
            i3 = 0nH.A04(i);
        }
        r32.A04 = new int[]{i3, i3};
        C369488uq.A01(r32);
        r32.invalidateSelf();
        C369488uq r12 = (C369488uq) A06.get(1);
        r12.A00 = A00(r22, i);
        r12.invalidateSelf();
        C369488uq r33 = (C369488uq) A06.get(2);
        C306576Mr r23 = C306576Mr.DISABLED;
        int i4 = i;
        if (r23.ordinal() == 2) {
            i4 = 0nH.A04(i);
        }
        r33.A04 = new int[]{i4, i4};
        C369488uq.A01(r33);
        r33.invalidateSelf();
        C369488uq r13 = (C369488uq) A06.get(2);
        r13.A00 = A00(r23, i);
        r13.invalidateSelf();
    }

    public static final void A03(C347017w8 r4, C306576Mr r5) {
        int ordinal = r5.ordinal();
        if (ordinal == 1) {
            r4.A0B(0);
        } else if (ordinal == 2) {
            r4.A0B(1);
        } else if (ordinal == 0) {
            r4.A0B(2);
        }
    }

    public static final int A00(C306576Mr r2, int i) {
        int ordinal = r2.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return i;
            }
            if (ordinal == 0) {
                int A04 = 0nH.A04(i);
                return Color.argb(64, Color.red(A04), Color.green(A04), Color.blue(A04));
            }
        }
        return 0nH.A04(i);
    }
}
