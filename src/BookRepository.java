public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
