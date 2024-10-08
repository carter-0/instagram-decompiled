package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.fundraiser.coverphotopicker.FundraiserPhotoPickerGalleryTabFragment;
import com.instagram.wellbeing.fundraiser.coverphotopicker.FundraiserPhotoPickerPostsTabFragment;
import java.util.List;

/* renamed from: X.JfP  reason: case insensitive filesystem */
public final class C60083JfP extends 0ho {
    public FundraiserPhotoPickerGalleryTabFragment A00;
    public FundraiserPhotoPickerPostsTabFragment A01;
    public final L9U A02;
    public final UserSession A03;
    public final List A04;

    public final int getCount() {
        return this.A04.size();
    }

    public C60083JfP(Fragment fragment, L9U l9u, UserSession userSession, List list) {
        super(fragment.getParentFragmentManager(), 1);
        this.A02 = l9u;
        this.A03 = userSession;
        this.A04 = list;
    }

    public final Fragment A00(int i) {
        Fragment fragment;
        Bundle A0a = AnonymousClass7TE.A0a();
        DbU.A1D(A0a, this.A03);
        int ordinal = ((C62446Kfw) this.A04.get(i)).ordinal();
        if (ordinal == 0) {
            fragment = this.A01;
            if (fragment == null) {
                fragment = new C273374mT();
                this.A01 = fragment;
                fragment.A00 = this.A02;
            }
            return fragment;
        } else if (ordinal == 1) {
            fragment = this.A00;
            if (fragment == null) {
                fragment = new C273374mT();
                this.A00 = fragment;
                fragment.A00 = this.A02;
            }
            return fragment;
        } else {
            throw AnonymousClass7TE.A0w("Fragment position cannot be more than 1.");
        }
        fragment.setArguments(A0a);
        return fragment;
    }
}
