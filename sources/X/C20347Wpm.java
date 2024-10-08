package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.user.model.UpcomingEvent;
import java.io.File;
import java.io.IOException;

/* renamed from: X.Wpm  reason: case insensitive filesystem */
public final class C20347Wpm implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ 28D A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ UpcomingEvent A04;
    public final /* synthetic */ File A05;

    public C20347Wpm(Activity activity, Fragment fragment, 28D r3, UserSession userSession, UpcomingEvent upcomingEvent, File file) {
        this.A05 = file;
        this.A02 = r3;
        this.A04 = upcomingEvent;
        this.A03 = userSession;
        this.A00 = activity;
        this.A01 = fragment;
    }

    public final void run() {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("ReelUpcomingEventConstants.ARG_KEY_FILE_PATH", this.A05.getCanonicalPath());
            bundle.putSerializable("ReelUpcomingEventConstants.ARG_KEY_CAMERA_ENTRY_POINT", this.A02);
            bundle.putParcelable("ReelUpcomingEventConstants.ARG_KEY_UPCOMING_EVENT", this.A04);
            String A002 = C273654mx.A00(3246);
            AnonymousClass6W8.A02(this.A00, bundle, this.A03, TransparentModalActivity.class, A002).A0D(this.A01, 101);
        } catch (IOException unused) {
            0wb.A03(AnonymousClass000.A00(1158), AnonymousClass000.A00(950));
        }
    }
}
