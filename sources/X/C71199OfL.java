package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import com.instagram.model.reels.Reel;

/* renamed from: X.OfL  reason: case insensitive filesystem */
public final class C71199OfL implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ AnonymousClass0iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C270184gK A05;
    public final /* synthetic */ Reel A06;
    public final /* synthetic */ AnonymousClass3Q2 A07;
    public final /* synthetic */ String A08;

    public C71199OfL(Activity activity, Fragment fragment, AnonymousClass0iw r3, AnonymousClass0iw r4, UserSession userSession, C270184gK r6, Reel reel, AnonymousClass3Q2 r8, String str) {
        this.A07 = r8;
        this.A00 = activity;
        this.A04 = userSession;
        this.A03 = r3;
        this.A06 = reel;
        this.A05 = r6;
        this.A01 = fragment;
        this.A02 = r4;
        this.A08 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A07.A3k = null;
        Activity activity = this.A00;
        UserSession userSession = this.A04;
        C63403KwO.A00(activity, this.A03, userSession, this.A05, this.A06);
        C59689JTv.A07(activity, 2131954733);
        new 2YN(new C351728Ab(activity, this.A02, userSession), this.A01).A00(StoryDraftsCreationViewModel.class).A03(this.A08);
    }
}
