package com.instagram.debug.devoptions.section.localinjection;

import X.00k;
import X.00l;
import X.0qQ;
import X.0sn;
import X.2Yu;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0fU;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C227642jf;
import X.C66582MXn;
import X.DbX;
import X.G77;
import X.JTR;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.section.localinjection.InjectionMediaSelectionAdapter;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalInjectionUnit;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionDataStoreManager;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionFetcher;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.ui.widget.trianglespinner.TriangleSpinner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class InjectMediaFragment extends AnonymousClass4DH implements G77, InjectionMediaSelectionAdapter.Delegate {
    public IgTextView clearAllButton;
    public LocalMediaInjectionConstants.InjectionContentType contentType;
    public LocalMediaInjectionDataStoreManager dataStoreManager;
    public LocalMediaInjectionController injectionController;
    public InjectionMediaSelectionAdapter injectionMediaSelectionAdapter;
    public List injectionUnits;
    public IgdsInlineSearchBox inlineSearchBox;
    public List options = 0sn.A00;
    public Set savedInjectedMedia;
    public View searchEmptyState;
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);
    public TriangleSpinner surfaceSelector;

    public String getModuleName() {
        return "inject_media_fragment";
    }

    public void onItemSelectionChanged(Set set) {
        String str;
        0qQ.A0B(set, 0);
        this.savedInjectedMedia = set;
        LocalMediaInjectionController localMediaInjectionController = this.injectionController;
        if (localMediaInjectionController == null) {
            str = "injectionController";
        } else {
            LocalMediaInjectionConstants.InjectionContentType injectionContentType = this.contentType;
            if (injectionContentType == null) {
                str = "contentType";
            } else {
                localMediaInjectionController.selectInjectionItems(set, injectionContentType);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public void onSearchCleared(String str) {
        0qQ.A0B(str, 0);
        filterListWithQuery(str);
        IgdsInlineSearchBox igdsInlineSearchBox = this.inlineSearchBox;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.setVisibilityOfClearButton(false);
        }
    }

    public void onSearchTextChanged(String str) {
        0qQ.A0B(str, 0);
        filterListWithQuery(str);
        IgdsInlineSearchBox igdsInlineSearchBox = this.inlineSearchBox;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.setVisibilityOfClearButton(AnonymousClass7TF.A1R(str.length()));
        }
    }

    private final void filterListWithQuery(String str) {
        int i;
        String str2;
        ArrayList arrayList = new ArrayList();
        String A0w = C66582MXn.A0w(str);
        List list = this.injectionUnits;
        if (list == null) {
            str2 = "injectionUnits";
        } else {
            Iterator it = list.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                LocalInjectionUnit localInjectionUnit = (LocalInjectionUnit) it.next();
                if (00l.A0d(C66582MXn.A0w(localInjectionUnit.unitName), A0w, false)) {
                    arrayList.add(localInjectionUnit);
                }
            }
            View view = this.searchEmptyState;
            if (view != null) {
                if (!arrayList.isEmpty()) {
                    i = 8;
                }
                view.setVisibility(i);
            }
            InjectionMediaSelectionAdapter injectionMediaSelectionAdapter2 = this.injectionMediaSelectionAdapter;
            if (injectionMediaSelectionAdapter2 == null) {
                str2 = "injectionMediaSelectionAdapter";
            } else {
                injectionMediaSelectionAdapter2.updateList(arrayList);
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    /* access modifiers changed from: private */
    public final void updateList(TriangleSpinner triangleSpinner, IgTextView igTextView, IgdsInlineSearchBox igdsInlineSearchBox) {
        String str;
        LocalMediaInjectionConstants.InjectionContentType fromValue = LocalMediaInjectionConstants.InjectionContentType.Companion.fromValue(triangleSpinner.getSelectedItem().toString());
        if (fromValue != null) {
            this.contentType = fromValue;
            LocalMediaInjectionDataStoreManager fetchInjectionData = LocalMediaInjectionFetcher.fetchInjectionData(fromValue);
            this.dataStoreManager = fetchInjectionData;
            if (fetchInjectionData == null) {
                str = "dataStoreManager";
            } else {
                this.injectionUnits = fetchInjectionData.getAllInjectionItems();
                LocalMediaInjectionController localMediaInjectionController = this.injectionController;
                if (localMediaInjectionController == null) {
                    str = "injectionController";
                } else {
                    LocalMediaInjectionConstants.InjectionContentType injectionContentType = this.contentType;
                    if (injectionContentType != null) {
                        this.savedInjectedMedia = 00k.A0j(localMediaInjectionController.getSelectedInjectionItems(injectionContentType));
                        List list = this.injectionUnits;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (true) {
                                str = "savedInjectedMedia";
                                if (it.hasNext()) {
                                    LocalInjectionUnit localInjectionUnit = (LocalInjectionUnit) it.next();
                                    Set set = this.savedInjectedMedia;
                                    if (set == null) {
                                        break;
                                    }
                                    localInjectionUnit.isSelected = set.contains(localInjectionUnit.unitId);
                                } else {
                                    InjectionMediaSelectionAdapter injectionMediaSelectionAdapter2 = this.injectionMediaSelectionAdapter;
                                    if (injectionMediaSelectionAdapter2 == null) {
                                        str = "injectionMediaSelectionAdapter";
                                    } else {
                                        List list2 = this.injectionUnits;
                                        if (list2 != null) {
                                            Set set2 = this.savedInjectedMedia;
                                            if (set2 != null) {
                                                injectionMediaSelectionAdapter2.setMediaInjectionsList(list2, set2);
                                                filterListWithQuery(igdsInlineSearchBox.getSearchString());
                                                LocalMediaInjectionConstants.InjectionContentType injectionContentType2 = this.contentType;
                                                if (injectionContentType2 != null) {
                                                    DbX.A1F(igTextView, this, injectionContentType2.getValue(), 2131958060);
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
        throw AnonymousClass7TE.A0y();
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1849158973);
        InjectMediaFragment.super.onCreate(bundle);
        0sn stringArrayList = requireArguments().getStringArrayList(LocalMediaInjectionConstants.CONTENT_TYPE_KEY);
        if (stringArrayList == null) {
            stringArrayList = 0sn.A00;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            LocalMediaInjectionConstants.InjectionContentType.Companion companion = LocalMediaInjectionConstants.InjectionContentType.Companion;
            0qQ.A0A(A18);
            LocalMediaInjectionConstants.InjectionContentType fromValue = companion.fromValue(A18);
            if (fromValue != null) {
                arrayList.add(fromValue);
            }
        }
        this.options = arrayList;
        AnonymousClass0fD.A09(-570446958, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-128012576);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.inject_media_fragment, viewGroup, false);
        this.searchEmptyState = inflate.requireViewById(R.id.injection_media_empty_state);
        Context requireContext = requireContext();
        List<LocalMediaInjectionConstants.InjectionContentType> list = this.options;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (LocalMediaInjectionConstants.InjectionContentType value : list) {
            A0r.add(value.getValue());
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext, R.layout.inject_media_spinner_title, A0r);
        arrayAdapter.setDropDownViewResource(R.layout.inject_media_spinner_item);
        View requireViewById = inflate.requireViewById(R.id.surface_selection_spinner);
        TriangleSpinner triangleSpinner = (TriangleSpinner) requireViewById;
        this.surfaceSelector = triangleSpinner;
        0qQ.A07(requireViewById);
        triangleSpinner.setTriangleColor(requireContext().getColor(2Yu.A0B(getContext())));
        triangleSpinner.setAdapter(arrayAdapter);
        LocalMediaInjectionConstants.InjectionContentType fromValue = LocalMediaInjectionConstants.InjectionContentType.Companion.fromValue(triangleSpinner.getSelectedItem().toString());
        if (fromValue != null) {
            this.contentType = fromValue;
            String str = "contentType";
            this.dataStoreManager = LocalMediaInjectionFetcher.fetchInjectionData(fromValue);
            this.injectionController = new LocalMediaInjectionController(requireContext());
            LocalMediaInjectionDataStoreManager localMediaInjectionDataStoreManager = this.dataStoreManager;
            if (localMediaInjectionDataStoreManager == null) {
                str = "dataStoreManager";
            } else {
                this.injectionUnits = localMediaInjectionDataStoreManager.getAllInjectionItems();
                LocalMediaInjectionController localMediaInjectionController = this.injectionController;
                if (localMediaInjectionController == null) {
                    str = "injectionController";
                } else {
                    LocalMediaInjectionConstants.InjectionContentType injectionContentType = this.contentType;
                    if (injectionContentType != null) {
                        Set A0j = 00k.A0j(localMediaInjectionController.getSelectedInjectionItems(injectionContentType));
                        this.savedInjectedMedia = A0j;
                        List list2 = this.injectionUnits;
                        if (list2 == null) {
                            str = "injectionUnits";
                        } else {
                            this.injectionMediaSelectionAdapter = new InjectionMediaSelectionAdapter(this, list2, A0j);
                            RecyclerView A0c = JTR.A0c(inflate, R.id.injection_media_recycler_view);
                            InjectionMediaSelectionAdapter injectionMediaSelectionAdapter2 = this.injectionMediaSelectionAdapter;
                            if (injectionMediaSelectionAdapter2 == null) {
                                str = "injectionMediaSelectionAdapter";
                            } else {
                                A0c.setAdapter(injectionMediaSelectionAdapter2);
                                A0c.A15(new InjectMediaFragment$onCreateView$1());
                                IgTextView requireViewById2 = inflate.requireViewById(R.id.clear_all_button);
                                IgTextView igTextView = requireViewById2;
                                this.clearAllButton = igTextView;
                                0qQ.A07(requireViewById2);
                                LocalMediaInjectionConstants.InjectionContentType injectionContentType2 = this.contentType;
                                if (injectionContentType2 != null) {
                                    DbX.A1F(igTextView, this, injectionContentType2.getValue(), 2131958060);
                                    AnonymousClass0fU.A00(new InjectMediaFragment$onCreateView$2(this), igTextView);
                                    View requireViewById3 = inflate.requireViewById(R.id.injection_search_bar);
                                    IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) requireViewById3;
                                    this.inlineSearchBox = igdsInlineSearchBox;
                                    0qQ.A07(requireViewById3);
                                    igdsInlineSearchBox.A02 = this;
                                    igdsInlineSearchBox.setImeOptions(6);
                                    triangleSpinner.setOnItemSelectedListener(new InjectMediaFragment$onCreateView$3(this, triangleSpinner, igTextView, igdsInlineSearchBox));
                                    AnonymousClass0fD.A09(-142296417, A02);
                                    return inflate;
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(1471133730, A02);
        throw A0y;
    }

    public void onDestroyView() {
        int A02 = AnonymousClass0fD.A02(-1752806062);
        super.onDestroyView();
        this.inlineSearchBox = null;
        this.surfaceSelector = null;
        this.clearAllButton = null;
        this.searchEmptyState = null;
        AnonymousClass0fD.A09(-1315921167, A02);
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}
