package X;

import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Ulk  reason: case insensitive filesystem */
public final class C15968Ulk extends AnonymousClass369 {
    public final C14029ToV A00;
    public final C320226s1 A01;
    public final Set A02 = new HashSet();
    public final Set A03 = new HashSet();

    public final Class C9I() {
        return C17674Vc5.class;
    }

    public final void FN9(AnonymousClass345 r6, int i) {
        Object obj = this.A00.A00.get(i);
        if (obj instanceof C17674Vc5) {
            C17674Vc5 vc5 = (C17674Vc5) obj;
            Integer A002 = C18214Vne.A00(vc5);
            if (A002 != null) {
                int intValue = A002.intValue();
                if (intValue == 0) {
                    Hashtag hashtag = vc5.A00;
                    if (hashtag == null) {
                        throw new IllegalStateException("Required value was null.");
                    } else if (this.A02.add(hashtag.getId())) {
                        this.A01.A00(hashtag, "similar_entity_impression", i);
                    }
                } else if (intValue == 1) {
                    User user = vc5.A02;
                    if (user == null) {
                        throw new IllegalStateException("Required value was null.");
                    } else if (this.A03.add(user.getId())) {
                        this.A01.A01(user, "similar_entity_impression", i);
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public C15968Ulk(C14029ToV toV, C320226s1 r3) {
        this.A01 = r3;
        this.A00 = toV;
    }
}
