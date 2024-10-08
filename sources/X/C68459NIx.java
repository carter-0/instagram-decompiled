package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.NIx  reason: case insensitive filesystem */
public final class C68459NIx extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DirectManageFoldersCreateFolderFragment";
    public C70933OSg A00;
    public List A01;
    public final C284945Oz A02;
    public final C284945Oz A03;
    public final C284945Oz A04;
    public final List A05 = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final AnonymousClass0eM A08;
    public final String A09 = "direct_manage_folders_edit";

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eom(2131959679);
        DbX.A1A(C71401Ok0.A00(this, 0), DbX.A0M(), r4);
    }

    public final String getModuleName() {
        return this.A09;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public C68459NIx() {
        C284885Or A002 = C289465dd.A00();
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A03 = new ParcelableSnapshotMutableState(A002, "");
        this.A04 = new ParcelableSnapshotMutableState(C289465dd.A00(), AnonymousClass7TE.A0u());
        this.A02 = new ParcelableSnapshotMutableState(C289465dd.A00(), IPY.A00);
        this.A06 = AnonymousClass0eN.A01(new C46570DhC(this, 40));
        this.A08 = AnonymousClass0eN.A01(new C46570DhC(this, 43));
    }

    public final void onCreate(Bundle bundle) {
        List<2PM> list;
        int A022 = AnonymousClass0fD.A02(-2123441868);
        C68459NIx.super.onCreate(bundle);
        AnonymousClass0eM r2 = this.A07;
        this.A00 = new C70933OSg(AnonymousClass7TE.A0l(r2));
        2ED r4 = 2L2.A00(AnonymousClass7TE.A0l(r2)).A0C;
        ReentrantReadWriteLock reentrantReadWriteLock = r4.A0G;
        if (r4.A0L) {
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            readLock.lock();
            try {
                list = C73429PcU.A00(r4.A00.A06(), 26);
            } finally {
                readLock.unlock();
            }
        } else {
            synchronized (r4.A0D) {
                list = C73429PcU.A00(r4.A00.A06(), 26);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (2PM r0 : list) {
            A0r.add(r0.A02);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A0r.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((String) next).length() > 0) {
                A1C.add(next);
            }
        }
        this.A01 = A1C;
        C70933OSg oSg = this.A00;
        if (oSg == null) {
            0qQ.A0F("logger");
            throw AnonymousClass00P.createAndThrow();
        }
        Object value = this.A06.getValue();
        0qQ.A0B(value, 0);
        C70933OSg.A00(oSg, "inbox_folders_create_screen_impression", AnonymousClass7TF.A0w(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, value));
        AnonymousClass0fD.A09(608826679, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1601518440);
        ComposeView A0H = DbV.A0H(this, new C59110J6s(this, 22), -781386006);
        AnonymousClass0fD.A09(402978832, A022);
        return A0H;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1092997320);
        super.onDestroy();
        DbX.A0R(this.A07).A04("MOVE_THREADS_TO_NEW_FOLDER_LISTENER_TAG");
        AnonymousClass0fD.A09(-1243278416, A022);
    }
}
