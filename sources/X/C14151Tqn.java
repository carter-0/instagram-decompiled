package X;

import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Tqn  reason: case insensitive filesystem */
public final class C14151Tqn extends AnonymousClass369 {
    public final C320216s0 A00;
    public final C14031ToX A01;
    public final Set A02 = new HashSet();

    public final Class C9I() {
        return C17674Vc5.class;
    }

    public final void FN9(AnonymousClass345 r6, int i) {
        Object A012 = this.A01.A01(i);
        if (A012 instanceof C17674Vc5) {
            C17674Vc5 vc5 = (C17674Vc5) A012;
            Integer A002 = C18214Vne.A00(vc5);
            if (A002 != null) {
                int intValue = A002.intValue();
                if (intValue == 0) {
                    Hashtag hashtag = vc5.A00;
                    if (hashtag == null) {
                        throw new IllegalStateException("Required value was null.");
                    } else if (this.A02.add(hashtag.getId())) {
                        C320216s0 r2 = this.A00;
                        if (r2.A03.add(hashtag.getId())) {
                            r2.A00.A00(hashtag, "similar_entity_impression", i);
                        }
                    }
                } else if (intValue == 1) {
                    User user = vc5.A02;
                    if (user == null) {
                        throw new IllegalStateException("Required value was null.");
                    } else if (this.A02.add(user.getId())) {
                        this.A00.A0A(user, i);
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public C14151Tqn(C320216s0 r2, C14031ToX toX) {
        this.A01 = toX;
        this.A00 = r2;
    }
}
