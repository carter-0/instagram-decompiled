package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.MVo  reason: case insensitive filesystem */
public interface C66534MVo {
    View AZq(Context context);

    boolean CIj(View view, MotionEvent motionEvent);

    boolean CNF(C60060Jeb jeb, PhotoFilter photoFilter);

    boolean CNG(C60060Jeb jeb, FilterGroupModel filterGroupModel);

    void CuZ(boolean z);

    boolean Dij(View view, ViewGroup viewGroup, C353998Kg r3, FilterGroupModel filterGroupModel);

    String getTitle();

    void onPause();

    void onResume();
}
