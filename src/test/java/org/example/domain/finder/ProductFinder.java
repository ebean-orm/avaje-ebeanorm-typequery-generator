package org.example.domain.finder;

import io.ebean.Finder;
import org.example.domain.Product;
import org.example.domain.query.QProduct;

public class ProductFinder extends Finder<Long,Product> {

  /**
   * Construct using the default EbeanServer.
   */
  public ProductFinder() {
    super(Product.class);
  }


  /**
   * Start a new typed query.
   */
  protected QProduct where() {
     return new QProduct(db());
  }

  /**
   * Start a new document store query.
   */
  protected QProduct text() {
     return new QProduct(db()).text();
  }
}
