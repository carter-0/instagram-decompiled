package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.5Gi  reason: invalid class name and case insensitive filesystem */
public final class C283155Gi {
    public int A00;
    public C49876FBa A01;
    public 1Xj A02;
    public C283185Gl A03 = new C283185Gl();
    public C283165Gj A04 = new C283165Gj();
    public C283195Gm A05;
    public Integer A06 = AnonymousClass05K.A15;
    public Integer A07 = AnonymousClass05K.A00;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public HashSet A0F;

    public final boolean equals(Object obj) {
        C283155Gi r5;
        String str;
        if (this != obj) {
            if (obj == null || obj.getClass() != getClass() || ((str = r5.A09) != null && !str.equals(this.A09))) {
                return false;
            }
            String str2 = (r5 = (C283155Gi) obj).A0D;
            if (str2 != null && !str2.equals(this.A0D)) {
                return false;
            }
            C283185Gl r1 = r5.A03;
            return r1 == null || r1.equals(this.A03);
        }
    }

    public final long A00() {
        return ((Number) this.A04.A1G.getValue()).longValue();
    }

    public final ImageUrl A01() {
        return (ImageUrl) this.A04.A19.getValue();
    }

    public final HashtagImpl A02() {
        C283165Gj r4 = this.A04;
        C283165Gj r1 = r4;
        HashtagImpl hashtagImpl = r4.A02;
        if (hashtagImpl == null) {
            return null;
        }
        if (r4.A01 != null) {
            C18023Vjz vjz = new C18023Vjz(hashtagImpl);
            r1 = this.A04;
            vjz.A00 = r1.A01;
            r4.A02 = vjz.A01();
        }
        return r1.A02;
    }

    public final C46518DgL A03() {
        return (C46518DgL) this.A04.A1D.getValue();
    }

    public final User A04() {
        C376529Ii r0 = this.A04.A08;
        if (r0 != null) {
            return (User) r0.A02;
        }
        return null;
    }

    public final Double A05() {
        return Double.valueOf(((Number) this.A04.A1H.getValue()).doubleValue());
    }

    public final String A06() {
        return (String) this.A04.A15.getValue();
    }

    public final String A07() {
        return (String) this.A04.A17.getValue();
    }

    public final String A08() {
        C283175Gk r0 = this.A04.A0I;
        if (r0 != null) {
            return r0.A0I;
        }
        return null;
    }

    public final String A09(String str) {
        return (String) ((Map) this.A04.A1E.getValue()).get(str);
    }

    public final String A0A(String str) {
        return (String) ((Map) this.A04.A13.getValue()).get(str);
    }

    public final String A0B(String str) {
        return (String) ((Map) this.A04.A16.getValue()).get(str);
    }

    public final HashSet A0C() {
        String A092;
        if (this.A05 == C283195Gm.BUNDLE_WITH_ICON) {
            boolean z = false;
            if (this.A04.A1D.getValue() != null) {
                z = true;
            }
            if (z && (A092 = A09("associated_story_pks")) != null) {
                try {
                    JSONArray jSONArray = new JSONArray(A092);
                    HashSet hashSet = new HashSet(jSONArray.length());
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        hashSet.add(jSONArray.getString(i));
                    }
                    this.A0F = hashSet;
                } catch (JSONException unused) {
                }
            }
        }
        return this.A0F;
    }

    public final Map A0D() {
        C283175Gk r0 = this.A04.A0I;
        if (r0 != null) {
            return (Map) r0.A0L.getValue();
        }
        return Collections.emptyMap();
    }

    public final void A0E() {
        C283165Gj r1 = this.A04;
        if (r1.A03 != null) {
            r1.A03 = true;
        }
    }

    public final boolean A0F() {
        Boolean bool = this.A04.A04;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0G() {
        if (C46518DgL.A1H == this.A04.A1D.getValue()) {
            return true;
        }
        return false;
    }

    public final boolean A0H() {
        BBV bbv = this.A04.A0B;
        if (bbv == null) {
            return false;
        }
        return "unseen".equals(bbv.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A09, this.A0D});
    }
}
