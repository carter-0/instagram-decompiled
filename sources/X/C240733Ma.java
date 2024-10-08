package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.3Ma  reason: invalid class name and case insensitive filesystem */
public final class C240733Ma {
    public final ViewGroup A00;
    public final View A01;

    public C240733Ma(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 1);
        View requireViewById = viewGroup.requireViewById(R.id.reels_tray_container);
        0qQ.A07(requireViewById);
        this.A00 = (ViewGroup) requireViewById;
        this.A01 = viewGroup.findViewById(R.id.group_story_arrow_icon);
    }
}
