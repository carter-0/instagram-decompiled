package com.facebook.react.animated;

import X.0Sd;
import X.1FH;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C10407Rrj;
import X.C10934S1n;
import X.C11346SOf;
import X.C11404SSb;
import X.C11471SaZ;
import X.C12207Sp5;
import X.C12224Spb;
import X.C13565Tck;
import X.C13773Tgo;
import X.C7824QYj;
import X.C7825QYk;
import X.C7826QYl;
import X.C7827QYm;
import X.C7828QYn;
import X.C7833Qb9;
import X.C9124RPw;
import X.JTO;
import X.Pxe;
import X.QYo;
import X.QYp;
import X.QYz;
import X.QZK;
import X.RFI;
import X.S9B;
import X.SIU;
import X.Spa;
import X.WJb;
import X.X2X;
import X.X9N;
import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.EglBase14Impl;

@ReactModule(name = "NativeAnimatedModule")
public class NativeAnimatedModule extends NativeAnimatedModuleSpec implements C13773Tgo, X2X {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean ANIMATED_MODULE_DEBUG = false;
    public final C11471SaZ mAnimatedFrameCallback;
    public boolean mBatchingControlledByJS = false;
    public volatile long mCurrentBatchNumber;
    public volatile long mCurrentFrameNumber;
    public boolean mEnqueuedAnimationOnFrame = false;
    public boolean mInitializedForFabric = false;
    public boolean mInitializedForNonFabric = false;
    public final AtomicReference mNodesManager = new AtomicReference();
    public int mNumFabricAnimations = 0;
    public int mNumNonFabricAnimations = 0;
    public final C10934S1n mOperations = new C10934S1n(this);
    public final C10934S1n mPreOperations = new C10934S1n(this);
    public final C11346SOf mReactChoreographer = S9B.A00();
    public int mUIManagerType = 1;

    /* access modifiers changed from: private */
    public void decrementInFlightAnimationsForViewTag(int i) {
        char c = 2;
        if (i % 2 != 0) {
            c = 1;
        }
        if (c == 2) {
            this.mNumFabricAnimations--;
        } else {
            this.mNumNonFabricAnimations--;
        }
        int i2 = this.mNumNonFabricAnimations;
        if (i2 == 0 && this.mNumFabricAnimations > 0 && this.mUIManagerType != 2) {
            this.mUIManagerType = 2;
        } else if (this.mNumFabricAnimations == 0 && i2 > 0 && this.mUIManagerType != 1) {
            this.mUIManagerType = 1;
        }
    }

    private void initializeLifecycleEventListenersForViewTag(int i) {
        boolean z;
        QZK A0T;
        X9N A03;
        boolean z2;
        X9N A032;
        int i2 = 2;
        if (i % 2 != 0) {
            i2 = 1;
        }
        this.mUIManagerType = i2;
        if (i2 == 2) {
            this.mNumFabricAnimations++;
        } else {
            this.mNumNonFabricAnimations++;
        }
        C11404SSb nodesManager = getNodesManager();
        if (nodesManager != null) {
            int i3 = this.mUIManagerType;
            if (i3 == 2) {
                z2 = nodesManager.A00;
            } else {
                z2 = nodesManager.A01;
            }
            if (!z2 && (A032 = UIManagerHelper.A03(nodesManager.A07, i3, true)) != null) {
                ((WJb) ((UIManagerModule) A032).mEventDispatcher).A0B.add(nodesManager);
                if (i3 == 2) {
                    nodesManager.A00 = true;
                } else {
                    nodesManager.A01 = true;
                }
            }
        } else {
            ReactSoftExceptionLogger.logSoftException(NativeAnimatedModuleSpec.NAME, AnonymousClass7TE.A15("initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"));
        }
        if (this.mUIManagerType == 2) {
            z = this.mInitializedForFabric;
        } else {
            z = this.mInitializedForNonFabric;
        }
        if (!z && (A0T = Pxe.A0T(this)) != null && (A03 = UIManagerHelper.A03(A0T, this.mUIManagerType, true)) != null) {
            A03.addUIManagerEventListener(this);
            if (this.mUIManagerType == 2) {
                this.mInitializedForFabric = true;
            } else {
                this.mInitializedForNonFabric = true;
            }
        }
    }

    public void addAnimatedEventToView(double d, String str, ReadableMap readableMap) {
        int i = (int) d;
        initializeLifecycleEventListenersForViewTag(i);
        addOperation(new C7827QYm(this, readableMap, str, i));
    }

    public void addListener(String str) {
    }

    public void connectAnimatedNodeToView(double d, double d2) {
        int i = (int) d2;
        initializeLifecycleEventListenersForViewTag(i);
        addOperation(new C7826QYl(this, (int) d, i, 2));
    }

    public void connectAnimatedNodes(double d, double d2) {
        addOperation(new C7826QYl(this, (int) d, (int) d2, 0));
    }

    public void createAnimatedNode(double d, ReadableMap readableMap) {
        addOperation(new QYp(this, readableMap, (int) d, 2));
    }

    public void didMountItems(X9N x9n) {
    }

    public void disconnectAnimatedNodeFromView(double d, double d2) {
        int i = (int) d2;
        decrementInFlightAnimationsForViewTag(i);
        addOperation(new C7826QYl(this, (int) d, i, 3));
    }

    public void disconnectAnimatedNodes(double d, double d2) {
        addOperation(new C7826QYl(this, (int) d, (int) d2, 1));
    }

    public void dropAnimatedNode(double d) {
        addOperation(new C7824QYj(this, (int) d, 5));
    }

    public void extractAnimatedNodeOffset(double d) {
        addOperation(new C7824QYj(this, (int) d, 1));
    }

    public void finishOperationBatch() {
        this.mBatchingControlledByJS = false;
        this.mCurrentBatchNumber++;
    }

    public void flattenAnimatedNodeOffset(double d) {
        addOperation(new C7824QYj(this, (int) d, 0));
    }

    public void getValue(double d, Callback callback) {
        addOperation(new QYp(this, callback, (int) d));
    }

    public void removeAnimatedEventFromView(double d, String str, double d2) {
        int i = (int) d;
        decrementInFlightAnimationsForViewTag(i);
        addOperation(new C7828QYn(this, str, i, (int) d2));
    }

    public void removeListeners(double d) {
    }

    public void restoreDefaultValues(double d) {
        addPreOperation(new C7824QYj(this, (int) d, 3));
    }

    public void setAnimatedNodeOffset(double d, double d2) {
        addOperation(new C7825QYk(this, d2, (int) d, 1));
    }

    public void setAnimatedNodeValue(double d, double d2) {
        addOperation(new C7825QYk(this, d2, (int) d, 0));
    }

    public void startAnimatingNode(double d, double d2, ReadableMap readableMap, Callback callback) {
        Callback callback2 = callback;
        addUnbatchedOperation(new QYo(this, callback2, readableMap, (int) d, (int) d2));
    }

    public void startListeningToAnimatedNodeValue(double d) {
        int i = (int) d;
        addOperation(new QYp((C13565Tck) new C12207Sp5(this, i), this, i));
    }

    public void startOperationBatch() {
        this.mBatchingControlledByJS = true;
        this.mCurrentBatchNumber++;
    }

    public void stopAnimation(double d) {
        addOperation(new C7824QYj(this, (int) d, 2));
    }

    public void stopListeningToAnimatedNodeValue(double d) {
        addOperation(new C7824QYj(this, (int) d, 4));
    }

    public void updateAnimatedNodeConfig(double d, ReadableMap readableMap) {
        addOperation(new QYp(this, readableMap, (int) d, 3));
    }

    public void willMountItems(X9N x9n) {
    }

    private void addOperation(C10407Rrj rrj) {
        rrj.A00 = this.mCurrentBatchNumber;
        this.mOperations.A01.add(rrj);
    }

    private void addPreOperation(C10407Rrj rrj) {
        rrj.A00 = this.mCurrentBatchNumber;
        this.mPreOperations.A01.add(rrj);
    }

    private void addUnbatchedOperation(C10407Rrj rrj) {
        rrj.A00 = -1;
        this.mOperations.A01.add(rrj);
    }

    private void clearFrameCallback() {
        C11346SOf sOf = this.mReactChoreographer;
        0Sd.A00(sOf);
        sOf.A03(this.mAnimatedFrameCallback, RFI.NATIVE_ANIMATED_MODULE);
        this.mEnqueuedAnimationOnFrame = false;
    }

    /* access modifiers changed from: private */
    public void enqueueFrameCallback() {
        if (!this.mEnqueuedAnimationOnFrame) {
            C11346SOf sOf = this.mReactChoreographer;
            0Sd.A00(sOf);
            sOf.A02(this.mAnimatedFrameCallback, RFI.NATIVE_ANIMATED_MODULE);
            this.mEnqueuedAnimationOnFrame = true;
        }
    }

    public void didDispatchMountItems(X9N x9n) {
        if (this.mUIManagerType == 2) {
            long j = this.mCurrentBatchNumber - 1;
            if (!this.mBatchingControlledByJS) {
                this.mCurrentFrameNumber++;
                if (this.mCurrentFrameNumber - this.mCurrentBatchNumber > 2) {
                    this.mCurrentBatchNumber = this.mCurrentFrameNumber;
                    j = this.mCurrentBatchNumber;
                }
            }
            this.mPreOperations.A00(getNodesManager(), j);
            this.mOperations.A00(getNodesManager(), j);
        }
    }

    public void didScheduleMountItems(X9N x9n) {
        this.mCurrentFrameNumber++;
    }

    public C11404SSb getNodesManager() {
        QZK reactApplicationContextIfActiveOrWarn;
        if (this.mNodesManager.get() == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            1FH.A00((Object) null, new C11404SSb(reactApplicationContextIfActiveOrWarn), this.mNodesManager);
        }
        return (C11404SSb) this.mNodesManager.get();
    }

    public void setNodesManager(C11404SSb sSb) {
        this.mNodesManager.set(sSb);
    }

    public void userDrivenScrollEnded(int i) {
        int i2;
        List<SIU> list;
        C11404SSb sSb = (C11404SSb) this.mNodesManager.get();
        if (sSb != null) {
            HashSet A1F = AnonymousClass7TE.A1F();
            ListIterator listIterator = sSb.A08.listIterator();
            while (listIterator.hasNext()) {
                EventAnimationDriver eventAnimationDriver = (EventAnimationDriver) listIterator.next();
                if (eventAnimationDriver != null && "topScrollEnded".equals(eventAnimationDriver.eventName) && i == (i2 = eventAnimationDriver.viewTag)) {
                    AnonymousClass7TF.A1M(A1F, i2);
                    QYz qYz = eventAnimationDriver.valueNode;
                    if (!(qYz == null || (list = qYz.A03) == null)) {
                        for (SIU siu : list) {
                            AnonymousClass7TF.A1M(A1F, siu.A02);
                        }
                    }
                }
            }
            if (!A1F.isEmpty()) {
                WritableNativeArray writableNativeArray = new WritableNativeArray();
                Iterator it = A1F.iterator();
                while (it.hasNext()) {
                    writableNativeArray.pushInt(AnonymousClass7TG.A0F(it));
                }
                WritableNativeMap A0U = Pxe.A0U();
                A0U.putArray("tags", writableNativeArray);
                QZK reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
                if (reactApplicationContextIfActiveOrWarn != null) {
                    reactApplicationContextIfActiveOrWarn.A0E("onUserDrivenAnimationEnded", A0U);
                }
            }
        }
    }

    public void willDispatchViewUpdates(X9N x9n) {
        C10934S1n s1n = this.mOperations;
        if (s1n.A01.isEmpty() && s1n.A00 == null) {
            C10934S1n s1n2 = this.mPreOperations;
            if (s1n2.A01.isEmpty() && s1n2.A00 == null) {
                return;
            }
        }
        if (this.mUIManagerType != 2) {
            long j = this.mCurrentBatchNumber;
            this.mCurrentBatchNumber = 1 + j;
            Spa spa = new Spa(this, j);
            C12224Spb spb = new C12224Spb(this, j);
            UIManagerModule uIManagerModule = (UIManagerModule) x9n;
            uIManagerModule.prependUIBlock(spa);
            uIManagerModule.addUIBlock(spb);
        }
    }

    public NativeAnimatedModule(QZK qzk) {
        super(qzk);
        this.mAnimatedFrameCallback = new C7833Qb9(this, qzk);
    }

    public void initialize() {
        Pxe.A0T(this).A09(this);
    }

    public void invalidate() {
        Pxe.A0T(this).A0A(this);
    }

    public void onHostDestroy() {
        clearFrameCallback();
    }

    public void onHostPause() {
        clearFrameCallback();
    }

    public void onHostResume() {
        enqueueFrameCallback();
    }

    public void queueAndExecuteBatchedOperations(ReadableArray readableArray) {
        int size = readableArray.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            int i3 = readableArray.getInt(i);
            Integer[] numArr = C9124RPw.A00;
            if (numArr == null) {
                numArr = AnonymousClass05K.A00(21);
                C9124RPw.A00 = numArr;
            }
            switch (JTO.A0A(numArr, i3 - 1)) {
                case 0:
                case 1:
                case 5:
                case 6:
                case 9:
                case 10:
                case 14:
                    i = i2 + 2;
                    break;
                case 2:
                case 3:
                case 4:
                case 8:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                case 15:
                case 16:
                case 19:
                case 20:
                    i = i2 + 1;
                    break;
                case 7:
                case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                    i = i2 + 3;
                    break;
                case 13:
                    int i4 = i2 + 1;
                    i = i4 + 1;
                    initializeLifecycleEventListenersForViewTag(readableArray.getInt(i4));
                    break;
                case 17:
                    initializeLifecycleEventListenersForViewTag(readableArray.getInt(i2));
                    i = i2 + 1 + 1 + 1;
                    break;
                default:
                    throw AnonymousClass7TE.A0w("Batch animation execution op: fetching viewTag: unknown op code");
            }
        }
        startOperationBatch();
        addUnbatchedOperation(new QYp(this, readableArray, size));
        finishOperationBatch();
    }
}
