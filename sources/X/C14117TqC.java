package X;

import com.instagram.profile.fragment.UserDetailFragment;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TqC  reason: case insensitive filesystem */
public final class C14117TqC implements 1wn {
    public final /* synthetic */ UserDetailFragment A00;

    public C14117TqC(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        C322346vg r0;
        C323606xm r02;
        int A03 = AnonymousClass0fD.A03(-800482860);
        1xG r11 = (1xG) obj;
        int A032 = AnonymousClass0fD.A03(-1823100394);
        UserDetailFragment userDetailFragment = this.A00;
        String moduleName = userDetailFragment.getModuleName();
        String str = r11.A02;
        if (moduleName.equals(str)) {
            C14021ToN toN = userDetailFragment.A1C;
            String str2 = r11.A01;
            Map map = toN.A00;
            Iterator A0v = AnonymousClass7TF.A0v(map);
            while (A0v.hasNext()) {
                A0v.next();
                02m.A0p.markerAnnotate(18284548, "destination", str2);
                02m.A0p.markerEnd(18284548, 22);
            }
            map.clear();
        }
        String str3 = r11.A01;
        if ((str3.equals("clips_profile") || str3.equals(userDetailFragment.getModuleName())) && !str.equals(str3) && (r02 = userDetailFragment.A17) != null && !r02.A08.contains(str)) {
            UserDetailFragment.A0X(userDetailFragment, 1sa.A00(new Object[]{C323616xn.NOT_TRIGGERED}), Double.valueOf(182.A00(0Tu.A05, userDetailFragment.A0I, 37169974124544512L)).longValue());
        }
        if ((str3.equals("stories_precapture_camera") || str3.equals("stories_gallery") || str3.equals("feed_precapture_camera") || str3.equals("gallery_picker") || str3.equals("clips_precapture_camera") || str3.equals("clips_gallery") || str3.equals("live_precapture_camera")) && (r0 = userDetailFragment.A14) != null) {
            C234502xy r1 = r0.A00;
            if (r1 != null) {
                r1.EHu(false);
            } else {
                0qQ.A0F("musicPlayer");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        AnonymousClass0fD.A0A(289534978, A032);
        AnonymousClass0fD.A0A(423820870, A03);
    }
}
