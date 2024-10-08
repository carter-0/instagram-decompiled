package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.L8p  reason: case insensitive filesystem */
public final class C63834L8p {
    public final ImmutableList A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C63834L8p(ImmutableList immutableList, UserSession userSession, String str, String str2, List list) {
        DbW.A1N(userSession, 1, list);
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = immutableList;
        this.A04 = list;
    }
}
