package X;

import com.instagram.settings2.core.session.SettingsSession;
import com.instagram.settings2.core.viewmodel.UiStateKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.settings2.core.viewmodel.UiStateKt", f = "UiState.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {304, 310, 319, 321, 323}, m = "toUiState", n = {"$this$toUiState", "settingsSession", "modelFactory", "$this$toUiState", "settingsSession", "modelFactory", "$this$toUiState", "settingsSession", "value", "stateCode", "inProgressValue", "$this$toUiState", "settingsSession", "value", "stateCode", "inProgressValue", "headerValue", "optionsValue", "accessibilityLabelValue", "bannerValue", "enabledValue"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0"})
public final class MDS extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public boolean A0A;
    public /* synthetic */ Object A0B;

    public MDS(AnonymousClass4D7 r1) {
        super(r1);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.MDS, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A0B = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return UiStateKt.A04((C61242Jza) null, (SettingsSession) null, (I4T) null, this);
    }
}
