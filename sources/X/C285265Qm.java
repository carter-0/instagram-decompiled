package X;

import android.content.res.Resources;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.5Qm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C285265Qm extends 03J implements 0sK {
    public C285265Qm(Object obj) {
        super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((C288025bF) obj2).A00;
        Resources resources = ((View) this.receiver).getContext().getResources();
        new C52843GdZ(new AnonymousClass5Q7(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), (0sP) obj3, j);
        throw new NullPointerException("getClipData");
    }
}
