package X;

import androidx.fragment.app.Fragment;

public final class SuQ implements C13908Tl8 {
    public final AnonymousClass07V A00;
    public final 2YM A01;
    public final C587707f A02;
    public final /* synthetic */ Fragment A03;

    public SuQ(Fragment fragment) {
        this.A03 = fragment;
        this.A02 = fragment.getViewModelStore();
        2YM defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        0qQ.A07(defaultViewModelProviderFactory);
        this.A01 = defaultViewModelProviderFactory;
        0h9 r0 = fragment.mLifecycleRegistry;
        0qQ.A07(r0);
        this.A00 = r0;
    }

    public final /* synthetic */ AnonymousClass2YQ getDefaultViewModelCreationExtras() {
        return AnonymousClass2YP.A00;
    }

    public final 2YM getDefaultViewModelProviderFactory() {
        return this.A01;
    }

    public final AnonymousClass07V getLifecycle() {
        return this.A00;
    }

    public final 08Y getSavedStateRegistry() {
        08Y r0 = this.A03.mSavedStateRegistryController.A01;
        0qQ.A07(r0);
        return r0;
    }

    public final C587707f getViewModelStore() {
        return this.A02;
    }
}
