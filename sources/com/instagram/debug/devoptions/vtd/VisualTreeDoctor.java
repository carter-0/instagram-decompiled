package com.instagram.debug.devoptions.vtd;

import X.0qQ;
import X.0sr;
import X.2Rw;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.debug.devoptions.vtd.analysis.VtdLinearLayoutAnalyzer;
import com.instagram.debug.devoptions.vtd.analysis.VtdMultipleLayoutPassAnalyzer;
import com.instagram.debug.devoptions.vtd.analysis.VtdTreeAnalyzer;
import com.instagram.debug.devoptions.vtd.analysis.VtdViewAttachedLogger;
import com.instagram.debug.devoptions.vtd.analysis.VtdVisibilityAnalyzer;
import com.instagram.debug.devoptions.vtd.core.VtdBreadCrumb;
import com.instagram.debug.devoptions.vtd.core.VtdLifecycleEvent;
import com.instagram.debug.devoptions.vtd.output.VtdLogger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class VisualTreeDoctor {
    public final List analyzers;
    public final Set attachedRecyclers;
    public final Map breadCrumbs;
    public final VisualTreeDoctor$hierarchyChangeListener$1 hierarchyChangeListener;
    public final View.OnLayoutChangeListener layoutChangeListener;
    public final VtdLogger logger;
    public final VtdRecyclerViewAdapterDataObserver recyclerViewAdapterDataObserver;
    public final ViewGroup rootView;
    public final Set signedUpViews = new LinkedHashSet();

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, com.instagram.debug.devoptions.vtd.output.VtdLogger] */
    public VisualTreeDoctor(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 1);
        this.rootView = viewGroup;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.attachedRecyclers = linkedHashSet;
        this.recyclerViewAdapterDataObserver = new VtdRecyclerViewAdapterDataObserver(linkedHashSet, new VisualTreeDoctor$recyclerViewAdapterDataObserver$1(this), new VisualTreeDoctor$recyclerViewAdapterDataObserver$2(this));
        ? obj = new Object();
        this.logger = obj;
        this.analyzers = 0sr.A1P(new VtdTreeAnalyzer[]{new VtdVisibilityAnalyzer(obj), new VtdViewAttachedLogger(obj), new VtdLinearLayoutAnalyzer(obj), new VtdMultipleLayoutPassAnalyzer(obj)});
        this.breadCrumbs = new LinkedHashMap();
        this.hierarchyChangeListener = new VisualTreeDoctor$hierarchyChangeListener$1(this);
        this.layoutChangeListener = new VisualTreeDoctor$layoutChangeListener$1(this);
        attachToView(viewGroup);
    }

    /* access modifiers changed from: private */
    public final void attachToView(View view) {
        if (!this.signedUpViews.contains(view)) {
            view.addOnLayoutChangeListener(this.layoutChangeListener);
            this.signedUpViews.add(view);
            ArrayList A1M = 0sr.A1M(new VtdBreadCrumb[]{new VtdBreadCrumb(Calendar.getInstance().getTimeInMillis(), VtdLifecycleEvent.ATTACH)});
            this.breadCrumbs.put(view, A1M);
            for (VtdTreeAnalyzer onAttach : this.analyzers) {
                onAttach.onAttach(view, A1M);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                viewGroup.setOnHierarchyChangeListener(this.hierarchyChangeListener);
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    0qQ.A0A(childAt);
                    attachToView(childAt);
                }
            }
            if (view instanceof RecyclerView) {
                2Rw r1 = ((RecyclerView) view).A0A;
                if (r1 != null) {
                    r1.registerAdapterDataObserver(this.recyclerViewAdapterDataObserver);
                }
                this.attachedRecyclers.add(view);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void detachFromView(View view) {
        if (this.signedUpViews.contains(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                viewGroup.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    0qQ.A0A(childAt);
                    detachFromView(childAt);
                }
            }
            if (view instanceof RecyclerView) {
                try {
                    2Rw r1 = ((RecyclerView) view).A0A;
                    if (r1 != null) {
                        r1.unregisterAdapterDataObserver(this.recyclerViewAdapterDataObserver);
                    }
                } catch (Exception unused) {
                }
                this.attachedRecyclers.remove(view);
            }
            view.removeOnLayoutChangeListener(this.layoutChangeListener);
            this.signedUpViews.remove(view);
            List list = (List) this.breadCrumbs.remove(view);
            if (list != null) {
                list.add(new VtdBreadCrumb(Calendar.getInstance().getTimeInMillis(), VtdLifecycleEvent.DETACH));
                for (VtdTreeAnalyzer onDetach : this.analyzers) {
                    onDetach.onDetach(view, list);
                }
            }
        }
    }
}
