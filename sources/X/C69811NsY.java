package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.bugreporter.BugReportComposerFragment;

/* renamed from: X.NsY  reason: case insensitive filesystem */
public abstract class C69811NsY {
    public static final BugReportComposerFragment A00(Parcelable parcelable, Parcelable parcelable2, C74547Pwg pwg, String str) {
        AnonymousClass7TF.A1C(str, 0, pwg);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        A0a.putParcelable("BugReportComposerFragment.ARGUMENT_BUGREPORT", parcelable);
        A0a.putParcelable("BugReportComposerFragment.ARGUMENT_VIEWMODEL", parcelable2);
        A0a.putAll(pwg.E2f());
        BugReportComposerFragment bugReportComposerFragment = new BugReportComposerFragment();
        bugReportComposerFragment.setArguments(A0a);
        return bugReportComposerFragment;
    }
}
