package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.F0q  reason: case insensitive filesystem */
public final class C49659F0q {
    public Hashtag A00;
    public final Activity A01;
    public final Context A02;
    public final Fragment A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final C51930G7y A06;
    public final String A07;
    public final C49530ExC A08;

    public C49659F0q(Fragment fragment, AnonymousClass0iw r3, UserSession userSession, C51930G7y g7y, Hashtag hashtag, C49530ExC exC, String str) {
        0qQ.A0B(hashtag, 3);
        AnonymousClass7TG.A1S(userSession, str);
        0qQ.A0B(g7y, 7);
        this.A03 = fragment;
        this.A02 = fragment.getContext();
        this.A01 = fragment.getActivity();
        this.A04 = r3;
        this.A00 = hashtag;
        this.A05 = userSession;
        this.A07 = str;
        this.A06 = g7y;
        this.A08 = exC;
    }
}
