package X;

import android.graphics.PointF;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.79H  reason: invalid class name */
public abstract class AnonymousClass79H {
    public final int A00;
    public final PointF A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final UserSession A04;
    public final ImageUrl A05;
    public final AnonymousClass9HC A06;
    public final C2607246u A07;
    public final C329967Kx A08;
    public final 2FW A09;
    public final MessageIdentifier A0A;
    public final Long A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final Map A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof AnonymousClass79H)) {
                return false;
            }
            AnonymousClass79H r4 = (AnonymousClass79H) obj;
            if (!0qQ.A0K(this.A02, r4.A02) || !0qQ.A0K(this.A03, r4.A03) || !0qQ.A0K(this.A07, r4.A07) || !0qQ.A0K(this.A0C, r4.A0C) || !0qQ.A0K(this.A0G, r4.A0G) || !0qQ.A0K(this.A0F, r4.A0F) || !0qQ.A0K(this.A0D, r4.A0D) || this.A0L != r4.A0L || this.A0K != r4.A0K || !0qQ.A0K(this.A06, r4.A06) || !0qQ.A0K(this.A01, r4.A01) || !0qQ.A0K(this.A0E, r4.A0E) || this.A0M != r4.A0M) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass79H(PointF pointF, UserSession userSession, ImageUrl imageUrl, AnonymousClass9HC r5, C2607246u r6, C329967Kx r7, 2FW r8, MessageIdentifier messageIdentifier, Long l, String str, String str2, String str3, String str4, String str5, List list, List list2, Map map, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A04 = userSession;
        this.A07 = r6;
        this.A05 = imageUrl;
        this.A0C = str;
        this.A00 = i;
        this.A0A = messageIdentifier;
        this.A0G = str2;
        this.A0F = str3;
        this.A0D = str4;
        this.A0H = map;
        this.A0L = z;
        this.A08 = r7;
        this.A0K = z2;
        this.A06 = r5;
        this.A09 = r8;
        this.A01 = pointF;
        this.A0E = str5;
        this.A0J = z3;
        this.A0I = z4;
        this.A0B = l;
        this.A0M = z5;
        ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
        0qQ.A07(copyOf);
        this.A02 = copyOf;
        ImmutableList copyOf2 = ImmutableList.copyOf((Collection) list2);
        0qQ.A07(copyOf2);
        this.A03 = copyOf2;
    }
}
