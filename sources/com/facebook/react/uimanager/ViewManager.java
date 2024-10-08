package com.facebook.react.uimanager;

import X.0I1;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C17763VfZ;
import X.C18401Vr3;
import X.C18715Vyl;
import X.C19061WIq;
import X.C20829X0e;
import X.C20831X0g;
import X.C245103cK;
import X.C51968G9o;
import X.DbT;
import X.QZK;
import X.QZL;
import X.U3r;
import X.X62;
import X.XCN;
import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public abstract class ViewManager extends BaseJavaModule {
    public static final String NAME = "ViewManager";
    public HashMap mRecyclableViews = null;

    public void addEventEmitters(QZL qzl, View view) {
    }

    public abstract ReactShadowNode createShadowNodeInstance();

    public abstract View createViewInstance(QZL qzl);

    public Map getCommandsMap() {
        return null;
    }

    public X62 getDelegate() {
        return null;
    }

    public Map getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map getExportedViewConstants() {
        return null;
    }

    public abstract String getName();

    public abstract Class getShadowNodeClass();

    public long measure(Context context, XCN xcn, XCN xcn2, XCN xcn3, float f, C245103cK r8, float f2, C245103cK r10, float[] fArr) {
        return 0;
    }

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, C245103cK r8, float f2, C245103cK r10, float[] fArr) {
        return 0;
    }

    public void onAfterUpdateTransaction(View view) {
    }

    public abstract View prepareToRecycleView(QZL qzl, View view);

    @Deprecated
    public void receiveCommand(View view, int i, ReadableArray readableArray) {
    }

    public View recycleView(QZL qzl, View view) {
        return view;
    }

    public void setPadding(View view, int i, int i2, int i3, int i4) {
    }

    public abstract void updateExtraData(View view, Object obj);

    public Object updateState(View view, C17763VfZ vfZ, C20831X0g x0g) {
        return null;
    }

    private Stack getRecyclableViewStack(int i, boolean z) {
        HashMap hashMap = this.mRecyclableViews;
        if (hashMap == null) {
            return null;
        }
        if (z) {
            Integer valueOf = Integer.valueOf(i);
            if (!hashMap.containsKey(valueOf)) {
                this.mRecyclableViews.put(valueOf, new Stack());
            }
        }
        return (Stack) C51968G9o.A0z(this.mRecyclableViews, i);
    }

    public View createViewInstance(int i, QZL qzl, C17763VfZ vfZ, C20831X0g x0g) {
        View createViewInstance;
        Object updateState;
        Stack recyclableViewStack = getRecyclableViewStack(qzl.A00, true);
        if (recyclableViewStack == null || recyclableViewStack.empty()) {
            createViewInstance = createViewInstance(qzl);
        } else {
            createViewInstance = (View) recyclableViewStack.pop();
        }
        createViewInstance.setId(i);
        addEventEmitters(qzl, createViewInstance);
        if (vfZ != null) {
            updateProperties(createViewInstance, vfZ);
        }
        if (!(x0g == null || (updateState = updateState(createViewInstance, vfZ, x0g)) == null)) {
            updateExtraData(createViewInstance, updateState);
        }
        return createViewInstance;
    }

    public void onSurfaceStopped(int i) {
        HashMap hashMap = this.mRecyclableViews;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(i));
        }
    }

    public void setupViewRecycling() {
        if (C18401Vr3.A00.enableViewRecycling()) {
            this.mRecyclableViews = new HashMap();
        }
    }

    public void trimMemory() {
        if (this.mRecyclableViews != null) {
            this.mRecyclableViews = new HashMap();
        }
    }

    public ViewManager(QZK qzk) {
        super(qzk);
    }

    public ReactShadowNode createShadowNodeInstance(QZK qzk) {
        return createShadowNodeInstance();
    }

    public View createView(int i, QZL qzl, C17763VfZ vfZ, C20831X0g x0g, C19061WIq wIq) {
        View createViewInstance = createViewInstance(i, qzl, vfZ, x0g);
        if (createViewInstance instanceof C20829X0e) {
            ((U3r) ((C20829X0e) createViewInstance)).A03 = wIq;
        }
        return createViewInstance;
    }

    public Map getNativeProps() {
        Class<?> cls = getClass();
        Class shadowNodeClass = getShadowNodeClass();
        HashMap hashMap = new HashMap();
        Map map = C18715Vyl.A01;
        ViewManagerPropertyUpdater$Settable viewManagerPropertyUpdater$Settable = (ViewManagerPropertyUpdater$Settable) map.get(cls);
        if (viewManagerPropertyUpdater$Settable == null) {
            viewManagerPropertyUpdater$Settable = (ViewManagerPropertyUpdater$Settable) C18715Vyl.A00(cls);
            if (viewManagerPropertyUpdater$Settable == null) {
                viewManagerPropertyUpdater$Settable = new ViewManagerPropertyUpdater$FallbackViewManagerSetter(cls);
            }
            map.put(cls, viewManagerPropertyUpdater$Settable);
        }
        viewManagerPropertyUpdater$Settable.Bhz(hashMap);
        Map map2 = C18715Vyl.A00;
        ViewManagerPropertyUpdater$Settable viewManagerPropertyUpdater$Settable2 = (ViewManagerPropertyUpdater$Settable) map2.get(shadowNodeClass);
        if (viewManagerPropertyUpdater$Settable2 == null) {
            viewManagerPropertyUpdater$Settable2 = (ViewManagerPropertyUpdater$Settable) C18715Vyl.A00(shadowNodeClass);
            if (viewManagerPropertyUpdater$Settable2 == null) {
                viewManagerPropertyUpdater$Settable2 = new ViewManagerPropertyUpdater$FallbackShadowNodeSetter(shadowNodeClass);
            }
            map2.put(shadowNodeClass, viewManagerPropertyUpdater$Settable2);
        }
        viewManagerPropertyUpdater$Settable2.Bhz(hashMap);
        return hashMap;
    }

    public void onDropViewInstance(View view) {
        View prepareToRecycleView;
        String str;
        StringBuilder A0n;
        Context context = view.getContext();
        if (context == null) {
            str = NAME;
            A0n = AnonymousClass7TF.A0n("onDropViewInstance: view [");
            A0n.append(view.getId());
            A0n.append("] has a null context");
        } else if (!(context instanceof QZL)) {
            str = NAME;
            A0n = AnonymousClass7TF.A0n("onDropViewInstance: view [");
            A0n.append(view.getId());
            A0n.append("] has a context that is not a ThemedReactContext: ");
            A0n.append(context);
        } else {
            QZL qzl = (QZL) context;
            Stack recyclableViewStack = getRecyclableViewStack(qzl.A00, false);
            if (recyclableViewStack != null && (prepareToRecycleView = prepareToRecycleView(qzl, view)) != null) {
                recyclableViewStack.push(prepareToRecycleView);
                return;
            }
            return;
        }
        0I1.A03(str, A0n.toString());
    }

    public void receiveCommand(View view, String str, ReadableArray readableArray) {
        X62 delegate = getDelegate();
        if (delegate != null) {
            delegate.E6x(view, str, readableArray);
        }
    }

    public void updateProperties(View view, C17763VfZ vfZ) {
        X62 delegate = getDelegate();
        if (delegate != null) {
            Iterator entryIterator = vfZ.A00.getEntryIterator();
            while (entryIterator.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(entryIterator);
                delegate.EhN(view, A1J.getValue(), DbT.A13(A1J));
            }
        } else {
            Class<?> cls = getClass();
            Map map = C18715Vyl.A01;
            ViewManagerPropertyUpdater$ViewManagerSetter viewManagerPropertyUpdater$ViewManagerSetter = (ViewManagerPropertyUpdater$ViewManagerSetter) map.get(cls);
            if (viewManagerPropertyUpdater$ViewManagerSetter == null) {
                viewManagerPropertyUpdater$ViewManagerSetter = (ViewManagerPropertyUpdater$ViewManagerSetter) C18715Vyl.A00(cls);
                if (viewManagerPropertyUpdater$ViewManagerSetter == null) {
                    viewManagerPropertyUpdater$ViewManagerSetter = new ViewManagerPropertyUpdater$FallbackViewManagerSetter(cls);
                }
                map.put(cls, viewManagerPropertyUpdater$ViewManagerSetter);
            }
            Iterator entryIterator2 = vfZ.A00.getEntryIterator();
            while (entryIterator2.hasNext()) {
                Map.Entry A1J2 = AnonymousClass7TE.A1J(entryIterator2);
                viewManagerPropertyUpdater$ViewManagerSetter.EhM(view, this, A1J2.getValue(), DbT.A13(A1J2));
            }
        }
        onAfterUpdateTransaction(view);
    }

    public ViewManager() {
        super((QZK) null);
    }
}
