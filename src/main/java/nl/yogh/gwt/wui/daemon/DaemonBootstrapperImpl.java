package nl.yogh.gwt.wui.daemon;

import nl.yogh.gwt.wui.dev.DevelopmentObserver;
import nl.yogh.gwt.wui.util.EventBusProxy;

public class DaemonBootstrapperImpl extends EventBusProxy implements DaemonBootstrapper {
  private final ExceptionDaemon exceptionDaemon;
  private final DevelopmentObserver observer;

  public DaemonBootstrapperImpl(final ExceptionDaemon exceptionDaemon, final DevelopmentObserver observer) {
    this.exceptionDaemon = exceptionDaemon;
    this.observer = observer;
  }

  @Override
  public void init() {
    exceptionDaemon.init();
    observer.init();
  }
}