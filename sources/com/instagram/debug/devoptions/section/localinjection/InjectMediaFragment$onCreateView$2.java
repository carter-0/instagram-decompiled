package com.instagram.debug.devoptions.section.localinjection;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.C59689JTv;
import X.DbV;
import android.content.Context;
import android.view.View;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalInjectionUnit;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants;
import java.util.List;
import java.util.Set;

public final class InjectMediaFragment$onCreateView$2 implements View.OnClickListener {
    public final /* synthetic */ InjectMediaFragment this$0;

    public InjectMediaFragment$onCreateView$2(InjectMediaFragment injectMediaFragment) {
        this.this$0 = injectMediaFragment;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(1655610973);
        Set set = this.this$0.savedInjectedMedia;
        if (set != null) {
            set.clear();
            InjectMediaFragment injectMediaFragment = this.this$0;
            LocalMediaInjectionController localMediaInjectionController = injectMediaFragment.injectionController;
            if (localMediaInjectionController == null) {
                str = "injectionController";
            } else {
                Set set2 = injectMediaFragment.savedInjectedMedia;
                if (set2 != null) {
                    LocalMediaInjectionConstants.InjectionContentType injectionContentType = injectMediaFragment.contentType;
                    if (injectionContentType != null) {
                        localMediaInjectionController.selectInjectionItems(set2, injectionContentType);
                        List<LocalInjectionUnit> list = this.this$0.injectionUnits;
                        if (list != null) {
                            for (LocalInjectionUnit localInjectionUnit : list) {
                                localInjectionUnit.isSelected = false;
                            }
                            InjectMediaFragment injectMediaFragment2 = this.this$0;
                            InjectionMediaSelectionAdapter injectionMediaSelectionAdapter = injectMediaFragment2.injectionMediaSelectionAdapter;
                            str = "injectionMediaSelectionAdapter";
                            if (injectionMediaSelectionAdapter != null) {
                                List list2 = injectMediaFragment2.injectionUnits;
                                if (list2 != null) {
                                    Set set3 = injectMediaFragment2.savedInjectedMedia;
                                    if (set3 != null) {
                                        injectionMediaSelectionAdapter.setMediaInjectionsList(list2, set3);
                                        InjectMediaFragment injectMediaFragment3 = this.this$0;
                                        InjectionMediaSelectionAdapter injectionMediaSelectionAdapter2 = injectMediaFragment3.injectionMediaSelectionAdapter;
                                        if (injectionMediaSelectionAdapter2 != null) {
                                            List list3 = injectMediaFragment3.injectionUnits;
                                            if (list3 != null) {
                                                injectionMediaSelectionAdapter2.updateList(list3);
                                                Context requireContext = this.this$0.requireContext();
                                                InjectMediaFragment injectMediaFragment4 = this.this$0;
                                                LocalMediaInjectionConstants.InjectionContentType injectionContentType2 = injectMediaFragment4.contentType;
                                                if (injectionContentType2 != null) {
                                                    C59689JTv.A09(requireContext, DbV.A0z(injectMediaFragment4, injectionContentType2.getValue(), 2131958061));
                                                    AnonymousClass0fD.A0C(-838832960, A05);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        0qQ.A0F("injectionUnits");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    0qQ.A0F("contentType");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("savedInjectedMedia");
        throw AnonymousClass00P.createAndThrow();
    }
}
