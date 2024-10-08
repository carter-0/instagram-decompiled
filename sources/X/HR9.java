package X;

import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

public abstract class HR9 {
    public static final void A00(EditorInfo editorInfo) {
        Class<SelectGesture> cls = SelectGesture.class;
        Class<DeleteGesture> cls2 = DeleteGesture.class;
        Class<SelectRangeGesture> cls3 = SelectRangeGesture.class;
        Class<DeleteRangeGesture> cls4 = DeleteRangeGesture.class;
        editorInfo.setSupportedHandwritingGestures(0sr.A1P(new Class[]{cls, cls2, cls3, cls4, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class}));
        editorInfo.setSupportedHandwritingGesturePreviews(C51967G9n.A0t(new Class[]{cls, cls2, cls3, cls4}, 0));
    }
}
